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
import cc.block.data.api.domain.market.Symbol;
import cc.block.data.api.domain.market.request.SymbolParam;
import static cc.block.data.api.examples.config.TestConstants.API_KEY;
import static cc.block.data.api.examples.config.TestConstants.HOST;
/**
 * @author lijiaxing
 * @date 2020/10/20
 * @see BlockccApiRestClient#getSymbols(SymbolParam) (cc.block.api.client.aomain.market.request.SymbolParams)
 * example for fetch Symbols
 */
public class SymbolsExample {
    public static void main(String[] args) {
        BlockccApiClientFactory factory = BlockccApiClientFactory.newInstance(API_KEY,HOST);
        BlockccApiRestClient client = factory.newRestClient();
        SymbolParam symbolParams = SymbolParam.builder().details(false).build();
        for (Symbol symbol : client.getSymbols(symbolParams).getContent()) {
            System.out.println(symbol);
        }
    }
}
