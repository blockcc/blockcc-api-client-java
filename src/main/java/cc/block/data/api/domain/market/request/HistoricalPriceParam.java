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

import cc.block.data.api.domain.RequestParam;
import cc.block.data.api.domain.enumeration.Interval;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

/**
 * @author lijiaxing
 */
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Data
public class HistoricalPriceParam extends RequestParam {
    /**
     * Symbol Slug.
     */
    private String slug;

    /**
     * Start Time，unit: mills, default min timestamp
     */
    private Long start;

    /**
     * End Time，unit: mills，default current timestamp
     */
    private Long end;

    /**
     * Interval[5m,15m,30m,1h,2h,6h,12h,1d,2d], default calculated based on start, end
     */
    private Interval interval;
}
