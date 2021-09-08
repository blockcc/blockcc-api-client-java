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

package cc.block.data.api.domain.news.request;

import cc.block.data.api.domain.PageableParam;

import java.util.Locale;

/**
 * @author lijiaxing
 * <p>
 * Announcement Request Parameter
 */

public class AnnouncementParam extends PageableParam {
    /**
     * \
     * market name
     */
    private String market;

    /**
     * locale
     */
    private Locale locale;

    protected AnnouncementParam(AnnouncementParamBuilder<?, ?> b) {
        super(b);
        this.market = b.market;
        this.locale = b.locale;
    }

    public static AnnouncementParamBuilder<?, ?> builder() {
        return new AnnouncementParamBuilderImpl();
    }

    public String getMarket() {
        return this.market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public String toString() {
        return "AnnouncementParam(market=" + this.getMarket() + ", locale=" + this.getLocale() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AnnouncementParam)) return false;
        final AnnouncementParam other = (AnnouncementParam) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$market = this.getMarket();
        final Object other$market = other.getMarket();
        if (this$market == null ? other$market != null : !this$market.equals(other$market)) return false;
        final Object this$locale = this.getLocale();
        final Object other$locale = other.getLocale();
        if (this$locale == null ? other$locale != null : !this$locale.equals(other$locale)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AnnouncementParam;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $market = this.getMarket();
        result = result * PRIME + ($market == null ? 43 : $market.hashCode());
        final Object $locale = this.getLocale();
        result = result * PRIME + ($locale == null ? 43 : $locale.hashCode());
        return result;
    }

    public static abstract class AnnouncementParamBuilder<C extends AnnouncementParam, B extends AnnouncementParamBuilder<C, B>> extends PageableParamBuilder<C, B> {
        private String market;
        private Locale locale;

        public B market(String market) {
            this.market = market;
            return self();
        }

        public B locale(Locale locale) {
            this.locale = locale;
            return self();
        }

        protected abstract B self();

        public abstract C build();

        public String toString() {
            return "AnnouncementParam.AnnouncementParamBuilder(super=" + super.toString() + ", market=" + this.market + ", locale=" + this.locale + ")";
        }
    }

    private static final class AnnouncementParamBuilderImpl extends AnnouncementParamBuilder<AnnouncementParam, AnnouncementParamBuilderImpl> {
        private AnnouncementParamBuilderImpl() {
        }

        protected AnnouncementParamBuilderImpl self() {
            return this;
        }

        public AnnouncementParam build() {
            return new AnnouncementParam(this);
        }
    }
}
