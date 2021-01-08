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
 * Retweeted Content
 */
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
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

}
