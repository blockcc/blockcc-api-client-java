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
 * <p>
 * Article
 */
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
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
}
