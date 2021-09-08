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
 * Market Request Parameter
 */
public class MarketParam extends PageableParam {

    protected MarketParam(MarketParamBuilder<?, ?> b) {
        super(b);
    }

    public static MarketParamBuilder<?, ?> builder() {
        return new MarketParamBuilderImpl();
    }

    public String toString() {
        return "MarketParam()";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MarketParam)) return false;
        final MarketParam other = (MarketParam) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MarketParam;
    }

    public int hashCode() {
        int result = super.hashCode();
        return result;
    }

    public static abstract class MarketParamBuilder<C extends MarketParam, B extends MarketParamBuilder<C, B>> extends PageableParamBuilder<C, B> {
        protected abstract B self();

        public abstract C build();

        public String toString() {
            return "MarketParam.MarketParamBuilder(super=" + super.toString() + ")";
        }
    }

    private static final class MarketParamBuilderImpl extends MarketParamBuilder<MarketParam, MarketParamBuilderImpl> {
        private MarketParamBuilderImpl() {
        }

        protected MarketParamBuilderImpl self() {
            return this;
        }

        public MarketParam build() {
            return new MarketParam(this);
        }
    }
}
