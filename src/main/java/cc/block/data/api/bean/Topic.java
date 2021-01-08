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

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author xiaochuanzhi
 *
 */
@Data
@EqualsAndHashCode
@Builder
public class Topic {
    TopicType type;
    String desc;

    public Topic(TopicType type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    /**
     * parse String to Topic
     * exp: "ticker:gate-io_BTC_ETH"
     *
     * @param s topic String
     * @return Topic
     */
    public static Topic parse(String s) {
        String[] arr = s.split(":");
        TopicType topicType = TopicType.parse(arr[0]);
        if (topicType == null) {
            return null;
        }
        String slug = arr[1];
        return new Topic(topicType, slug);
    }

    public static Set<Topic> parse(Collection<String> list) {
        Set<Topic> topics = new HashSet<>();
        for (String topicStr : list) {
            Topic topic = parse(topicStr);
            if (topic != null) {
                topics.add(topic);
            }
        }
        return topics;
    }

    public String toTopicString() {
        return type + ":" + desc;
    }
}
