# Java Blockcc API

Blockcc-java-api 是一个轻量级Java库用于[Blockcc API](https://blockcc.gitee.io/blockcc-api-document/zh_CN/),
提供完整的API覆盖,提供完整的API覆盖，支持同步请求，以及使用WebSockets的事件流

## 语言

简体中文|[English](https://github.com/blockcc/blockcc-api-client-java/blob/master/README.md)

## 特性

- 海量数据
  
  我们的数据包括加密货币交易数据，K线数据，深度数据，区块链数据，历史数据。并且通过人工清洗确保数据的完整性和准确性。

- 高性能

  我们的基础架构在多个数据中心的多个服务器上运行，以确保最快的数据传输和最低的延迟。 我们拥有冗余托管和负载均衡环境，可实现最高可靠性。

- 安全可靠

  我们的API采用SSL协议实现网络通信加密，保障数据在传输的过程中不被篡改或窃取。

## 安装

1. 通过运行`mvn install`将库安装到Maven的本地存储库中。

2. 在您的项目中添加以下依赖 `pom.xml`:

   ```xml
   <dependency>
       <groupId>cc.block.data</groupId>
       <artifactId>blockcc-api-client</artifactId>
       <version>1.0.1</version>
   </dependency>
   ```

   然后，您可以克隆并且运行这些示例程序 [examples](https://github.com/blockcc/blockcc-api-client-java/tree/master/src/test/java/cc/block/data/api/examples)
   .

## 示例

### 入门

可以使用主要的客户端类与API进行交互： [`BlockccApiRestClient`](https://github.com/blockcc/blockcc-api-client-java/blob/master/src/main/java/cc/block/data/api/BlockccApiRestClient.java) , 一个同步 [Blockcc API](https://blockcc.gitee.io/blockcc-api-document/zh_CN/#rest-api-2) 客户端;

这些可以通过相应的工厂方法实例化 [`BlockccApiClientFactory`](https://github.com/blockcc/blockcc-api-client-java/blob/master/src/main/java/cc/block/data/api/BlockccApiClientFactory.java) , 通过 `API-KEY`, 可以被创建在 [https://data.Blockcc.com/account/dashboard](https://data.Blockcc.com/account/dashboard).

```java
        BlockccApiClientFactory factory = BlockccApiClientFactory.newInstance("YOU_API_KEY");
        BlockccApiRestClient client = factory.newRestClient();
```

实例化客户端后，就可以开始向API发出请求了

#### Ticker

```java
        var tickerResponse = client.getTickers(
        TickerParam.builder()
            .symbol("BTC")
            .market("gate-io")
            .build());

        for (Ticker ticker : tickerResponse.getContent()) {
            System.out.println(ticker);
        }
```

#### Markets

```java
        MarketParam marketParams = MarketParam.builder().build();

        for (Market market : client.getMarkets(marketParams).getContent()) {
            System.out.println(market);
        }
```

#### OrderBook

```java
        // need MarketPair desc
        OrderBookParam orderBookParams = OrderBookParam.builder()
                .desc("gateio_BTC_USDT")
                .build();

        System.out.println(client.getOrderBook(orderBookParams));
```

#### Price

```java
        PriceParam priceParams = PriceParam.builder().build();

        // Get Price
        for (Price price : client.getPrices(priceParams).getContent()) {
            System.out.println(price);
        }

        // Get History Price
        HistoricalPriceParam historicalPriceParams = HistoricalPriceParam.builder()
                                                            .slug("ethereum")
                                                            .build();

        BlockccResponse<List<HistoricalPrice>> historicalPrices = client.getHistoricalPrice(historicalPriceParams);
        
        for (HistoricalPrice historicalPrice : historicalPrices.getContent()) {
            System.out.println(historicalPrice);
        }
```

#### Symbol

```java
        SymbolParam symbolParams = SymbolParam.builder()
                                            .details(false)
                                            .build();

        for (Symbol symbol : client.getSymbols(symbolParams).getContent()) {
                                            System.out.println(symbol);
        }
```

#### Kline

```java
        // MarketPair desc is required
        KlineParam klineParams = KlineParam.builder()
                .interval(Interval.ONE_DAY)
                .desc("gate-io_BTC_USDT")
                .build();

        for (Kline kline : client.getKline(klineParams).getContent()) {
                System.out.println(kline);
        }
```

## WebSocket API

### Initialize the WebSocket Client

```java
    BlockccApiWebSocketClient webSocketClient = BlockccApiClientFactory
                                                  .newInstance("YOU_API_KEY").newWebSocketClient();
```

#### Ticker Stream Example

```java
        // 1.build topic list
        List<String> list = new ArrayList<>();
        list.add(Topic.builder()
                .type(TopicType.ticker)
                .desc("uniswap_BTC_ETH")
                .build()
                .toTopicString());

        // 2.connect 
        webSocketClient.getTickers(System.out::println,
        InputMessage.builder()
                .operation(Operation.subscribe)
                .args(list)
                .build().toMessageString());
        }
```

#### Price Stream Example

```java
        List<String> priceArgs = new ArrayList<>();

        // add Topic Message
        priceArgs.add(Topic.builder()
                    .type(TopicType.price)
                    .desc("bitcoin")
                    .build()
                    .toTopicString());
        
        priceArgs.add(Topic.builder()
                    .type(TopicType.price)
                    .desc("uniswap")
                    .build()
                    .toTopicString());

        // get Price connetion
        webSocketClient.getPrices(System.out::println,
        
        InputMessage.builder()
                    .operation(Operation.subscribe)
                    .args(priceArgs)
                    .build()
                    .toMessageString());
```

#### OrderBook Stream Example

```java
        List<String> orderBookArgs = new ArrayList<>();

        // add OrderBook subcribe message list
        orderBookArgs.add(Topic.builder()
                                .type(TopicType.orderbook)
                                .desc("gate-io_BTC_USDT").build()
                                .toTopicString());

        orderBookArgs.add(Topic.builder()
                                .type(TopicType.orderbook)
                                .desc("binance_BNB_USDT")
                                .build()
                                .toTopicString());

        orderBookArgs.add(Topic.builder()
                                .type(TopicType.orderbook)
                                .desc("huobipro_HT_USDT")
                                .build()
                                .toTopicString());

        // get connection
        client.getOrderBooks(System.out::println, InputMessage.builder()
                                .operation(Operation.subscribe)
                                .args(orderBookArgs)
                                .build()
                                .toMessageString());
```

#### 关闭 web sockets

每个在`BlockccApiWebSocketClient`的方法,会开启一个新的`socket`,也返回一个 `Closeable`. 这些 `Closeable` 可以用来关闭底层的 `Web socket`并释放任何相关的资源,
e.g.

```java
    Closable ws=client.getConnection(someCallback,"msg");
        // some time later...
        ws.close();
```

### 更多示例

可以在以下位置找到涵盖API大部分方面的大量示例： https://github.com/blockcc/blockcc-api-client-java/tree/master/src/test/java/cc/block/data/api/examples
.
