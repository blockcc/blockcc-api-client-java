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

package cc.block.data.api.domain;

/**
 * @author lijiaxing
 * <p>
 * page size and limit
 */
public class PageableParam extends RequestParam {
    private Integer page;
    private Integer size;

    protected PageableParam(PageableParam.PageableParamBuilder<?, ?> b) {
        super(b);
        if (b.page$set) {
            this.page = b.page$value;
        } else {
            this.page = $default$page();
        }

        if (b.size$set) {
            this.size = b.size$value;
        } else {
            this.size = $default$size();
        }

    }

    private static Integer $default$page() {
        return 0;
    }

    private static Integer $default$size() {
        return 20;
    }

    public static PageableParam.PageableParamBuilder<?, ?> builder() {
        return new PageableParam.PageableParamBuilderImpl();
    }

    public void nextPage() {
        Integer var1 = this.page;
        Integer var2 = this.page = this.page + 1;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof PageableParam)) {
            return false;
        } else {
            PageableParam other = (PageableParam)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (!super.equals(o)) {
                return false;
            } else {
                Object this$page = this.getPage();
                Object other$page = other.getPage();
                if (this$page == null) {
                    if (other$page != null) {
                        return false;
                    }
                } else if (!this$page.equals(other$page)) {
                    return false;
                }

                Object this$size = this.getSize();
                Object other$size = other.getSize();
                if (this$size == null) {
                    if (other$size != null) {
                        return false;
                    }
                } else if (!this$size.equals(other$size)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof PageableParam;
    }

    public int hashCode() {
        int result = super.hashCode();
        Object $page = this.getPage();
        result = result * 59 + ($page == null ? 43 : $page.hashCode());
        Object $size = this.getSize();
        result = result * 59 + ($size == null ? 43 : $size.hashCode());
        return result;
    }

    public Integer getPage() {
        return this.page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return this.size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String toString() {
        return "PageableParam(page=" + this.getPage() + ", size=" + this.getSize() + ")";
    }

    private static final class PageableParamBuilderImpl extends PageableParam.PageableParamBuilder<PageableParam, PageableParam.PageableParamBuilderImpl> {
        private PageableParamBuilderImpl() {
        }

        protected PageableParam.PageableParamBuilderImpl self() {
            return this;
        }

        public PageableParam build() {
            return new PageableParam(this);
        }
    }

    public abstract static class PageableParamBuilder<C extends PageableParam, B extends PageableParam.PageableParamBuilder<C, B>> extends RequestParamBuilder<C, B> {
        private boolean page$set;
        private Integer page$value;
        private boolean size$set;
        private Integer size$value;

        public PageableParamBuilder() {
        }

        protected abstract B self();

        public abstract C build();

        public B page(Integer page) {
            this.page$value = page;
            this.page$set = true;
            return this.self();
        }

        public B size(Integer size) {
            this.size$value = size;
            this.size$set = true;
            return this.self();
        }

        public String toString() {
            return "PageableParam.PageableParamBuilder(super=" + super.toString() + ", page$value=" + this.page$value + ", size$value=" + this.size$value + ")";
        }
    }
}
