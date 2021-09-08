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

import cc.block.data.api.constant.BlockccApiConstants;
import okhttp3.Headers;
import retrofit2.Response;

/**
 * @author kahen
 */
public class BlockccResponse<T> {

    private Long total;
    private String first;
    private String prev;
    private String next;
    private String last;
    private Long rateLimitTotal;
    private Long rateLimitRemain;
    private T content;

    public BlockccResponse(Response<T> response) {
        this.content = response.body();
        Headers headers = response.headers();
        String linkHeader = headers.get(BlockccApiConstants.HEADER_LINK);
        if (linkHeader != null) {
            String[] links = linkHeader.split(BlockccApiConstants.DELIM_LINKS);
            for (String link : links) {
                String[] segments = link.split(BlockccApiConstants.DELIM_LINK_PARAM);
                if (segments.length < 2) {
                    continue;
                }

                String linkPart = segments[0].trim();
                if (!linkPart.startsWith("<") || !linkPart.endsWith(">")) {
                    continue;
                }
                linkPart = linkPart.substring(1, linkPart.length() - 1);

                for (int i = 1; i < segments.length; i++) {
                    String[] rel = segments[i].trim().split("=");
                    if (rel.length < 2 || !BlockccApiConstants.META_REL.equals(rel[0])) {
                        continue;
                    }

                    String relValue = rel[1];
                    if (relValue.startsWith("\"") && relValue.endsWith("\"")) {

                        relValue = relValue.substring(1, relValue.length() - 1);
                    }

                    if (BlockccApiConstants.META_FIRST.equals(relValue)) {
                        this.first = linkPart;
                    } else if (BlockccApiConstants.META_LAST.equals(relValue)) {
                        this.last = linkPart;
                    } else if (BlockccApiConstants.META_NEXT.equals(relValue)) {
                        this.next = linkPart;
                    } else if (BlockccApiConstants.META_PREV.equals(relValue)) {
                        this.prev = linkPart;
                    }
                }
            }
        }

        String total = headers.get(BlockccApiConstants.HEADER_TOTAL);
        if (total != null) {
            try {
                this.total = Long.parseLong(total);
            } catch (Exception ignore) {
                // ignore
            }
        }

        String rateLimitRemain = headers.get(BlockccApiConstants.HEADER_RATE_LIMIT_REMAIN);
        if (rateLimitRemain != null) {
            try {
                this.rateLimitRemain = Long.parseLong(rateLimitRemain);
            } catch (Exception ignore) {
                // ignore
            }
        }

        String rateLimitTotal = headers.get(BlockccApiConstants.HEADER_RATE_LIMIT_TOTAL);
        if (rateLimitTotal != null) {
            try {
                this.rateLimitTotal = Long.parseLong(rateLimitTotal);
            } catch (Exception ignore) {
                // ignore
            }
        }

    }

    public boolean hasNextPage() {
        return next != null;
    }

    public Long getTotal() {
        return this.total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getFirst() {
        return this.first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getPrev() {
        return this.prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }

    public String getNext() {
        return this.next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getLast() {
        return this.last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public Long getRateLimitTotal() {
        return this.rateLimitTotal;
    }

    public void setRateLimitTotal(Long rateLimitTotal) {
        this.rateLimitTotal = rateLimitTotal;
    }

    public Long getRateLimitRemain() {
        return this.rateLimitRemain;
    }

    public void setRateLimitRemain(Long rateLimitRemain) {
        this.rateLimitRemain = rateLimitRemain;
    }

    public T getContent() {
        return this.content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BlockccResponse)) return false;
        final BlockccResponse<?> other = (BlockccResponse<?>) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$total = this.getTotal();
        final Object other$total = other.getTotal();
        if (this$total == null ? other$total != null : !this$total.equals(other$total)) return false;
        final Object this$first = this.getFirst();
        final Object other$first = other.getFirst();
        if (this$first == null ? other$first != null : !this$first.equals(other$first)) return false;
        final Object this$prev = this.getPrev();
        final Object other$prev = other.getPrev();
        if (this$prev == null ? other$prev != null : !this$prev.equals(other$prev)) return false;
        final Object this$next = this.getNext();
        final Object other$next = other.getNext();
        if (this$next == null ? other$next != null : !this$next.equals(other$next)) return false;
        final Object this$last = this.getLast();
        final Object other$last = other.getLast();
        if (this$last == null ? other$last != null : !this$last.equals(other$last)) return false;
        final Object this$rateLimitTotal = this.getRateLimitTotal();
        final Object other$rateLimitTotal = other.getRateLimitTotal();
        if (this$rateLimitTotal == null ? other$rateLimitTotal != null : !this$rateLimitTotal.equals(other$rateLimitTotal))
            return false;
        final Object this$rateLimitRemain = this.getRateLimitRemain();
        final Object other$rateLimitRemain = other.getRateLimitRemain();
        if (this$rateLimitRemain == null ? other$rateLimitRemain != null : !this$rateLimitRemain.equals(other$rateLimitRemain))
            return false;
        final Object this$content = this.getContent();
        final Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BlockccResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $total = this.getTotal();
        result = result * PRIME + ($total == null ? 43 : $total.hashCode());
        final Object $first = this.getFirst();
        result = result * PRIME + ($first == null ? 43 : $first.hashCode());
        final Object $prev = this.getPrev();
        result = result * PRIME + ($prev == null ? 43 : $prev.hashCode());
        final Object $next = this.getNext();
        result = result * PRIME + ($next == null ? 43 : $next.hashCode());
        final Object $last = this.getLast();
        result = result * PRIME + ($last == null ? 43 : $last.hashCode());
        final Object $rateLimitTotal = this.getRateLimitTotal();
        result = result * PRIME + ($rateLimitTotal == null ? 43 : $rateLimitTotal.hashCode());
        final Object $rateLimitRemain = this.getRateLimitRemain();
        result = result * PRIME + ($rateLimitRemain == null ? 43 : $rateLimitRemain.hashCode());
        final Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        return result;
    }

    public String toString() {
        return "BlockccResponse(total=" + this.getTotal() + ", first=" + this.getFirst() + ", prev=" + this.getPrev() + ", next=" + this.getNext() + ", last=" + this.getLast() + ", rateLimitTotal=" + this.getRateLimitTotal() + ", rateLimitRemain=" + this.getRateLimitRemain() + ", content=" + this.getContent() + ")";
    }
}
