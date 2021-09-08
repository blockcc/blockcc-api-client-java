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

import cc.block.data.api.domain.PageableParam;

/**
 * @author lijiaxing
 * <p>
 * Price Request Parameter
 */

public class PriceParam extends PageableParam {
    /**
     * Currency slug, comma-separated
     */
    private String slug;

    /**
     * symbol
     */
    private String symbol;

    protected PriceParam(PriceParamBuilder<?, ?> b) {
        super(b);
        this.slug = b.slug;
        this.symbol = b.symbol;
    }

    public static PriceParamBuilder<?, ?> builder() {
        return new PriceParamBuilderImpl();
    }

    public String getSlug() {
        return this.slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String toString() {
        return "PriceParam(slug=" + this.getSlug() + ", symbol=" + this.getSymbol() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PriceParam)) return false;
        final PriceParam other = (PriceParam) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$slug = this.getSlug();
        final Object other$slug = other.getSlug();
        if (this$slug == null ? other$slug != null : !this$slug.equals(other$slug)) return false;
        final Object this$symbol = this.getSymbol();
        final Object other$symbol = other.getSymbol();
        if (this$symbol == null ? other$symbol != null : !this$symbol.equals(other$symbol)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PriceParam;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $slug = this.getSlug();
        result = result * PRIME + ($slug == null ? 43 : $slug.hashCode());
        final Object $symbol = this.getSymbol();
        result = result * PRIME + ($symbol == null ? 43 : $symbol.hashCode());
        return result;
    }

    public static abstract class PriceParamBuilder<C extends PriceParam, B extends PriceParamBuilder<C, B>> extends PageableParamBuilder<C, B> {
        private String slug;
        private String symbol;

        public B slug(String slug) {
            this.slug = slug;
            return self();
        }

        public B symbol(String symbol) {
            this.symbol = symbol;
            return self();
        }

        protected abstract B self();

        public abstract C build();

        public String toString() {
            return "PriceParam.PriceParamBuilder(super=" + super.toString() + ", slug=" + this.slug + ", symbol=" + this.symbol + ")";
        }
    }

    private static final class PriceParamBuilderImpl extends PriceParamBuilder<PriceParam, PriceParamBuilderImpl> {
        private PriceParamBuilderImpl() {
        }

        protected PriceParamBuilderImpl self() {
            return this;
        }

        public PriceParam build() {
            return new PriceParam(this);
        }
    }
}
