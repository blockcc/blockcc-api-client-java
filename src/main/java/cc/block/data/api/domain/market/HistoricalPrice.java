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
 * Currency historical price
 */
@JsonIgnoreProperties(ignoreUnknown = true)
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

    public HistoricalPrice() {
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    @JsonProperty("T")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Double getPriceUsd() {
        return this.priceUsd;
    }

    @JsonProperty("u")
    public void setPriceUsd(Double priceUsd) {
        this.priceUsd = priceUsd;
    }

    public Double getPriceBtc() {
        return this.priceBtc;
    }

    @JsonProperty("b")
    public void setPriceBtc(Double priceBtc) {
        this.priceBtc = priceBtc;
    }

    public Double getVolume() {
        return this.volume;
    }

    @JsonProperty("a")
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getVolumeUsd() {
        return this.volumeUsd;
    }

    @JsonProperty("v")
    public void setVolumeUsd(Double volumeUsd) {
        this.volumeUsd = volumeUsd;
    }

    public Double getMarketcapUsd() {
        return this.marketcapUsd;
    }

    @JsonProperty("m")
    public void setMarketcapUsd(Double marketcapUsd) {
        this.marketcapUsd = marketcapUsd;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof HistoricalPrice)) return false;
        final HistoricalPrice other = (HistoricalPrice) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        final Object this$priceUsd = this.getPriceUsd();
        final Object other$priceUsd = other.getPriceUsd();
        if (this$priceUsd == null ? other$priceUsd != null : !this$priceUsd.equals(other$priceUsd)) return false;
        final Object this$priceBtc = this.getPriceBtc();
        final Object other$priceBtc = other.getPriceBtc();
        if (this$priceBtc == null ? other$priceBtc != null : !this$priceBtc.equals(other$priceBtc)) return false;
        final Object this$volume = this.getVolume();
        final Object other$volume = other.getVolume();
        if (this$volume == null ? other$volume != null : !this$volume.equals(other$volume)) return false;
        final Object this$volumeUsd = this.getVolumeUsd();
        final Object other$volumeUsd = other.getVolumeUsd();
        if (this$volumeUsd == null ? other$volumeUsd != null : !this$volumeUsd.equals(other$volumeUsd)) return false;
        final Object this$marketcapUsd = this.getMarketcapUsd();
        final Object other$marketcapUsd = other.getMarketcapUsd();
        if (this$marketcapUsd == null ? other$marketcapUsd != null : !this$marketcapUsd.equals(other$marketcapUsd))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof HistoricalPrice;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final Object $priceUsd = this.getPriceUsd();
        result = result * PRIME + ($priceUsd == null ? 43 : $priceUsd.hashCode());
        final Object $priceBtc = this.getPriceBtc();
        result = result * PRIME + ($priceBtc == null ? 43 : $priceBtc.hashCode());
        final Object $volume = this.getVolume();
        result = result * PRIME + ($volume == null ? 43 : $volume.hashCode());
        final Object $volumeUsd = this.getVolumeUsd();
        result = result * PRIME + ($volumeUsd == null ? 43 : $volumeUsd.hashCode());
        final Object $marketcapUsd = this.getMarketcapUsd();
        result = result * PRIME + ($marketcapUsd == null ? 43 : $marketcapUsd.hashCode());
        return result;
    }

    public String toString() {
        return "HistoricalPrice(timestamp=" + this.getTimestamp() + ", priceUsd=" + this.getPriceUsd() + ", priceBtc=" + this.getPriceBtc() + ", volume=" + this.getVolume() + ", volumeUsd=" + this.getVolumeUsd() + ", marketcapUsd=" + this.getMarketcapUsd() + ")";
    }
}
