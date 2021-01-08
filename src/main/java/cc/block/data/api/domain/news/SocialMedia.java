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
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author lijiaxing
 * <p>
 * SocialMedia
 */
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
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
}
