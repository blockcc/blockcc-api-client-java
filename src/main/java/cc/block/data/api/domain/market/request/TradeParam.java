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

package cc.block.data.api.domain.market.request;

import cc.block.data.api.domain.RequestParam;

/**
 * @author lijiaxing
 * <p>
 * Trade Request Parameter
 */
public class TradeParam extends RequestParam {
    /**
     * desc MarketPair Desc e.g. gate-io_BTC_USDT
     */
    private String desc;

    /**
     * limit size
     */
    private Integer limit;

    protected TradeParam(TradeParamBuilder<?, ?> b) {
        super(b);
        this.desc = b.desc;
        this.limit = b.limit;
    }

    public static TradeParamBuilder<?, ?> builder() {
        return new TradeParamBuilderImpl();
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String toString() {
        return "TradeParam(desc=" + this.getDesc() + ", limit=" + this.getLimit() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TradeParam)) return false;
        final TradeParam other = (TradeParam) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$desc = this.getDesc();
        final Object other$desc = other.getDesc();
        if (this$desc == null ? other$desc != null : !this$desc.equals(other$desc)) return false;
        final Object this$limit = this.getLimit();
        final Object other$limit = other.getLimit();
        if (this$limit == null ? other$limit != null : !this$limit.equals(other$limit)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TradeParam;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $desc = this.getDesc();
        result = result * PRIME + ($desc == null ? 43 : $desc.hashCode());
        final Object $limit = this.getLimit();
        result = result * PRIME + ($limit == null ? 43 : $limit.hashCode());
        return result;
    }

    public static abstract class TradeParamBuilder<C extends TradeParam, B extends TradeParamBuilder<C, B>> extends RequestParamBuilder<C, B> {
        private String desc;
        private Integer limit;

        public B desc(String desc) {
            this.desc = desc;
            return self();
        }

        public B limit(Integer limit) {
            this.limit = limit;
            return self();
        }

        protected abstract B self();

        public abstract C build();

        public String toString() {
            return "TradeParam.TradeParamBuilder(super=" + super.toString() + ", desc=" + this.desc + ", limit=" + this.limit + ")";
        }
    }

    private static final class TradeParamBuilderImpl extends TradeParamBuilder<TradeParam, TradeParamBuilderImpl> {
        private TradeParamBuilderImpl() {
        }

        protected TradeParamBuilderImpl self() {
            return this;
        }

        public TradeParam build() {
            return new TradeParam(this);
        }
    }
}
