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
 * currency price
 */
@Data
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Price {
    /**
     * Slug
     */
    @JsonProperty("s")
    private String symbolName;

    /**
     * Symbol
     */
    @JsonProperty("S")
    private String symbol;

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
     * Amount(unit: baseCurrency)
     */
    @JsonProperty("a")
    private Double volume;

    /**
     * Volume(unit: USD)
     */
    @JsonProperty("v")
    private Double volumeUsd;

    /**
     * ReportedAmount(unit: baseCurrency)
     */
    @JsonProperty("ra")
    private Double reportedVolume;

    /**
     * ReportedVolume(unit: USD)
     */
    @JsonProperty("rv")
    private Double reportedVolumeUsd;

    /**
     * MarketCap(unit: USD)
     */
    @JsonProperty("m")
    private Double marketCapUsd;

    /**
     * 24h price change
     */
    @JsonProperty("c")
    private Double priceChange1d;

    /**
     * 24h highest price
     */
    @JsonProperty("h")
    private Double highPrice1d;

    /**
     * 24h lowest price
     */
    @JsonProperty("l")
    private Double lowPrice1d;

    /**
     * One week price change
     */
    @JsonProperty("cw")
    private Double priceChange1w;

    /**
     * One week highest price
     */
    @JsonProperty("hw")
    private Double highPrice1w;

    /**
     * One week lowest price
     */
    @JsonProperty("lw")
    private Double lowPrice1w;

    /**
     * One month price change
     */
    @JsonProperty("cm")
    private Double priceChange1m;

    /**
     * One month highest price
     */
    @JsonProperty("hm")
    private Double highPrice1m;

    /**
     * One month lowest price
     */
    @JsonProperty("lm")
    private Double lowPrice1m;

    /**
     * Historical highest price
     */
    @JsonProperty("ha")
    private Double highPriceAll;

    /**
     * Historical lowest price
     */
    @JsonProperty("la")
    private Double lowPriceAll;

}
