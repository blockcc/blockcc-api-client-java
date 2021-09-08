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
import cc.block.data.api.domain.enumeration.SocialMediaSource;

/**
 * @author lijiaxing
 * <p>
 * SocialMedia Request Parameter
 */

public class SocialMediaParam extends PageableParam {

    /**
     * source enum
     */
    private SocialMediaSource source;

    protected SocialMediaParam(SocialMediaParamBuilder<?, ?> b) {
        super(b);
        this.source = b.source;
    }

    public static SocialMediaParamBuilder<?, ?> builder() {
        return new SocialMediaParamBuilderImpl();
    }

    public SocialMediaSource getSource() {
        return this.source;
    }

    public void setSource(SocialMediaSource source) {
        this.source = source;
    }

    public String toString() {
        return "SocialMediaParam(source=" + this.getSource() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SocialMediaParam)) return false;
        final SocialMediaParam other = (SocialMediaParam) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$source = this.getSource();
        final Object other$source = other.getSource();
        if (this$source == null ? other$source != null : !this$source.equals(other$source)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SocialMediaParam;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $source = this.getSource();
        result = result * PRIME + ($source == null ? 43 : $source.hashCode());
        return result;
    }

    public static abstract class SocialMediaParamBuilder<C extends SocialMediaParam, B extends SocialMediaParamBuilder<C, B>> extends PageableParamBuilder<C, B> {
        private SocialMediaSource source;

        public B source(SocialMediaSource source) {
            this.source = source;
            return self();
        }

        protected abstract B self();

        public abstract C build();

        public String toString() {
            return "SocialMediaParam.SocialMediaParamBuilder(super=" + super.toString() + ", source=" + this.source + ")";
        }
    }

    private static final class SocialMediaParamBuilderImpl extends SocialMediaParamBuilder<SocialMediaParam, SocialMediaParamBuilderImpl> {
        private SocialMediaParamBuilderImpl() {
        }

        protected SocialMediaParamBuilderImpl self() {
            return this;
        }

        public SocialMediaParam build() {
            return new SocialMediaParam(this);
        }
    }
}
