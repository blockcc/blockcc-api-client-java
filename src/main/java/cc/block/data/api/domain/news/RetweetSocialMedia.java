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
 * Retweeted Content
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RetweetSocialMedia implements Serializable {
    /**
     * Retweeted Content
     */
    @JsonProperty("content")
    private String content;
    /**
     * Retweeted Images Link
     */
    @JsonProperty("images")
    private List<String> images;
    /**
     * Retweeted User Id
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * Retweeted User Avatar
     */
    @JsonProperty("avatar")
    private String avatar;
    /**
     * Retweeted User Name (ScreenName)
     */
    @JsonProperty("screenName")
    private String screenName;

    public RetweetSocialMedia() {
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

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RetweetSocialMedia)) return false;
        final RetweetSocialMedia other = (RetweetSocialMedia) o;
        if (!other.canEqual((Object) this)) return false;
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
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RetweetSocialMedia;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
        return result;
    }

    public String toString() {
        return "RetweetSocialMedia(content=" + this.getContent() + ", images=" + this.getImages() + ", userId=" + this.getUserId() + ", avatar=" + this.getAvatar() + ", screenName=" + this.getScreenName() + ")";
    }
}
