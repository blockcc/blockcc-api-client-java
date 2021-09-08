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

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijiaxing
 *
 * OrderBook
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderBook {
    /**
     * MarketPairDesc
     */
    @JsonProperty("m")
    private String marketPair;

    /**
     * Asks
     */
    @JsonProperty("a")
    private List<ArrayList<Double>> asks;

    /**
     * Bids
     */
    @JsonProperty("b")
    private List<ArrayList<Double>> bids;

    /**
     * 13-bit Unix Timestamp
     */
    @JsonProperty("T")
    private Long timestamp;

    public OrderBook() {
    }

    public String getMarketPair() {
        return this.marketPair;
    }

    @JsonProperty("m")
    public void setMarketPair(String marketPair) {
        this.marketPair = marketPair;
    }

    public List<ArrayList<Double>> getAsks() {
        return this.asks;
    }

    @JsonProperty("a")
    public void setAsks(List<ArrayList<Double>> asks) {
        this.asks = asks;
    }

    public List<ArrayList<Double>> getBids() {
        return this.bids;
    }

    @JsonProperty("b")
    public void setBids(List<ArrayList<Double>> bids) {
        this.bids = bids;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    @JsonProperty("T")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderBook)) return false;
        final OrderBook other = (OrderBook) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$marketPair = this.getMarketPair();
        final Object other$marketPair = other.getMarketPair();
        if (this$marketPair == null ? other$marketPair != null : !this$marketPair.equals(other$marketPair))
            return false;
        final Object this$asks = this.getAsks();
        final Object other$asks = other.getAsks();
        if (this$asks == null ? other$asks != null : !this$asks.equals(other$asks)) return false;
        final Object this$bids = this.getBids();
        final Object other$bids = other.getBids();
        if (this$bids == null ? other$bids != null : !this$bids.equals(other$bids)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderBook;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $marketPair = this.getMarketPair();
        result = result * PRIME + ($marketPair == null ? 43 : $marketPair.hashCode());
        final Object $asks = this.getAsks();
        result = result * PRIME + ($asks == null ? 43 : $asks.hashCode());
        final Object $bids = this.getBids();
        result = result * PRIME + ($bids == null ? 43 : $bids.hashCode());
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        return result;
    }

    public String toString() {
        return "OrderBook(marketPair=" + this.getMarketPair() + ", asks=" + this.getAsks() + ", bids=" + this.getBids() + ", timestamp=" + this.getTimestamp() + ")";
    }
}
