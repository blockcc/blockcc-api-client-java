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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * {"op":"topics"}
 * {"op":"subscribe","args":["price:bitcoin","ticker:gate-io_BTC_USDT"]}
 * {"op":"unsubscribe","args":["price:bitcoin"]}
 *
 * @author xiaochuanzhi
 *
 */
@Data
@Builder
public class InputMessage implements OutputMessage {

    @JsonProperty("op")
    private Operation operation;

    @JsonProperty("args")
    private List<String> args;


    @Override
    public String toMessageString() {
        ObjectMapper mapper = new ObjectMapper();

        try {
            if (args == null) {
                return "{\"op\":" + '\"' + operation + "\"}";
            }
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return "{}";
        }
    }
}
