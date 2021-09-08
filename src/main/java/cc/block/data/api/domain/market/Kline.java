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
 * Kline Data(OHLCV)
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Kline {
    /**
     * Open Time 13-bit Unix Timestamp
     */
    @JsonProperty("T")
    private Long timestamp;

    /**
     * Open Price(unit: quoteCurrency)
     */
    @JsonProperty("o")
    private Double open;

    /**
     * High Price(unit: quoteCurrency)
     */
    @JsonProperty("h")
    private Double high;

    /**
     * Low Price(unit: quoteCurrency)
     */
    @JsonProperty("l")
    private Double low;

    /**
     * Close Price(unit: quoteCurrency)
     */
    @JsonProperty("c")
    private Double close;

    /**
     * Volume (unit: baseCurrency)
     */
    @JsonProperty("v")
    private Double volume;

    public Kline() {
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    @JsonProperty("T")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Double getOpen() {
        return this.open;
    }

    @JsonProperty("o")
    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getHigh() {
        return this.high;
    }

    @JsonProperty("h")
    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return this.low;
    }

    @JsonProperty("l")
    public void setLow(Double low) {
        this.low = low;
    }

    public Double getClose() {
        return this.close;
    }

    @JsonProperty("c")
    public void setClose(Double close) {
        this.close = close;
    }

    public Double getVolume() {
        return this.volume;
    }

    @JsonProperty("v")
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Kline)) return false;
        final Kline other = (Kline) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        final Object this$open = this.getOpen();
        final Object other$open = other.getOpen();
        if (this$open == null ? other$open != null : !this$open.equals(other$open)) return false;
        final Object this$high = this.getHigh();
        final Object other$high = other.getHigh();
        if (this$high == null ? other$high != null : !this$high.equals(other$high)) return false;
        final Object this$low = this.getLow();
        final Object other$low = other.getLow();
        if (this$low == null ? other$low != null : !this$low.equals(other$low)) return false;
        final Object this$close = this.getClose();
        final Object other$close = other.getClose();
        if (this$close == null ? other$close != null : !this$close.equals(other$close)) return false;
        final Object this$volume = this.getVolume();
        final Object other$volume = other.getVolume();
        if (this$volume == null ? other$volume != null : !this$volume.equals(other$volume)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Kline;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final Object $open = this.getOpen();
        result = result * PRIME + ($open == null ? 43 : $open.hashCode());
        final Object $high = this.getHigh();
        result = result * PRIME + ($high == null ? 43 : $high.hashCode());
        final Object $low = this.getLow();
        result = result * PRIME + ($low == null ? 43 : $low.hashCode());
        final Object $close = this.getClose();
        result = result * PRIME + ($close == null ? 43 : $close.hashCode());
        final Object $volume = this.getVolume();
        result = result * PRIME + ($volume == null ? 43 : $volume.hashCode());
        return result;
    }

    public String toString() {
        return "Kline(timestamp=" + this.getTimestamp() + ", open=" + this.getOpen() + ", high=" + this.getHigh() + ", low=" + this.getLow() + ", close=" + this.getClose() + ", volume=" + this.getVolume() + ")";
    }
}
