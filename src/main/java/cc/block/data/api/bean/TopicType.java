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

package cc.block.data.api.bean;

/**
 * @author xiaochuanzhi
 */
public enum TopicType {
    /**
     * price
     */
    price,
    /**
     * ticker
     */
    ticker,
    /**
     * depth
     */
    orderbook;


    public static TopicType parse(String s) {
        for (TopicType topicType : TopicType.values()) {
            if (s.equalsIgnoreCase(topicType.name())) {
                return topicType;
            }
        }
        return null;
    }


}
