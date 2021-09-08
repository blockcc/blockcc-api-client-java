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

/**
 * @author lijiaxing
 *
 * Trade
 */
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

    public Trade() {
    }

    public String getMarketPair() {
        return this.marketPair;
    }

    @JsonProperty("m")
    public void setMarketPair(String marketPair) {
        this.marketPair = marketPair;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    @JsonProperty("T")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Double getPrice() {
        return this.price;
    }

    @JsonProperty("p")
    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getVolume() {
        return this.volume;
    }

    @JsonProperty("v")
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public String getType() {
        return this.type;
    }

    @JsonProperty("s")
    public void setType(String type) {
        this.type = type;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Trade)) return false;
        final Trade other = (Trade) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$marketPair = this.getMarketPair();
        final Object other$marketPair = other.getMarketPair();
        if (this$marketPair == null ? other$marketPair != null : !this$marketPair.equals(other$marketPair))
            return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        final Object this$price = this.getPrice();
        final Object other$price = other.getPrice();
        if (this$price == null ? other$price != null : !this$price.equals(other$price)) return false;
        final Object this$volume = this.getVolume();
        final Object other$volume = other.getVolume();
        if (this$volume == null ? other$volume != null : !this$volume.equals(other$volume)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Trade;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $marketPair = this.getMarketPair();
        result = result * PRIME + ($marketPair == null ? 43 : $marketPair.hashCode());
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final Object $price = this.getPrice();
        result = result * PRIME + ($price == null ? 43 : $price.hashCode());
        final Object $volume = this.getVolume();
        result = result * PRIME + ($volume == null ? 43 : $volume.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        return result;
    }

    public String toString() {
        return "Trade(marketPair=" + this.getMarketPair() + ", timestamp=" + this.getTimestamp() + ", price=" + this.getPrice() + ", volume=" + this.getVolume() + ", type=" + this.getType() + ")";
    }
}
