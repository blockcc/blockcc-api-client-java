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

package cc.block.data.api.constant;

/**
 * @author lijiaxing
 */
public class BlockccApiConstants {

    public static final String DEFAULT_HOST = "data.mifengcha.com";

    public static final String HEADER_API_KEY = "X-API-KEY";

    public static final String DELIM_LINKS = ",";
    public static final String DELIM_LINK_PARAM = ";";
    public static final String HEADER_LINK = "Link";
    public static final String HEADER_TOTAL = "X-Total-Count";
    public static final String HEADER_RATE_LIMIT_REMAIN = "Rate-Limit-Remaining";
    public static final String HEADER_RATE_LIMIT_TOTAL = "Rate-Limit-Total";
    public static final String META_REL = "rel";
    public static final String META_LAST = "last";
    public static final String META_NEXT = "next";
    public static final String META_FIRST = "first";
    public static final String META_PREV = "prev";

    private BlockccApiConstants() {
        throw new IllegalStateException("Utility class");
    }

}
