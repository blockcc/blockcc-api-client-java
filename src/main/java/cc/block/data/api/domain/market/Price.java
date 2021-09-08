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
 * currency price
 */
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

    public Price() {
    }

    public String getSymbolName() {
        return this.symbolName;
    }

    @JsonProperty("s")
    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName;
    }

    public String getSymbol() {
        return this.symbol;
    }

    @JsonProperty("S")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
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

    public Double getReportedVolume() {
        return this.reportedVolume;
    }

    @JsonProperty("ra")
    public void setReportedVolume(Double reportedVolume) {
        this.reportedVolume = reportedVolume;
    }

    public Double getReportedVolumeUsd() {
        return this.reportedVolumeUsd;
    }

    @JsonProperty("rv")
    public void setReportedVolumeUsd(Double reportedVolumeUsd) {
        this.reportedVolumeUsd = reportedVolumeUsd;
    }

    public Double getMarketCapUsd() {
        return this.marketCapUsd;
    }

    @JsonProperty("m")
    public void setMarketCapUsd(Double marketCapUsd) {
        this.marketCapUsd = marketCapUsd;
    }

    public Double getPriceChange1d() {
        return this.priceChange1d;
    }

    @JsonProperty("c")
    public void setPriceChange1d(Double priceChange1d) {
        this.priceChange1d = priceChange1d;
    }

    public Double getHighPrice1d() {
        return this.highPrice1d;
    }

    @JsonProperty("h")
    public void setHighPrice1d(Double highPrice1d) {
        this.highPrice1d = highPrice1d;
    }

    public Double getLowPrice1d() {
        return this.lowPrice1d;
    }

    @JsonProperty("l")
    public void setLowPrice1d(Double lowPrice1d) {
        this.lowPrice1d = lowPrice1d;
    }

    public Double getPriceChange1w() {
        return this.priceChange1w;
    }

    @JsonProperty("cw")
    public void setPriceChange1w(Double priceChange1w) {
        this.priceChange1w = priceChange1w;
    }

    public Double getHighPrice1w() {
        return this.highPrice1w;
    }

    @JsonProperty("hw")
    public void setHighPrice1w(Double highPrice1w) {
        this.highPrice1w = highPrice1w;
    }

    public Double getLowPrice1w() {
        return this.lowPrice1w;
    }

    @JsonProperty("lw")
    public void setLowPrice1w(Double lowPrice1w) {
        this.lowPrice1w = lowPrice1w;
    }

    public Double getPriceChange1m() {
        return this.priceChange1m;
    }

    @JsonProperty("cm")
    public void setPriceChange1m(Double priceChange1m) {
        this.priceChange1m = priceChange1m;
    }

    public Double getHighPrice1m() {
        return this.highPrice1m;
    }

    @JsonProperty("hm")
    public void setHighPrice1m(Double highPrice1m) {
        this.highPrice1m = highPrice1m;
    }

    public Double getLowPrice1m() {
        return this.lowPrice1m;
    }

    @JsonProperty("lm")
    public void setLowPrice1m(Double lowPrice1m) {
        this.lowPrice1m = lowPrice1m;
    }

    public Double getHighPriceAll() {
        return this.highPriceAll;
    }

    @JsonProperty("ha")
    public void setHighPriceAll(Double highPriceAll) {
        this.highPriceAll = highPriceAll;
    }

    public Double getLowPriceAll() {
        return this.lowPriceAll;
    }

    @JsonProperty("la")
    public void setLowPriceAll(Double lowPriceAll) {
        this.lowPriceAll = lowPriceAll;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Price)) return false;
        final Price other = (Price) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$symbolName = this.getSymbolName();
        final Object other$symbolName = other.getSymbolName();
        if (this$symbolName == null ? other$symbolName != null : !this$symbolName.equals(other$symbolName))
            return false;
        final Object this$symbol = this.getSymbol();
        final Object other$symbol = other.getSymbol();
        if (this$symbol == null ? other$symbol != null : !this$symbol.equals(other$symbol)) return false;
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
        final Object this$reportedVolume = this.getReportedVolume();
        final Object other$reportedVolume = other.getReportedVolume();
        if (this$reportedVolume == null ? other$reportedVolume != null : !this$reportedVolume.equals(other$reportedVolume))
            return false;
        final Object this$reportedVolumeUsd = this.getReportedVolumeUsd();
        final Object other$reportedVolumeUsd = other.getReportedVolumeUsd();
        if (this$reportedVolumeUsd == null ? other$reportedVolumeUsd != null : !this$reportedVolumeUsd.equals(other$reportedVolumeUsd))
            return false;
        final Object this$marketCapUsd = this.getMarketCapUsd();
        final Object other$marketCapUsd = other.getMarketCapUsd();
        if (this$marketCapUsd == null ? other$marketCapUsd != null : !this$marketCapUsd.equals(other$marketCapUsd))
            return false;
        final Object this$priceChange1d = this.getPriceChange1d();
        final Object other$priceChange1d = other.getPriceChange1d();
        if (this$priceChange1d == null ? other$priceChange1d != null : !this$priceChange1d.equals(other$priceChange1d))
            return false;
        final Object this$highPrice1d = this.getHighPrice1d();
        final Object other$highPrice1d = other.getHighPrice1d();
        if (this$highPrice1d == null ? other$highPrice1d != null : !this$highPrice1d.equals(other$highPrice1d))
            return false;
        final Object this$lowPrice1d = this.getLowPrice1d();
        final Object other$lowPrice1d = other.getLowPrice1d();
        if (this$lowPrice1d == null ? other$lowPrice1d != null : !this$lowPrice1d.equals(other$lowPrice1d))
            return false;
        final Object this$priceChange1w = this.getPriceChange1w();
        final Object other$priceChange1w = other.getPriceChange1w();
        if (this$priceChange1w == null ? other$priceChange1w != null : !this$priceChange1w.equals(other$priceChange1w))
            return false;
        final Object this$highPrice1w = this.getHighPrice1w();
        final Object other$highPrice1w = other.getHighPrice1w();
        if (this$highPrice1w == null ? other$highPrice1w != null : !this$highPrice1w.equals(other$highPrice1w))
            return false;
        final Object this$lowPrice1w = this.getLowPrice1w();
        final Object other$lowPrice1w = other.getLowPrice1w();
        if (this$lowPrice1w == null ? other$lowPrice1w != null : !this$lowPrice1w.equals(other$lowPrice1w))
            return false;
        final Object this$priceChange1m = this.getPriceChange1m();
        final Object other$priceChange1m = other.getPriceChange1m();
        if (this$priceChange1m == null ? other$priceChange1m != null : !this$priceChange1m.equals(other$priceChange1m))
            return false;
        final Object this$highPrice1m = this.getHighPrice1m();
        final Object other$highPrice1m = other.getHighPrice1m();
        if (this$highPrice1m == null ? other$highPrice1m != null : !this$highPrice1m.equals(other$highPrice1m))
            return false;
        final Object this$lowPrice1m = this.getLowPrice1m();
        final Object other$lowPrice1m = other.getLowPrice1m();
        if (this$lowPrice1m == null ? other$lowPrice1m != null : !this$lowPrice1m.equals(other$lowPrice1m))
            return false;
        final Object this$highPriceAll = this.getHighPriceAll();
        final Object other$highPriceAll = other.getHighPriceAll();
        if (this$highPriceAll == null ? other$highPriceAll != null : !this$highPriceAll.equals(other$highPriceAll))
            return false;
        final Object this$lowPriceAll = this.getLowPriceAll();
        final Object other$lowPriceAll = other.getLowPriceAll();
        if (this$lowPriceAll == null ? other$lowPriceAll != null : !this$lowPriceAll.equals(other$lowPriceAll))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Price;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $symbolName = this.getSymbolName();
        result = result * PRIME + ($symbolName == null ? 43 : $symbolName.hashCode());
        final Object $symbol = this.getSymbol();
        result = result * PRIME + ($symbol == null ? 43 : $symbol.hashCode());
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
        final Object $reportedVolume = this.getReportedVolume();
        result = result * PRIME + ($reportedVolume == null ? 43 : $reportedVolume.hashCode());
        final Object $reportedVolumeUsd = this.getReportedVolumeUsd();
        result = result * PRIME + ($reportedVolumeUsd == null ? 43 : $reportedVolumeUsd.hashCode());
        final Object $marketCapUsd = this.getMarketCapUsd();
        result = result * PRIME + ($marketCapUsd == null ? 43 : $marketCapUsd.hashCode());
        final Object $priceChange1d = this.getPriceChange1d();
        result = result * PRIME + ($priceChange1d == null ? 43 : $priceChange1d.hashCode());
        final Object $highPrice1d = this.getHighPrice1d();
        result = result * PRIME + ($highPrice1d == null ? 43 : $highPrice1d.hashCode());
        final Object $lowPrice1d = this.getLowPrice1d();
        result = result * PRIME + ($lowPrice1d == null ? 43 : $lowPrice1d.hashCode());
        final Object $priceChange1w = this.getPriceChange1w();
        result = result * PRIME + ($priceChange1w == null ? 43 : $priceChange1w.hashCode());
        final Object $highPrice1w = this.getHighPrice1w();
        result = result * PRIME + ($highPrice1w == null ? 43 : $highPrice1w.hashCode());
        final Object $lowPrice1w = this.getLowPrice1w();
        result = result * PRIME + ($lowPrice1w == null ? 43 : $lowPrice1w.hashCode());
        final Object $priceChange1m = this.getPriceChange1m();
        result = result * PRIME + ($priceChange1m == null ? 43 : $priceChange1m.hashCode());
        final Object $highPrice1m = this.getHighPrice1m();
        result = result * PRIME + ($highPrice1m == null ? 43 : $highPrice1m.hashCode());
        final Object $lowPrice1m = this.getLowPrice1m();
        result = result * PRIME + ($lowPrice1m == null ? 43 : $lowPrice1m.hashCode());
        final Object $highPriceAll = this.getHighPriceAll();
        result = result * PRIME + ($highPriceAll == null ? 43 : $highPriceAll.hashCode());
        final Object $lowPriceAll = this.getLowPriceAll();
        result = result * PRIME + ($lowPriceAll == null ? 43 : $lowPriceAll.hashCode());
        return result;
    }

    public String toString() {
        return "Price(symbolName=" + this.getSymbolName() + ", symbol=" + this.getSymbol() + ", timestamp=" + this.getTimestamp() + ", priceUsd=" + this.getPriceUsd() + ", priceBtc=" + this.getPriceBtc() + ", volume=" + this.getVolume() + ", volumeUsd=" + this.getVolumeUsd() + ", reportedVolume=" + this.getReportedVolume() + ", reportedVolumeUsd=" + this.getReportedVolumeUsd() + ", marketCapUsd=" + this.getMarketCapUsd() + ", priceChange1d=" + this.getPriceChange1d() + ", highPrice1d=" + this.getHighPrice1d() + ", lowPrice1d=" + this.getLowPrice1d() + ", priceChange1w=" + this.getPriceChange1w() + ", highPrice1w=" + this.getHighPrice1w() + ", lowPrice1w=" + this.getLowPrice1w() + ", priceChange1m=" + this.getPriceChange1m() + ", highPrice1m=" + this.getHighPrice1m() + ", lowPrice1m=" + this.getLowPrice1m() + ", highPriceAll=" + this.getHighPriceAll() + ", lowPriceAll=" + this.getLowPriceAll() + ")";
    }
}
