# Java Blockcc API

Blockcc-java-api is a lightweight Java library for interacting with the [Blockcc API](https://blockcc.gitee.io/blockcc-api-document/zh_CN/), providing complete API coverage, and supporting synchronous requests, as well as event streaming using WebSockets.

## Runtime Environment
JDK 1.8+

## Language

[简体中文](https://github.com/blockcc/blockcc-api-client-java/blob/master/README.zh-CN.md) |English
## Features

- EXTENSIVE DATA

  Our wide range of market data includes cryptocurrency trade data, order book data, blockchain data and historical data. We ensure the integrity and accuracy of our data through rigorous processes. 

- HIGH-PERFORMANCE INFRASTRUCTURE

  Our infrastructure is running on multiple servers across several data centres to ensure the fastest data delivery and the lowest latency possible. We have redundant hosting and load-balanced environments for maximum reliability.

- SECURE ACCESS

  Our API endpoints are encrypted through SSL so user traffic is secured when requesting data. To ensure maximum security, we also sign the API requests and require registration and the generation of an API Key. 

## Installation

1. Install library into your Maven's local repository by running `mvn install`

2. Add the following Maven dependency to your project's `pom.xml`:

   ```xml
   <dependency>
       <groupId>cc.block.data</groupId>
       <artifactId>blockcc-api-client</artifactId>
       <version>1.3.2</version>
   </dependency>
   ```

   Alternatively, you can clone this repository and run the [examples](https://github.com/blockcc/blockcc-api-client-java/tree/master/src/test/java/cc/block/data/api/examples).

## Examples

### Getting Started

There  main client classes that can be used to interact with the API:

[`BlockccApiRestClient`](https://github.com/blockcc/blockcc-api-client-java/blob/master/src/main/java/cc/block/data/api/BlockccApiRestClient.java)
, a synchronous/blocking [Blockcc API](https://blockcc.gitee.io/blockcc-api-document/en_US/#rest-api-2) client;

These can be instantiated through the corresponding factory method
of [`BlockccApiClientFactory`](https://github.com/blockcc/blockcc-api-client-java/blob/master/src/main/java/cc/block/data/api/BlockccApiClientFactory.java)
, by passing the `API-KEY`, which can be created
at [https://data.block.cc/account/dashboard](https://data.block.cc/account/dashboard). Edit TestConstants.java and
replace your api_key in order to test.

```java
        public static final String API_KEY="REPLACE_BY_YOUR_API_KEY";
```

Once the client is instantiated, it is possible to start making requests to the API.

#### Ticker

```java
        boolean hasNextPage=true;
        TickerParam tickerParams=TickerParam.builder().slug("bitcoin").size(100).build();
        while(hasNextPage){
	
        	BlockccResponse<List<Ticker>>tickerResponse = client.getTickers(tickerParams);
        	hasNextPage = tickerResponse.hasNextPage();
        	for(Ticker ticker:tickerResponse.getContent()){
        		System.out.println(ticker);
        	}
        	tickerParams.nextPage();
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
            .build().toTopicString());

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

#### Closing web sockets

Each of the methods on BlockccApiWebSocketClient, which opens a new web socket, also returns a `Closeable`.
This `Closeable` can be used to close the underlying web socket and free any associated resources, e.g.

```java
	Closable ws = client.getConnection(someCallback,"msg");
	// some time later...
	ws.close();
```

### More examples

An extensive set of examples, covering most aspects of the API, can be found at https://github.com/blockcc/blockcc-api-client-java/tree/master/src/test/java/cc/block/data/api/examples.
