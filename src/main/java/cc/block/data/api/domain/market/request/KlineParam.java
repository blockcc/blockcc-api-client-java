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
import cc.block.data.api.domain.enumeration.Interval;

/**
 * @author lijiaxing
 * <p>
 * Kline Request Parameter
 */

public class KlineParam extends RequestParam {

    /**
     * desc MarketPair Desc e.g. gate-io_BTC_USDT
     */
    private String desc;

    /**
     * interval:kline type
     */
    private Interval interval;

    /**
     * start time
     */
    private Long start;

    /**
     * end time
     */
    private Long end;

    protected KlineParam(KlineParamBuilder<?, ?> b) {
        super(b);
        this.desc = b.desc;
        this.interval = b.interval;
        this.start = b.start;
        this.end = b.end;
    }

    public static KlineParamBuilder<?, ?> builder() {
        return new KlineParamBuilderImpl();
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Interval getInterval() {
        return this.interval;
    }

    public void setInterval(Interval interval) {
        this.interval = interval;
    }

    public Long getStart() {
        return this.start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getEnd() {
        return this.end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    public String toString() {
        return "KlineParam(desc=" + this.getDesc() + ", interval=" + this.getInterval() + ", start=" + this.getStart() + ", end=" + this.getEnd() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof KlineParam)) return false;
        final KlineParam other = (KlineParam) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$desc = this.getDesc();
        final Object other$desc = other.getDesc();
        if (this$desc == null ? other$desc != null : !this$desc.equals(other$desc)) return false;
        final Object this$interval = this.getInterval();
        final Object other$interval = other.getInterval();
        if (this$interval == null ? other$interval != null : !this$interval.equals(other$interval)) return false;
        final Object this$start = this.getStart();
        final Object other$start = other.getStart();
        if (this$start == null ? other$start != null : !this$start.equals(other$start)) return false;
        final Object this$end = this.getEnd();
        final Object other$end = other.getEnd();
        if (this$end == null ? other$end != null : !this$end.equals(other$end)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof KlineParam;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $desc = this.getDesc();
        result = result * PRIME + ($desc == null ? 43 : $desc.hashCode());
        final Object $interval = this.getInterval();
        result = result * PRIME + ($interval == null ? 43 : $interval.hashCode());
        final Object $start = this.getStart();
        result = result * PRIME + ($start == null ? 43 : $start.hashCode());
        final Object $end = this.getEnd();
        result = result * PRIME + ($end == null ? 43 : $end.hashCode());
        return result;
    }

    public static abstract class KlineParamBuilder<C extends KlineParam, B extends KlineParamBuilder<C, B>> extends RequestParamBuilder<C, B> {
        private String desc;
        private Interval interval;
        private Long start;
        private Long end;

        public B desc(String desc) {
            this.desc = desc;
            return self();
        }

        public B interval(Interval interval) {
            this.interval = interval;
            return self();
        }

        public B start(Long start) {
            this.start = start;
            return self();
        }

        public B end(Long end) {
            this.end = end;
            return self();
        }

        protected abstract B self();

        public abstract C build();

        public String toString() {
            return "KlineParam.KlineParamBuilder(super=" + super.toString() + ", desc=" + this.desc + ", interval=" + this.interval + ", start=" + this.start + ", end=" + this.end + ")";
        }
    }

    private static final class KlineParamBuilderImpl extends KlineParamBuilder<KlineParam, KlineParamBuilderImpl> {
        private KlineParamBuilderImpl() {
        }

        protected KlineParamBuilderImpl self() {
            return this;
        }

        public KlineParam build() {
            return new KlineParam(this);
        }
    }
}
