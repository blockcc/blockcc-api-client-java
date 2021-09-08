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

package cc.block.data.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author lijiaxing
 * <p>
 * Api Error Code
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockccApiError {
    /**
     * error code
     */
    @JsonProperty("c")
    private int code = -1;

    /**
     * error message
     */
    @JsonProperty("m")
    private String msg = "Unknown Error";

    /**
     * error id
     */
    @JsonProperty("e")
    private String errorId;

    public BlockccApiError(int code, String msg, String errorId) {
        this.code = code;
        this.msg = msg;
        this.errorId = errorId;
    }

    public BlockccApiError() {
    }

    public int getCode() {
        return this.code;
    }

    @JsonProperty("c")
    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    @JsonProperty("m")
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getErrorId() {
        return this.errorId;
    }

    @JsonProperty("e")
    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BlockccApiError)) return false;
        final BlockccApiError other = (BlockccApiError) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getCode() != other.getCode()) return false;
        final Object this$msg = this.getMsg();
        final Object other$msg = other.getMsg();
        if (this$msg == null ? other$msg != null : !this$msg.equals(other$msg)) return false;
        final Object this$errorId = this.getErrorId();
        final Object other$errorId = other.getErrorId();
        if (this$errorId == null ? other$errorId != null : !this$errorId.equals(other$errorId)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BlockccApiError;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getCode();
        final Object $msg = this.getMsg();
        result = result * PRIME + ($msg == null ? 43 : $msg.hashCode());
        final Object $errorId = this.getErrorId();
        result = result * PRIME + ($errorId == null ? 43 : $errorId.hashCode());
        return result;
    }

    public String toString() {
        return "BlockccApiError(code=" + this.getCode() + ", msg=" + this.getMsg() + ", errorId=" + this.getErrorId() + ")";
    }
}
