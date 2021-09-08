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
 * Symbol Request Parameter
 */
public class SymbolParam extends PageableParam {
    /**
     * need details
     */
    private Boolean details;

    protected SymbolParam(SymbolParamBuilder<?, ?> b) {
        super(b);
        this.details = b.details;
    }

    public static SymbolParamBuilder<?, ?> builder() {
        return new SymbolParamBuilderImpl();
    }

    public Boolean getDetails() {
        return this.details;
    }

    public void setDetails(Boolean details) {
        this.details = details;
    }

    public String toString() {
        return "SymbolParam(details=" + this.getDetails() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SymbolParam)) return false;
        final SymbolParam other = (SymbolParam) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$details = this.getDetails();
        final Object other$details = other.getDetails();
        if (this$details == null ? other$details != null : !this$details.equals(other$details)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SymbolParam;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $details = this.getDetails();
        result = result * PRIME + ($details == null ? 43 : $details.hashCode());
        return result;
    }

    public static abstract class SymbolParamBuilder<C extends SymbolParam, B extends SymbolParamBuilder<C, B>> extends PageableParamBuilder<C, B> {
        private Boolean details;

        public B details(Boolean details) {
            this.details = details;
            return self();
        }

        protected abstract B self();

        public abstract C build();

        public String toString() {
            return "SymbolParam.SymbolParamBuilder(super=" + super.toString() + ", details=" + this.details + ")";
        }
    }

    private static final class SymbolParamBuilderImpl extends SymbolParamBuilder<SymbolParam, SymbolParamBuilderImpl> {
        private SymbolParamBuilderImpl() {
        }

        protected SymbolParamBuilderImpl self() {
            return this;
        }

        public SymbolParam build() {
            return new SymbolParam(this);
        }
    }
}
