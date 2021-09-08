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
 */
public class HistoricalPriceParam extends RequestParam {
    /**
     * Symbol Slug.
     */
    private String slug;

    /**
     * Start Time，unit: mills, default min timestamp
     */
    private Long start;

    /**
     * End Time，unit: mills，default current timestamp
     */
    private Long end;

    /**
     * Interval[5m,15m,30m,1h,2h,6h,12h,1d,2d], default calculated based on start, end
     */
    private Interval interval;

    protected HistoricalPriceParam(HistoricalPriceParamBuilder<?, ?> b) {
        super(b);
        this.slug = b.slug;
        this.start = b.start;
        this.end = b.end;
        this.interval = b.interval;
    }

    public static HistoricalPriceParamBuilder<?, ?> builder() {
        return new HistoricalPriceParamBuilderImpl();
    }

    public String getSlug() {
        return this.slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
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

    public Interval getInterval() {
        return this.interval;
    }

    public void setInterval(Interval interval) {
        this.interval = interval;
    }

    public String toString() {
        return "HistoricalPriceParam(slug=" + this.getSlug() + ", start=" + this.getStart() + ", end=" + this.getEnd() + ", interval=" + this.getInterval() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof HistoricalPriceParam)) return false;
        final HistoricalPriceParam other = (HistoricalPriceParam) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$slug = this.getSlug();
        final Object other$slug = other.getSlug();
        if (this$slug == null ? other$slug != null : !this$slug.equals(other$slug)) return false;
        final Object this$start = this.getStart();
        final Object other$start = other.getStart();
        if (this$start == null ? other$start != null : !this$start.equals(other$start)) return false;
        final Object this$end = this.getEnd();
        final Object other$end = other.getEnd();
        if (this$end == null ? other$end != null : !this$end.equals(other$end)) return false;
        final Object this$interval = this.getInterval();
        final Object other$interval = other.getInterval();
        if (this$interval == null ? other$interval != null : !this$interval.equals(other$interval)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof HistoricalPriceParam;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $slug = this.getSlug();
        result = result * PRIME + ($slug == null ? 43 : $slug.hashCode());
        final Object $start = this.getStart();
        result = result * PRIME + ($start == null ? 43 : $start.hashCode());
        final Object $end = this.getEnd();
        result = result * PRIME + ($end == null ? 43 : $end.hashCode());
        final Object $interval = this.getInterval();
        result = result * PRIME + ($interval == null ? 43 : $interval.hashCode());
        return result;
    }

    public static abstract class HistoricalPriceParamBuilder<C extends HistoricalPriceParam, B extends HistoricalPriceParamBuilder<C, B>> extends RequestParamBuilder<C, B> {
        private String slug;
        private Long start;
        private Long end;
        private Interval interval;

        public B slug(String slug) {
            this.slug = slug;
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

        public B interval(Interval interval) {
            this.interval = interval;
            return self();
        }

        protected abstract B self();

        public abstract C build();

        public String toString() {
            return "HistoricalPriceParam.HistoricalPriceParamBuilder(super=" + super.toString() + ", slug=" + this.slug + ", start=" + this.start + ", end=" + this.end + ", interval=" + this.interval + ")";
        }
    }

    private static final class HistoricalPriceParamBuilderImpl extends HistoricalPriceParamBuilder<HistoricalPriceParam, HistoricalPriceParamBuilderImpl> {
        private HistoricalPriceParamBuilderImpl() {
        }

        protected HistoricalPriceParamBuilderImpl self() {
            return this;
        }

        public HistoricalPriceParam build() {
            return new HistoricalPriceParam(this);
        }
    }
}
