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

import java.util.List;

/**
 * @author lijiaxing
 */
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
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
}
