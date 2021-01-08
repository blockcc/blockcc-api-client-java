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
 * Currency historical price
 */
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class HistoricalPrice {
    /**
     * 13-bit Unix Timestamp
     */
    @JsonProperty("T")
    private Long timestamp;

    /**
     * Price(USD)
     */
    @JsonProperty("u")
    private Double priceUsd;

    /**
     * Price(BTC)
     */
    @JsonProperty("b")
    private Double priceBtc;

    /**
     * Volume(USD)
     */
    @JsonProperty("a")
    private Double volume;

    /**
     * Amount(unit: baseCurrency)
     */
    @JsonProperty("v")
    private Double volumeUsd;

    /**
     * MarketCap(unit: USD)
     */
    @JsonProperty("m")
    private Double marketcapUsd;
}
