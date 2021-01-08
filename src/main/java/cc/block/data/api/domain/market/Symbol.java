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
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author lijiaxing
 *
 * supported currencies symbol
 */
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Symbol {
    /**
     * Slug（ID）
     */
    @JsonProperty("slug")
    private String slug;

    /**
     * Symbol
     */
    @JsonProperty("symbol")
    private String symbol;

    /**
     * Fullname
     */
    @JsonProperty("fullname")
    private String fullname;

    /**
     * Logo Url
     */
    @JsonProperty("logoUrl")
    private String logoUrl;

    /**
     * Transaction volume (USD) through manual intervention
     */
    @JsonProperty("volumeUsd")
    private String volumeUsd;

    /**
     * Status: [enable, disable]. Disable is to stop updating data
     */
    @JsonProperty("status")
    private String status;

    /**
     * Currency Market Cap
     */
    @JsonProperty("marketCapUsd")
    private String marketCapUsd;

    /**
     * Available Supply
     */
    @JsonProperty("availableSupply")
    private String availableSupply;

    /**
     * Total Supply
     */
    @JsonProperty("totalSupply")
    private String totalSupply;

    /**
     * Maximum Supply
     */
    @JsonProperty("maxSupply")
    private String maxSupply;

    /**
     * Official website link
     */
    @JsonProperty("websiteUrl")
    private String website;

    /**
     * Block Explorer Link
     */
    @JsonProperty("explorerUrls")
    private String explorerUrls;

    /**
     * White Paper Link
     */
    @JsonProperty("whitePaperUrls")
    private String whitePaperUrls;

    /**
     * Github
     */
    @JsonProperty("githubId")
    private String githubId;

    /**
     * Twitter
     */
    @JsonProperty("twitterId")
    private String twitterId;

    /**
     * FaceBook
     */
    @JsonProperty("facebookId")
    private String facebookId;

    /**
     * Telegram
     */
    @JsonProperty("telegramId")
    private String telegramId;

    /**
     * Core Algorithm
     */
    @JsonProperty("algorithm")
    private String algorithm;

    /**
     * Proof
     */
    @JsonProperty("proof")
    private String proof;

    /**
     * Time to issue
     */
    @JsonProperty("issueDate")
    private String issueDate;

    /**
     * Currency introduction, not returned by default
     */
    @JsonProperty("details")
    private List<LinkedHashMap<String, String>> details;
}
