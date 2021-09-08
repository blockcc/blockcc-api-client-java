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

import java.io.Serializable;
import java.util.List;

/**
 * @author lijiaxing
 * <p>
 * SocialMedia
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SocialMedia implements Serializable {
    /**
     * SocialMedia ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * SocialMedia Platform
     */
    @JsonProperty("source")
    private String source;
    /**
     * Content
     */
    @JsonProperty("content")
    private String content;
    /**
     * Images Link
     */
    @JsonProperty("images")
    private List<String> images;
    /**
     * User Id
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * User Avatar
     */
    @JsonProperty("avatar")
    private String avatar;
    /**
     * User Name (ScreenName)
     */
    @JsonProperty("screenName")
    private String screenName;
    /**
     * 13-bit Unix Timestamp
     */
    @JsonProperty("timestamp")
    private Long timestamp;
    /**
     * Is Retweeted
     */
    @JsonProperty("retweeted")
    private Boolean retweeted;
    /**
     * Retweeted Content
     */
    @JsonProperty("retweet")
    private RetweetSocialMedia retweet;

    public SocialMedia() {
    }

    public String getId() {
        return this.id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public String getSource() {
        return this.source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    public String getContent() {
        return this.content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getImages() {
        return this.images;
    }

    @JsonProperty("images")
    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getUserId() {
        return this.userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAvatar() {
        return this.avatar;
    }

    @JsonProperty("avatar")
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getScreenName() {
        return this.screenName;
    }

    @JsonProperty("screenName")
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Boolean getRetweeted() {
        return this.retweeted;
    }

    @JsonProperty("retweeted")
    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    public RetweetSocialMedia getRetweet() {
        return this.retweet;
    }

    @JsonProperty("retweet")
    public void setRetweet(RetweetSocialMedia retweet) {
        this.retweet = retweet;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SocialMedia)) return false;
        final SocialMedia other = (SocialMedia) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$source = this.getSource();
        final Object other$source = other.getSource();
        if (this$source == null ? other$source != null : !this$source.equals(other$source)) return false;
        final Object this$content = this.getContent();
        final Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        final Object this$images = this.getImages();
        final Object other$images = other.getImages();
        if (this$images == null ? other$images != null : !this$images.equals(other$images)) return false;
        final Object this$userId = this.getUserId();
        final Object other$userId = other.getUserId();
        if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
        final Object this$avatar = this.getAvatar();
        final Object other$avatar = other.getAvatar();
        if (this$avatar == null ? other$avatar != null : !this$avatar.equals(other$avatar)) return false;
        final Object this$screenName = this.getScreenName();
        final Object other$screenName = other.getScreenName();
        if (this$screenName == null ? other$screenName != null : !this$screenName.equals(other$screenName))
            return false;
        final Object this$timestamp = this.getTimestamp();
        final Object other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) return false;
        final Object this$retweeted = this.getRetweeted();
        final Object other$retweeted = other.getRetweeted();
        if (this$retweeted == null ? other$retweeted != null : !this$retweeted.equals(other$retweeted)) return false;
        final Object this$retweet = this.getRetweet();
        final Object other$retweet = other.getRetweet();
        if (this$retweet == null ? other$retweet != null : !this$retweet.equals(other$retweet)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SocialMedia;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $source = this.getSource();
        result = result * PRIME + ($source == null ? 43 : $source.hashCode());
        final Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        final Object $images = this.getImages();
        result = result * PRIME + ($images == null ? 43 : $images.hashCode());
        final Object $userId = this.getUserId();
        result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
        final Object $avatar = this.getAvatar();
        result = result * PRIME + ($avatar == null ? 43 : $avatar.hashCode());
        final Object $screenName = this.getScreenName();
        result = result * PRIME + ($screenName == null ? 43 : $screenName.hashCode());
        final Object $timestamp = this.getTimestamp();
        result = result * PRIME + ($timestamp == null ? 43 : $timestamp.hashCode());
        final Object $retweeted = this.getRetweeted();
        result = result * PRIME + ($retweeted == null ? 43 : $retweeted.hashCode());
        final Object $retweet = this.getRetweet();
        result = result * PRIME + ($retweet == null ? 43 : $retweet.hashCode());
        return result;
    }

    public String toString() {
        return "SocialMedia(id=" + this.getId() + ", source=" + this.getSource() + ", content=" + this.getContent() + ", images=" + this.getImages() + ", userId=" + this.getUserId() + ", avatar=" + this.getAvatar() + ", screenName=" + this.getScreenName() + ", timestamp=" + this.getTimestamp() + ", retweeted=" + this.getRetweeted() + ", retweet=" + this.getRetweet() + ")";
    }
}
