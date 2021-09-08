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

package cc.block.data.api.domain.news;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author lijiaxing
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Announcement {
    /**
     * Title
     */
    @JsonProperty("title")
    private String title;
    /**
     * HTML Content
     */
    @JsonProperty("content")
    private String content;
    /**
     * 13-bit Unix Timestamp
     */
    @JsonProperty("timestamp")
    private Long timestamp;
    /**
     * Is Importance
     */
    @JsonProperty("importance")
    private boolean importance;
    /**
     * Block.cc Link
     */
    @JsonProperty("url")
    private String url;
    /**
     * Market
     */
    @JsonProperty("market")
    private String market;
    /**
     * Source Url
     */
    @JsonProperty("sourceUrl")
    private String sourceUrl;
    /**
     * Cover Image Link
     */
    @JsonProperty("images")
    private List<String> images;

    public Announcement() {
    }

    public String getTitle() {
        return this.title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isImportance() {
        return this.importance;
    }

    @JsonProperty("importance")
    public void setImportance(boolean importance) {
        this.importance = importance;
    }

    public String getUrl() {
        return this.url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public String getMarket() {
        return this.market;
    }

    @JsonProperty("market")
    public void setMarket(String market) {
        this.market = market;
    }

    public String getSourceUrl() {
        return this.sourceUrl;
    }

    @JsonProperty("sourceUrl")
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public List<String> getImages() {
        return this.images;
    }

    @JsonProperty("images")
    public void setImages(List<String> images) {
        this.images = images;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Announcement)) return false;
        final Announcement other = (Announcement) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$content = this.getContent();
        final Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        if (this.isImportance() != other.isImportance()) return false;
        final Object this$url = this.getUrl();
        final Object other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        final Object this$market = this.getMarket();
        final Object other$market = other.getMarket();
        if (this$market == null ? other$market != null : !this$market.equals(other$market)) return false;
        final Object this$sourceUrl = this.getSourceUrl();
        final Object other$sourceUrl = other.getSourceUrl();
        if (this$sourceUrl == null ? other$sourceUrl != null : !this$sourceUrl.equals(other$sourceUrl)) return false;
        final Object this$images = this.getImages();
        final Object other$images = other.getImages();
        if (this$images == null ? other$images != null : !this$images.equals(other$images)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Announcement;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        result = result * PRIME + (this.isImportance() ? 79 : 97);
        final Object $url = this.getUrl();
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        final Object $market = this.getMarket();
        result = result * PRIME + ($market == null ? 43 : $market.hashCode());
        final Object $sourceUrl = this.getSourceUrl();
        result = result * PRIME + ($sourceUrl == null ? 43 : $sourceUrl.hashCode());
        final Object $images = this.getImages();
        result = result * PRIME + ($images == null ? 43 : $images.hashCode());
        return result;
    }

    public String toString() {
        return "Announcement(title=" + this.getTitle() + ", content=" + this.getContent() + ", timestamp=" + this.getTimestamp() + ", importance=" + this.isImportance() + ", url=" + this.getUrl() + ", market=" + this.getMarket() + ", sourceUrl=" + this.getSourceUrl() + ", images=" + this.getImages() + ")";
    }
}
