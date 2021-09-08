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
 * <p>
 * Article
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Article {
    /**
     * Article ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * 13-bit Unix Timestamp
     */
    @JsonProperty("timestamp")
    private Long timestamp;
    /**
     * title
     */
    @JsonProperty("title")
    private String title;
    /**
     * description
     */
    @JsonProperty("description")
    private String description;
    /**
     * content
     */
    @JsonProperty("content")
    private String content;
    /**
     * author
     */
    @JsonProperty("author")
    private String author;
    /**
     * Categories, comma-separated
     */
    @JsonProperty("categories")
    private String categories;
    /**
     * Cover Image Link
     */
    @JsonProperty("images")
    private List<String> images;
    /**
     * keywords
     */
    @JsonProperty("keywords")
    private String keywords;
    /**
     * Block.cc Link
     */
    @JsonProperty("url")
    private String url;
    /**
     * source
     */
    @JsonProperty("source")
    private String source;
    /**
     * sourceUrl
     */
    @JsonProperty("sourceUrl")
    private String sourceUrl;
    /**
     * Bitcoin price at launch
     */
    @JsonProperty("btcPrice")
    private Double btcPrice;

    public Article() {
    }

    public String getId() {
        return this.id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getTitle() {
        return this.title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return this.content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return this.author;
    }

    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategories() {
        return this.categories;
    }

    @JsonProperty("categories")
    public void setCategories(String categories) {
        this.categories = categories;
    }

    public List<String> getImages() {
        return this.images;
    }

    @JsonProperty("images")
    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getKeywords() {
        return this.keywords;
    }

    @JsonProperty("keywords")
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getUrl() {
        return this.url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public String getSource() {
        return this.source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceUrl() {
        return this.sourceUrl;
    }

    @JsonProperty("sourceUrl")
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public Double getBtcPrice() {
        return this.btcPrice;
    }

    @JsonProperty("btcPrice")
    public void setBtcPrice(Double btcPrice) {
        this.btcPrice = btcPrice;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Article)) return false;
        final Article other = (Article) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$content = this.getContent();
        final Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        final Object this$author = this.getAuthor();
        final Object other$author = other.getAuthor();
        if (this$author == null ? other$author != null : !this$author.equals(other$author)) return false;
        final Object this$categories = this.getCategories();
        final Object other$categories = other.getCategories();
        if (this$categories == null ? other$categories != null : !this$categories.equals(other$categories))
            return false;
        final Object this$images = this.getImages();
        final Object other$images = other.getImages();
        if (this$images == null ? other$images != null : !this$images.equals(other$images)) return false;
        final Object this$keywords = this.getKeywords();
        final Object other$keywords = other.getKeywords();
        if (this$keywords == null ? other$keywords != null : !this$keywords.equals(other$keywords)) return false;
        final Object this$url = this.getUrl();
        final Object other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        final Object this$source = this.getSource();
        final Object other$source = other.getSource();
        if (this$source == null ? other$source != null : !this$source.equals(other$source)) return false;
        final Object this$sourceUrl = this.getSourceUrl();
        final Object other$sourceUrl = other.getSourceUrl();
        if (this$sourceUrl == null ? other$sourceUrl != null : !this$sourceUrl.equals(other$sourceUrl)) return false;
        final Object this$btcPrice = this.getBtcPrice();
        final Object other$btcPrice = other.getBtcPrice();
        if (this$btcPrice == null ? other$btcPrice != null : !this$btcPrice.equals(other$btcPrice)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Article;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        final Object $author = this.getAuthor();
        result = result * PRIME + ($author == null ? 43 : $author.hashCode());
        final Object $categories = this.getCategories();
        result = result * PRIME + ($categories == null ? 43 : $categories.hashCode());
        final Object $images = this.getImages();
        result = result * PRIME + ($images == null ? 43 : $images.hashCode());
        final Object $keywords = this.getKeywords();
        result = result * PRIME + ($keywords == null ? 43 : $keywords.hashCode());
        final Object $url = this.getUrl();
        result = result * PRIME + ($url == null ? 43 : $url.hashCode());
        final Object $source = this.getSource();
        result = result * PRIME + ($source == null ? 43 : $source.hashCode());
        final Object $sourceUrl = this.getSourceUrl();
        result = result * PRIME + ($sourceUrl == null ? 43 : $sourceUrl.hashCode());
        final Object $btcPrice = this.getBtcPrice();
        result = result * PRIME + ($btcPrice == null ? 43 : $btcPrice.hashCode());
        return result;
    }

    public String toString() {
        return "Article(id=" + this.getId() + ", timestamp=" + this.getTimestamp() + ", title=" + this.getTitle() + ", description=" + this.getDescription() + ", content=" + this.getContent() + ", author=" + this.getAuthor() + ", categories=" + this.getCategories() + ", images=" + this.getImages() + ", keywords=" + this.getKeywords() + ", url=" + this.getUrl() + ", source=" + this.getSource() + ", sourceUrl=" + this.getSourceUrl() + ", btcPrice=" + this.getBtcPrice() + ")";
    }
}
