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

import cc.block.data.api.bean.OutputMessage;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author lijiaxing
 *
 * Ticker
 */
@Data
@ToString
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticker implements OutputMessage {

    /**
     * 13-bit Unix Timestamp
     */
    @JsonProperty("T")
    private Long timestamp;

    /**
     * MarketPairDesc
     */
    @JsonProperty("m")
    private String marketPair;

    /**
     * 24H Open Price(unit：quoteCurrency)
     */
    @JsonProperty("o")
    private Double openPrice;

    /**
     * Last Price, Close Price(unit：quoteCurrency)
     */
    @JsonProperty("c")
    private Double lastPrice;

    /**
     * 24H Low Price(unit：quoteCurrency)
     */
    @JsonProperty("l")
    private Double lowPrice;

    /**
     * 24H High Price(unit：quoteCurrency)
     */
    @JsonProperty("h")
    private Double highPrice;

    /**
     * Best Ask Price(unit：quoteCurrency)
     */
    @JsonProperty("a")
    private Double askPrice;

    /**
     * Best Ask Amount(unit：quoteCurrency)
     */
    @JsonProperty("A")
    private Double askAmount;

    /**
     * Best Bid Price(unit：quoteCurrency)
     */
    @JsonProperty("b")
    private Double bidPrice;

    /**
     * Best Bid Amount(unit：quoteCurrency)
     */
    @JsonProperty("B")
    private Double bidAmount;

    /**
     * 24H Price Change Rate
     */
    @JsonProperty("C")
    private Double changeDaily;

    /**
     * 24H Base Volume(unit：baseCurrency)
     */
    @JsonProperty("bv")
    private Double baseVolume;

    /**
     * 24H Quote Volume(unit：quoteCurrency)
     */
    @JsonProperty("qv")
    private Double quoteVolume;

    /**
     * To Usd Rate
     */
    @JsonProperty("r")
    private Double usdRate;

    /**
     * Purity
     */
    @JsonProperty("p")
    private Double purity;

    /**
     * Spread
     */
    @JsonProperty("s")
    private Double spread;

    @Override
    public String toMessageString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return "{}";
        }
    }
}
