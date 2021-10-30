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
import cc.block.data.api.BlockccApiWebSocketClient;
import cc.block.data.api.bean.InputMessage;
import cc.block.data.api.bean.Operation;
import cc.block.data.api.bean.Topic;
import cc.block.data.api.bean.TopicType;

import java.util.ArrayList;
import java.util.List;
import static cc.block.data.api.examples.config.TestConstants.API_KEY;
import static cc.block.data.api.examples.config.TestConstants.HOST;
/**
 * @author lijiaxing
 * @date 2020/10/23
 * example for price stream with slug
 */
public class PricesStreamExample {
    public static void main(String[] args) {
        BlockccApiWebSocketClient client = BlockccApiClientFactory.newInstance(API_KEY,HOST).newWebSocketClient();
        List<String> priceArgs = new ArrayList<>();
        priceArgs.add(Topic.builder().type(TopicType.price).desc("bitcoin").build().toTopicString());
        priceArgs.add(Topic.builder().type(TopicType.price).desc("uniswap").build().toTopicString());
        client.getPrices(System.out::println, InputMessage.builder()
                .operation(Operation.subscribe)
                .args(priceArgs)
                .build().toMessageString());
    }
}
