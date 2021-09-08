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

import java.util.List;

/**
 * {"op":"topics"}
 * {"op":"subscribe","args":["price:bitcoin","ticker:gate-io_BTC_USDT"]}
 * {"op":"unsubscribe","args":["price:bitcoin"]}
 *
 * @author xiaochuanzhi
 *
 */
public class InputMessage implements OutputMessage {

    @JsonProperty("op")
    private Operation operation;

    @JsonProperty("args")
    private List<String> args;

    InputMessage(Operation operation, List<String> args) {
        this.operation = operation;
        this.args = args;
    }

    public static InputMessageBuilder builder() {
        return new InputMessageBuilder();
    }


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

    public Operation getOperation() {
        return this.operation;
    }

    @JsonProperty("op")
    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public List<String> getArgs() {
        return this.args;
    }

    @JsonProperty("args")
    public void setArgs(List<String> args) {
        this.args = args;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof InputMessage)) return false;
        final InputMessage other = (InputMessage) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$operation = this.getOperation();
        final Object other$operation = other.getOperation();
        if (this$operation == null ? other$operation != null : !this$operation.equals(other$operation)) return false;
        final Object this$args = this.getArgs();
        final Object other$args = other.getArgs();
        if (this$args == null ? other$args != null : !this$args.equals(other$args)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof InputMessage;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $operation = this.getOperation();
        result = result * PRIME + ($operation == null ? 43 : $operation.hashCode());
        final Object $args = this.getArgs();
        result = result * PRIME + ($args == null ? 43 : $args.hashCode());
        return result;
    }

    public String toString() {
        return "InputMessage(operation=" + this.getOperation() + ", args=" + this.getArgs() + ")";
    }

    public static class InputMessageBuilder {
        private Operation operation;
        private List<String> args;

        InputMessageBuilder() {
        }

        public InputMessageBuilder operation(Operation operation) {
            this.operation = operation;
            return this;
        }

        public InputMessageBuilder args(List<String> args) {
            this.args = args;
            return this;
        }

        public InputMessage build() {
            return new InputMessage(operation, args);
        }

        public String toString() {
            return "InputMessage.InputMessageBuilder(operation=" + this.operation + ", args=" + this.args + ")";
        }
    }
}
