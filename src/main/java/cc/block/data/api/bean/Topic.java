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

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author xiaochuanzhi
 *
 */
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

    public static TopicBuilder builder() {
        return new TopicBuilder();
    }

    public String toTopicString() {
        return type + ":" + desc;
    }

    public TopicType getType() {
        return this.type;
    }

    public void setType(TopicType type) {
        this.type = type;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String toString() {
        return "Topic(type=" + this.getType() + ", desc=" + this.getDesc() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Topic)) return false;
        final Topic other = (Topic) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$desc = this.getDesc();
        final Object other$desc = other.getDesc();
        if (this$desc == null ? other$desc != null : !this$desc.equals(other$desc)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Topic;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $desc = this.getDesc();
        result = result * PRIME + ($desc == null ? 43 : $desc.hashCode());
        return result;
    }

    public static class TopicBuilder {
        private TopicType type;
        private String desc;

        TopicBuilder() {
        }

        public TopicBuilder type(TopicType type) {
            this.type = type;
            return this;
        }

        public TopicBuilder desc(String desc) {
            this.desc = desc;
            return this;
        }

        public Topic build() {
            return new Topic(type, desc);
        }

        public String toString() {
            return "Topic.TopicBuilder(type=" + this.type + ", desc=" + this.desc + ")";
        }
    }
}
