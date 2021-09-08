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

/**
 * @author lijiaxing
 *
 * Ticker
 */
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

    public Ticker() {
    }

    @Override
    public String toMessageString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return "{}";
        }
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    @JsonProperty("T")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMarketPair() {
        return this.marketPair;
    }

    @JsonProperty("m")
    public void setMarketPair(String marketPair) {
        this.marketPair = marketPair;
    }

    public Double getOpenPrice() {
        return this.openPrice;
    }

    @JsonProperty("o")
    public void setOpenPrice(Double openPrice) {
        this.openPrice = openPrice;
    }

    public Double getLastPrice() {
        return this.lastPrice;
    }

    @JsonProperty("c")
    public void setLastPrice(Double lastPrice) {
        this.lastPrice = lastPrice;
    }

    public Double getLowPrice() {
        return this.lowPrice;
    }

    @JsonProperty("l")
    public void setLowPrice(Double lowPrice) {
        this.lowPrice = lowPrice;
    }

    public Double getHighPrice() {
        return this.highPrice;
    }

    @JsonProperty("h")
    public void setHighPrice(Double highPrice) {
        this.highPrice = highPrice;
    }

    public Double getAskPrice() {
        return this.askPrice;
    }

    @JsonProperty("a")
    public void setAskPrice(Double askPrice) {
        this.askPrice = askPrice;
    }

    public Double getAskAmount() {
        return this.askAmount;
    }

    @JsonProperty("A")
    public void setAskAmount(Double askAmount) {
        this.askAmount = askAmount;
    }

    public Double getBidPrice() {
        return this.bidPrice;
    }

    @JsonProperty("b")
    public void setBidPrice(Double bidPrice) {
        this.bidPrice = bidPrice;
    }

    public Double getBidAmount() {
        return this.bidAmount;
    }

    @JsonProperty("B")
    public void setBidAmount(Double bidAmount) {
        this.bidAmount = bidAmount;
    }

    public Double getChangeDaily() {
        return this.changeDaily;
    }

    @JsonProperty("C")
    public void setChangeDaily(Double changeDaily) {
        this.changeDaily = changeDaily;
    }

    public Double getBaseVolume() {
        return this.baseVolume;
    }

    @JsonProperty("bv")
    public void setBaseVolume(Double baseVolume) {
        this.baseVolume = baseVolume;
    }

    public Double getQuoteVolume() {
        return this.quoteVolume;
    }

    @JsonProperty("qv")
    public void setQuoteVolume(Double quoteVolume) {
        this.quoteVolume = quoteVolume;
    }

    public Double getUsdRate() {
        return this.usdRate;
    }

    @JsonProperty("r")
    public void setUsdRate(Double usdRate) {
        this.usdRate = usdRate;
    }

    public Double getPurity() {
        return this.purity;
    }

    @JsonProperty("p")
    public void setPurity(Double purity) {
        this.purity = purity;
    }

    public Double getSpread() {
        return this.spread;
    }

    @JsonProperty("s")
    public void setSpread(Double spread) {
        this.spread = spread;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Ticker)) return false;
        final Ticker other = (Ticker) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        final Object this$marketPair = this.getMarketPair();
        final Object other$marketPair = other.getMarketPair();
        if (this$marketPair == null ? other$marketPair != null : !this$marketPair.equals(other$marketPair))
            return false;
        final Object this$openPrice = this.getOpenPrice();
        final Object other$openPrice = other.getOpenPrice();
        if (this$openPrice == null ? other$openPrice != null : !this$openPrice.equals(other$openPrice)) return false;
        final Object this$lastPrice = this.getLastPrice();
        final Object other$lastPrice = other.getLastPrice();
        if (this$lastPrice == null ? other$lastPrice != null : !this$lastPrice.equals(other$lastPrice)) return false;
        final Object this$lowPrice = this.getLowPrice();
        final Object other$lowPrice = other.getLowPrice();
        if (this$lowPrice == null ? other$lowPrice != null : !this$lowPrice.equals(other$lowPrice)) return false;
        final Object this$highPrice = this.getHighPrice();
        final Object other$highPrice = other.getHighPrice();
        if (this$highPrice == null ? other$highPrice != null : !this$highPrice.equals(other$highPrice)) return false;
        final Object this$askPrice = this.getAskPrice();
        final Object other$askPrice = other.getAskPrice();
        if (this$askPrice == null ? other$askPrice != null : !this$askPrice.equals(other$askPrice)) return false;
        final Object this$askAmount = this.getAskAmount();
        final Object other$askAmount = other.getAskAmount();
        if (this$askAmount == null ? other$askAmount != null : !this$askAmount.equals(other$askAmount)) return false;
        final Object this$bidPrice = this.getBidPrice();
        final Object other$bidPrice = other.getBidPrice();
        if (this$bidPrice == null ? other$bidPrice != null : !this$bidPrice.equals(other$bidPrice)) return false;
        final Object this$bidAmount = this.getBidAmount();
        final Object other$bidAmount = other.getBidAmount();
        if (this$bidAmount == null ? other$bidAmount != null : !this$bidAmount.equals(other$bidAmount)) return false;
        final Object this$changeDaily = this.getChangeDaily();
        final Object other$changeDaily = other.getChangeDaily();
        if (this$changeDaily == null ? other$changeDaily != null : !this$changeDaily.equals(other$changeDaily))
            return false;
        final Object this$baseVolume = this.getBaseVolume();
        final Object other$baseVolume = other.getBaseVolume();
        if (this$baseVolume == null ? other$baseVolume != null : !this$baseVolume.equals(other$baseVolume))
            return false;
        final Object this$quoteVolume = this.getQuoteVolume();
        final Object other$quoteVolume = other.getQuoteVolume();
        if (this$quoteVolume == null ? other$quoteVolume != null : !this$quoteVolume.equals(other$quoteVolume))
            return false;
        final Object this$usdRate = this.getUsdRate();
        final Object other$usdRate = other.getUsdRate();
        if (this$usdRate == null ? other$usdRate != null : !this$usdRate.equals(other$usdRate)) return false;
        final Object this$purity = this.getPurity();
        final Object other$purity = other.getPurity();
        if (this$purity == null ? other$purity != null : !this$purity.equals(other$purity)) return false;
        final Object this$spread = this.getSpread();
        final Object other$spread = other.getSpread();
        if (this$spread == null ? other$spread != null : !this$spread.equals(other$spread)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Ticker;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final Object $marketPair = this.getMarketPair();
        result = result * PRIME + ($marketPair == null ? 43 : $marketPair.hashCode());
        final Object $openPrice = this.getOpenPrice();
        result = result * PRIME + ($openPrice == null ? 43 : $openPrice.hashCode());
        final Object $lastPrice = this.getLastPrice();
        result = result * PRIME + ($lastPrice == null ? 43 : $lastPrice.hashCode());
        final Object $lowPrice = this.getLowPrice();
        result = result * PRIME + ($lowPrice == null ? 43 : $lowPrice.hashCode());
        final Object $highPrice = this.getHighPrice();
        result = result * PRIME + ($highPrice == null ? 43 : $highPrice.hashCode());
        final Object $askPrice = this.getAskPrice();
        result = result * PRIME + ($askPrice == null ? 43 : $askPrice.hashCode());
        final Object $askAmount = this.getAskAmount();
        result = result * PRIME + ($askAmount == null ? 43 : $askAmount.hashCode());
        final Object $bidPrice = this.getBidPrice();
        result = result * PRIME + ($bidPrice == null ? 43 : $bidPrice.hashCode());
        final Object $bidAmount = this.getBidAmount();
        result = result * PRIME + ($bidAmount == null ? 43 : $bidAmount.hashCode());
        final Object $changeDaily = this.getChangeDaily();
        result = result * PRIME + ($changeDaily == null ? 43 : $changeDaily.hashCode());
        final Object $baseVolume = this.getBaseVolume();
        result = result * PRIME + ($baseVolume == null ? 43 : $baseVolume.hashCode());
        final Object $quoteVolume = this.getQuoteVolume();
        result = result * PRIME + ($quoteVolume == null ? 43 : $quoteVolume.hashCode());
        final Object $usdRate = this.getUsdRate();
        result = result * PRIME + ($usdRate == null ? 43 : $usdRate.hashCode());
        final Object $purity = this.getPurity();
        result = result * PRIME + ($purity == null ? 43 : $purity.hashCode());
        final Object $spread = this.getSpread();
        result = result * PRIME + ($spread == null ? 43 : $spread.hashCode());
        return result;
    }

    public String toString() {
        return "Ticker(timestamp=" + this.getTimestamp() + ", marketPair=" + this.getMarketPair() + ", openPrice=" + this.getOpenPrice() + ", lastPrice=" + this.getLastPrice() + ", lowPrice=" + this.getLowPrice() + ", highPrice=" + this.getHighPrice() + ", askPrice=" + this.getAskPrice() + ", askAmount=" + this.getAskAmount() + ", bidPrice=" + this.getBidPrice() + ", bidAmount=" + this.getBidAmount() + ", changeDaily=" + this.getChangeDaily() + ", baseVolume=" + this.getBaseVolume() + ", quoteVolume=" + this.getQuoteVolume() + ", usdRate=" + this.getUsdRate() + ", purity=" + this.getPurity() + ", spread=" + this.getSpread() + ")";
    }
}
