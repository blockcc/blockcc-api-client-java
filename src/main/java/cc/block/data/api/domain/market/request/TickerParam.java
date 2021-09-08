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
 * Ticker Request Parameter
 */
public class TickerParam extends PageableParam {

    /**
     * market name
     */
    private String market;

    /**
     * BaseCurrency Slug, comma-separated
     */
    private String slug;

    /**
     * BaseCurrency Symbol, comma-separated
     */
    private String symbol;

    /**
     * QuoteCurrency Symbol, comma-separated
     */
    private String currency;

    protected TickerParam(TickerParamBuilder<?, ?> b) {
        super(b);
        this.market = b.market;
        this.slug = b.slug;
        this.symbol = b.symbol;
        this.currency = b.currency;
    }

    public static TickerParamBuilder<?, ?> builder() {
        return new TickerParamBuilderImpl();
    }

    public String getMarket() {
        return this.market;
    }

    public void setMarket(String market) {
        this.market = market;
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

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String toString() {
        return "TickerParam(market=" + this.getMarket() + ", slug=" + this.getSlug() + ", symbol=" + this.getSymbol() + ", currency=" + this.getCurrency() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TickerParam)) return false;
        final TickerParam other = (TickerParam) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$market = this.getMarket();
        final Object other$market = other.getMarket();
        if (this$market == null ? other$market != null : !this$market.equals(other$market)) return false;
        final Object this$slug = this.getSlug();
        final Object other$slug = other.getSlug();
        if (this$slug == null ? other$slug != null : !this$slug.equals(other$slug)) return false;
        final Object this$symbol = this.getSymbol();
        final Object other$symbol = other.getSymbol();
        if (this$symbol == null ? other$symbol != null : !this$symbol.equals(other$symbol)) return false;
        final Object this$currency = this.getCurrency();
        final Object other$currency = other.getCurrency();
        if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TickerParam;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $market = this.getMarket();
        result = result * PRIME + ($market == null ? 43 : $market.hashCode());
        final Object $slug = this.getSlug();
        result = result * PRIME + ($slug == null ? 43 : $slug.hashCode());
        final Object $symbol = this.getSymbol();
        result = result * PRIME + ($symbol == null ? 43 : $symbol.hashCode());
        final Object $currency = this.getCurrency();
        result = result * PRIME + ($currency == null ? 43 : $currency.hashCode());
        return result;
    }

    public static abstract class TickerParamBuilder<C extends TickerParam, B extends TickerParamBuilder<C, B>> extends PageableParamBuilder<C, B> {
        private String market;
        private String slug;
        private String symbol;
        private String currency;

        public B market(String market) {
            this.market = market;
            return self();
        }

        public B slug(String slug) {
            this.slug = slug;
            return self();
        }

        public B symbol(String symbol) {
            this.symbol = symbol;
            return self();
        }

        public B currency(String currency) {
            this.currency = currency;
            return self();
        }

        protected abstract B self();

        public abstract C build();

        public String toString() {
            return "TickerParam.TickerParamBuilder(super=" + super.toString() + ", market=" + this.market + ", slug=" + this.slug + ", symbol=" + this.symbol + ", currency=" + this.currency + ")";
        }
    }

    private static final class TickerParamBuilderImpl extends TickerParamBuilder<TickerParam, TickerParamBuilderImpl> {
        private TickerParamBuilderImpl() {
        }

        protected TickerParamBuilderImpl self() {
            return this;
        }

        public TickerParam build() {
            return new TickerParam(this);
        }
    }
}
