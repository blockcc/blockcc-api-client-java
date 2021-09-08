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

package cc.block.data.api.domain;

import cc.block.data.api.bean.OutputMessage;
import cc.block.data.api.bean.Topic;
import cc.block.data.api.domain.market.OrderBook;
import cc.block.data.api.domain.market.Price;
import cc.block.data.api.domain.market.Ticker;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Objects;

/**
 * @author lijiaxing
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Event<T> implements OutputMessage {

    /**
     * websocket response message code
     */
    @JsonProperty("code")
    private Integer code;

    /**
     * websocket response message
     */
    @JsonProperty("message")
    private String message;

    /**
     * websocket response topic
     */
    @JsonProperty("topic")
    private String topic;

    /**
     * websocket response data
     */
    @JsonProperty("data")
    private T data;

    public Event() {
    }

    @Override
    public String toString() {
        return "{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", topic='" + topic + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public String toMessageString() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            if (data == null) {
                return mapper.writeValueAsString(this);
            }
            switch (Objects.requireNonNull(Topic.parse(this.topic)).getType()) {
                case ticker:
                    return mapper.readValue(mapper.writeValueAsString(data), Ticker.class).toString();
                case orderbook:
                    return mapper.readValue(mapper.writeValueAsString(data), OrderBook.class).toString();
                case price:
                    return mapper.readValue(mapper.writeValueAsString(data), Price.class).toString();
                default:
                    return mapper.writeValueAsString(this);
            }
        } catch (IOException e) {
            return "{}";
        }
    }

    public Integer getCode() {
        return this.code;
    }

    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public String getTopic() {
        return this.topic;
    }

    @JsonProperty("topic")
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public T getData() {
        return this.data;
    }

    @JsonProperty("data")
    public void setData(T data) {
        this.data = data;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Event)) return false;
        final Event<?> other = (Event<?>) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$code = this.getCode();
        final Object other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
        final Object this$message = this.getMessage();
        final Object other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) return false;
        final Object this$topic = this.getTopic();
        final Object other$topic = other.getTopic();
        if (this$topic == null ? other$topic != null : !this$topic.equals(other$topic)) return false;
        final Object this$data = this.getData();
        final Object other$data = other.getData();
        if (this$data == null ? other$data != null : !this$data.equals(other$data)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Event;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $code = this.getCode();
        result = result * PRIME + ($code == null ? 43 : $code.hashCode());
        final Object $message = this.getMessage();
        result = result * PRIME + ($message == null ? 43 : $message.hashCode());
        final Object $topic = this.getTopic();
        result = result * PRIME + ($topic == null ? 43 : $topic.hashCode());
        final Object $data = this.getData();
        result = result * PRIME + ($data == null ? 43 : $data.hashCode());
        return result;
    }
}
