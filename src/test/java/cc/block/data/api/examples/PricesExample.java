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
import cc.block.data.api.domain.market.HistoricalPrice;
import cc.block.data.api.domain.market.Price;
import cc.block.data.api.domain.market.request.HistoricalPriceParam;
import cc.block.data.api.domain.market.request.PriceParam;

import java.util.List;

/**
 * @author lijiaxing
 * @date 2020/10/
 * @see BlockccApiRestClient#getPrices(PriceParam) (cc.block.api.client.aomain.market.request.PriceParams)
 * example for fetch Prices
 */
public class PricesExample {
    public static void main(String[] args) {
        BlockccApiClientFactory factory = BlockccApiClientFactory.newInstance("YOUR_API_KEY");
        BlockccApiRestClient client = factory.newRestClient();
        PriceParam priceParams = PriceParam.builder().slug("ethereum").build();

        // Get Price
        for (Price price : client.getPrices(priceParams).getContent()) {
            System.out.println(price);
        }

        // Get History Price
        HistoricalPriceParam historicalPriceParams = HistoricalPriceParam.builder().slug("ethereum").build();
        BlockccResponse<List<HistoricalPrice>> historicalPrices = client.getHistoricalPrice(historicalPriceParams);
        for (HistoricalPrice historicalPrice : historicalPrices.getContent()) {
            System.out.println(historicalPrice);
        }
    }
}
