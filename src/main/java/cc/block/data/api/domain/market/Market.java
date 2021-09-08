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
 *  market
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Market {
    /**
     * Market slug (ID)
     */
    @JsonProperty("slug")
    private String slug;
    /**
     * Full Market Name
     */
    @JsonProperty("fullname")
    private String fullname;
    /**
     * Exchange's official website link
     */
    @JsonProperty("websiteUrl")
    private String websiteUrl;

    /**
     * (old) Transaction volume (USD) counted by human intervention
     */
    @JsonProperty("volume")
    private Double volume;

    /**
     * Exchange reported trading volume (USD)
     */
    @JsonProperty("reportedVolume")
    private Double reportedVolume;
    /**
     * Estimated Trading Volume (USD)
     */
    @JsonProperty("expectedVolume")
    private Double expectedVolume;

    /**
     * Status: [enable, disable]. disable is to stop updating data
     */
    @JsonProperty("status")
    private String status;

    /**
     * Is access K-line data
     */
    @JsonProperty("kline")
    private Boolean kline;

    /**
     * Is spot market
     */
    @JsonProperty("spot")
    private Boolean spot;

    /**
     * Is futures market
     */
    @JsonProperty("futures")
    private Boolean futures;

    public Market() {
    }

    public String getSlug() {
        return this.slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getFullname() {
        return this.fullname;
    }

    @JsonProperty("fullname")
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getWebsiteUrl() {
        return this.websiteUrl;
    }

    @JsonProperty("websiteUrl")
    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public Double getVolume() {
        return this.volume;
    }

    @JsonProperty("volume")
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getReportedVolume() {
        return this.reportedVolume;
    }

    @JsonProperty("reportedVolume")
    public void setReportedVolume(Double reportedVolume) {
        this.reportedVolume = reportedVolume;
    }

    public Double getExpectedVolume() {
        return this.expectedVolume;
    }

    @JsonProperty("expectedVolume")
    public void setExpectedVolume(Double expectedVolume) {
        this.expectedVolume = expectedVolume;
    }

    public String getStatus() {
        return this.status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getKline() {
        return this.kline;
    }

    @JsonProperty("kline")
    public void setKline(Boolean kline) {
        this.kline = kline;
    }

    public Boolean getSpot() {
        return this.spot;
    }

    @JsonProperty("spot")
    public void setSpot(Boolean spot) {
        this.spot = spot;
    }

    public Boolean getFutures() {
        return this.futures;
    }

    @JsonProperty("futures")
    public void setFutures(Boolean futures) {
        this.futures = futures;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Market)) return false;
        final Market other = (Market) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$slug = this.getSlug();
        final Object other$slug = other.getSlug();
        if (this$slug == null ? other$slug != null : !this$slug.equals(other$slug)) return false;
        final Object this$fullname = this.getFullname();
        final Object other$fullname = other.getFullname();
        if (this$fullname == null ? other$fullname != null : !this$fullname.equals(other$fullname)) return false;
        final Object this$websiteUrl = this.getWebsiteUrl();
        final Object other$websiteUrl = other.getWebsiteUrl();
        if (this$websiteUrl == null ? other$websiteUrl != null : !this$websiteUrl.equals(other$websiteUrl))
            return false;
        final Object this$volume = this.getVolume();
        final Object other$volume = other.getVolume();
        if (this$volume == null ? other$volume != null : !this$volume.equals(other$volume)) return false;
        final Object this$reportedVolume = this.getReportedVolume();
        final Object other$reportedVolume = other.getReportedVolume();
        if (this$reportedVolume == null ? other$reportedVolume != null : !this$reportedVolume.equals(other$reportedVolume))
            return false;
        final Object this$expectedVolume = this.getExpectedVolume();
        final Object other$expectedVolume = other.getExpectedVolume();
        if (this$expectedVolume == null ? other$expectedVolume != null : !this$expectedVolume.equals(other$expectedVolume))
            return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$kline = this.getKline();
        final Object other$kline = other.getKline();
        if (this$kline == null ? other$kline != null : !this$kline.equals(other$kline)) return false;
        final Object this$spot = this.getSpot();
        final Object other$spot = other.getSpot();
        if (this$spot == null ? other$spot != null : !this$spot.equals(other$spot)) return false;
        final Object this$futures = this.getFutures();
        final Object other$futures = other.getFutures();
        if (this$futures == null ? other$futures != null : !this$futures.equals(other$futures)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Market;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $slug = this.getSlug();
        result = result * PRIME + ($slug == null ? 43 : $slug.hashCode());
        final Object $fullname = this.getFullname();
        result = result * PRIME + ($fullname == null ? 43 : $fullname.hashCode());
        final Object $websiteUrl = this.getWebsiteUrl();
        result = result * PRIME + ($websiteUrl == null ? 43 : $websiteUrl.hashCode());
        final Object $volume = this.getVolume();
        result = result * PRIME + ($volume == null ? 43 : $volume.hashCode());
        final Object $reportedVolume = this.getReportedVolume();
        result = result * PRIME + ($reportedVolume == null ? 43 : $reportedVolume.hashCode());
        final Object $expectedVolume = this.getExpectedVolume();
        result = result * PRIME + ($expectedVolume == null ? 43 : $expectedVolume.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $kline = this.getKline();
        result = result * PRIME + ($kline == null ? 43 : $kline.hashCode());
        final Object $spot = this.getSpot();
        result = result * PRIME + ($spot == null ? 43 : $spot.hashCode());
        final Object $futures = this.getFutures();
        result = result * PRIME + ($futures == null ? 43 : $futures.hashCode());
        return result;
    }

    public String toString() {
        return "Market(slug=" + this.getSlug() + ", fullname=" + this.getFullname() + ", websiteUrl=" + this.getWebsiteUrl() + ", volume=" + this.getVolume() + ", reportedVolume=" + this.getReportedVolume() + ", expectedVolume=" + this.getExpectedVolume() + ", status=" + this.getStatus() + ", kline=" + this.getKline() + ", spot=" + this.getSpot() + ", futures=" + this.getFutures() + ")";
    }
}
