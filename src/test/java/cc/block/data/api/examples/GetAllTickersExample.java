/*
 * Copyright (c) 2020. Block.cc Inc @ https://block.cc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package cc.block.data.api.examples;

import cc.block.data.api.BlockccApiClientFactory;
import cc.block.data.api.BlockccApiRestClient;
import cc.block.data.api.domain.market.Ticker;
import cc.block.data.api.domain.market.request.TickerParam;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijiaxing
 * @date 2020/10/19
 * @see BlockccApiRestClient#getTickers(TickerParam) (com.Blockcc.api.client.domain.market.request.TickerParams)
 * example for Get all gate-io's Tickers
 */
public class GetAllTickersExample {
    public static void main(String[] args) throws InterruptedException {
        BlockccApiClientFactory factory = BlockccApiClientFactory.newInstance("YOUR_API_KEY");
        BlockccApiRestClient client = factory.newRestClient();

//       Get tickers by tickerParam
        var tickerParams = TickerParam.builder()
                .market("gate-io")
                .size(100).build();

        boolean hasNextPage = true;
        List<Ticker> tickers = new ArrayList<>();
        while (hasNextPage) {
            var tickerResponse = client.getTickers(tickerParams);
            tickers.addAll(tickerResponse.getContent());
            hasNextPage = tickerResponse.hasNextPage();
            tickerParams.nextPage();
            Thread.sleep(500);
        }

        System.out.println("Tickers size:" + tickers.size());
        System.out.println("Highest Volume Ticker:" + tickers.get(0));
        System.out.println("Lowest Volume Ticker:" + tickers.get(tickers.size() - 1));

    }
}
