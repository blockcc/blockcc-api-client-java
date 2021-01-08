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
import cc.block.data.api.domain.BlockccResponse;
import cc.block.data.api.domain.market.Ticker;
import cc.block.data.api.domain.market.request.TickerParam;

import java.util.List;

/**
 * @author lijiaxing
 * @date 2020/10/19
 * @see BlockccApiRestClient#getTickers(TickerParam) (com.Blockcc.api.client.domain.market.request.TickerParams)
 * example for fetch tickers
 * Get BTC tickers by tickerParam
 */
public class TickersExample {
    public static void main(String[] args) {
        BlockccApiClientFactory factory = BlockccApiClientFactory.newInstance("YOU_API_KEY");
        BlockccApiRestClient client = factory.newRestClient();

        boolean hasNextPage = true;
        TickerParam tickerParams = TickerParam.builder().slug("bitcoin").size(100).build();
        while (hasNextPage) {
            BlockccResponse<List<Ticker>> tickerResponse = client.getTickers(tickerParams);
            hasNextPage = tickerResponse.hasNextPage();
            for (Ticker ticker : tickerResponse.getContent()) {
                System.out.println(ticker);
            }
            tickerParams.nextPage();
        }
    }
}
