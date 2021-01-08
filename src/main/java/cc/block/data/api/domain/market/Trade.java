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

package cc.block.data.api.domain.market;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author lijiaxing
 *
 * Trade
 */
@Data
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trade {
    /**
     * Market Pair Desc
     */
    @JsonProperty(value = "m")
    private String marketPair;

    /**
     * 13-bit Unix Timestamp
     */
    @JsonProperty(value = "T")
    private Long timestamp;

    /**
     * Price
     */
    @JsonProperty(value = "p")
    private Double price;

    /**
     * Base Volume
     */
    @JsonProperty(value = "v")
    private Double volume;

    /**
     * Taker Order Side[buy,sell,none]
     */
    @JsonProperty(value = "s")
    private String type;
}
