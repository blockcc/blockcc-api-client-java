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
import lombok.Data;
import okhttp3.Headers;
import retrofit2.Response;

/**
 * @author kahen
 */
@Data
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

}
