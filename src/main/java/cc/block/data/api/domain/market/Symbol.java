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

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author lijiaxing
 *
 * supported currencies symbol
 */
@JsonIgnoreProperties(ignoreUnknown = true)
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

    public Symbol() {
    }

    public String getSlug() {
        return this.slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSymbol() {
        return this.symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getFullname() {
        return this.fullname;
    }

    @JsonProperty("fullname")
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getLogoUrl() {
        return this.logoUrl;
    }

    @JsonProperty("logoUrl")
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getVolumeUsd() {
        return this.volumeUsd;
    }

    @JsonProperty("volumeUsd")
    public void setVolumeUsd(String volumeUsd) {
        this.volumeUsd = volumeUsd;
    }

    public String getStatus() {
        return this.status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public String getMarketCapUsd() {
        return this.marketCapUsd;
    }

    @JsonProperty("marketCapUsd")
    public void setMarketCapUsd(String marketCapUsd) {
        this.marketCapUsd = marketCapUsd;
    }

    public String getAvailableSupply() {
        return this.availableSupply;
    }

    @JsonProperty("availableSupply")
    public void setAvailableSupply(String availableSupply) {
        this.availableSupply = availableSupply;
    }

    public String getTotalSupply() {
        return this.totalSupply;
    }

    @JsonProperty("totalSupply")
    public void setTotalSupply(String totalSupply) {
        this.totalSupply = totalSupply;
    }

    public String getMaxSupply() {
        return this.maxSupply;
    }

    @JsonProperty("maxSupply")
    public void setMaxSupply(String maxSupply) {
        this.maxSupply = maxSupply;
    }

    public String getWebsite() {
        return this.website;
    }

    @JsonProperty("websiteUrl")
    public void setWebsite(String website) {
        this.website = website;
    }

    public String getExplorerUrls() {
        return this.explorerUrls;
    }

    @JsonProperty("explorerUrls")
    public void setExplorerUrls(String explorerUrls) {
        this.explorerUrls = explorerUrls;
    }

    public String getWhitePaperUrls() {
        return this.whitePaperUrls;
    }

    @JsonProperty("whitePaperUrls")
    public void setWhitePaperUrls(String whitePaperUrls) {
        this.whitePaperUrls = whitePaperUrls;
    }

    public String getGithubId() {
        return this.githubId;
    }

    @JsonProperty("githubId")
    public void setGithubId(String githubId) {
        this.githubId = githubId;
    }

    public String getTwitterId() {
        return this.twitterId;
    }

    @JsonProperty("twitterId")
    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    public String getFacebookId() {
        return this.facebookId;
    }

    @JsonProperty("facebookId")
    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public String getTelegramId() {
        return this.telegramId;
    }

    @JsonProperty("telegramId")
    public void setTelegramId(String telegramId) {
        this.telegramId = telegramId;
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    @JsonProperty("algorithm")
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getProof() {
        return this.proof;
    }

    @JsonProperty("proof")
    public void setProof(String proof) {
        this.proof = proof;
    }

    public String getIssueDate() {
        return this.issueDate;
    }

    @JsonProperty("issueDate")
    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public List<LinkedHashMap<String, String>> getDetails() {
        return this.details;
    }

    @JsonProperty("details")
    public void setDetails(List<LinkedHashMap<String, String>> details) {
        this.details = details;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Symbol)) return false;
        final Symbol other = (Symbol) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$slug = this.getSlug();
        final Object other$slug = other.getSlug();
        if (this$slug == null ? other$slug != null : !this$slug.equals(other$slug)) return false;
        final Object this$symbol = this.getSymbol();
        final Object other$symbol = other.getSymbol();
        if (this$symbol == null ? other$symbol != null : !this$symbol.equals(other$symbol)) return false;
        final Object this$fullname = this.getFullname();
        final Object other$fullname = other.getFullname();
        if (this$fullname == null ? other$fullname != null : !this$fullname.equals(other$fullname)) return false;
        final Object this$logoUrl = this.getLogoUrl();
        final Object other$logoUrl = other.getLogoUrl();
        if (this$logoUrl == null ? other$logoUrl != null : !this$logoUrl.equals(other$logoUrl)) return false;
        final Object this$volumeUsd = this.getVolumeUsd();
        final Object other$volumeUsd = other.getVolumeUsd();
        if (this$volumeUsd == null ? other$volumeUsd != null : !this$volumeUsd.equals(other$volumeUsd)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$marketCapUsd = this.getMarketCapUsd();
        final Object other$marketCapUsd = other.getMarketCapUsd();
        if (this$marketCapUsd == null ? other$marketCapUsd != null : !this$marketCapUsd.equals(other$marketCapUsd))
            return false;
        final Object this$availableSupply = this.getAvailableSupply();
        final Object other$availableSupply = other.getAvailableSupply();
        if (this$availableSupply == null ? other$availableSupply != null : !this$availableSupply.equals(other$availableSupply))
            return false;
        final Object this$totalSupply = this.getTotalSupply();
        final Object other$totalSupply = other.getTotalSupply();
        if (this$totalSupply == null ? other$totalSupply != null : !this$totalSupply.equals(other$totalSupply))
            return false;
        final Object this$maxSupply = this.getMaxSupply();
        final Object other$maxSupply = other.getMaxSupply();
        if (this$maxSupply == null ? other$maxSupply != null : !this$maxSupply.equals(other$maxSupply)) return false;
        final Object this$website = this.getWebsite();
        final Object other$website = other.getWebsite();
        if (this$website == null ? other$website != null : !this$website.equals(other$website)) return false;
        final Object this$explorerUrls = this.getExplorerUrls();
        final Object other$explorerUrls = other.getExplorerUrls();
        if (this$explorerUrls == null ? other$explorerUrls != null : !this$explorerUrls.equals(other$explorerUrls))
            return false;
        final Object this$whitePaperUrls = this.getWhitePaperUrls();
        final Object other$whitePaperUrls = other.getWhitePaperUrls();
        if (this$whitePaperUrls == null ? other$whitePaperUrls != null : !this$whitePaperUrls.equals(other$whitePaperUrls))
            return false;
        final Object this$githubId = this.getGithubId();
        final Object other$githubId = other.getGithubId();
        if (this$githubId == null ? other$githubId != null : !this$githubId.equals(other$githubId)) return false;
        final Object this$twitterId = this.getTwitterId();
        final Object other$twitterId = other.getTwitterId();
        if (this$twitterId == null ? other$twitterId != null : !this$twitterId.equals(other$twitterId)) return false;
        final Object this$facebookId = this.getFacebookId();
        final Object other$facebookId = other.getFacebookId();
        if (this$facebookId == null ? other$facebookId != null : !this$facebookId.equals(other$facebookId))
            return false;
        final Object this$telegramId = this.getTelegramId();
        final Object other$telegramId = other.getTelegramId();
        if (this$telegramId == null ? other$telegramId != null : !this$telegramId.equals(other$telegramId))
            return false;
        final Object this$algorithm = this.getAlgorithm();
        final Object other$algorithm = other.getAlgorithm();
        if (this$algorithm == null ? other$algorithm != null : !this$algorithm.equals(other$algorithm)) return false;
        final Object this$proof = this.getProof();
        final Object other$proof = other.getProof();
        if (this$proof == null ? other$proof != null : !this$proof.equals(other$proof)) return false;
        final Object this$issueDate = this.getIssueDate();
        final Object other$issueDate = other.getIssueDate();
        if (this$issueDate == null ? other$issueDate != null : !this$issueDate.equals(other$issueDate)) return false;
        final Object this$details = this.getDetails();
        final Object other$details = other.getDetails();
        if (this$details == null ? other$details != null : !this$details.equals(other$details)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Symbol;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $slug = this.getSlug();
        result = result * PRIME + ($slug == null ? 43 : $slug.hashCode());
        final Object $symbol = this.getSymbol();
        result = result * PRIME + ($symbol == null ? 43 : $symbol.hashCode());
        final Object $fullname = this.getFullname();
        result = result * PRIME + ($fullname == null ? 43 : $fullname.hashCode());
        final Object $logoUrl = this.getLogoUrl();
        result = result * PRIME + ($logoUrl == null ? 43 : $logoUrl.hashCode());
        final Object $volumeUsd = this.getVolumeUsd();
        result = result * PRIME + ($volumeUsd == null ? 43 : $volumeUsd.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $marketCapUsd = this.getMarketCapUsd();
        result = result * PRIME + ($marketCapUsd == null ? 43 : $marketCapUsd.hashCode());
        final Object $availableSupply = this.getAvailableSupply();
        result = result * PRIME + ($availableSupply == null ? 43 : $availableSupply.hashCode());
        final Object $totalSupply = this.getTotalSupply();
        result = result * PRIME + ($totalSupply == null ? 43 : $totalSupply.hashCode());
        final Object $maxSupply = this.getMaxSupply();
        result = result * PRIME + ($maxSupply == null ? 43 : $maxSupply.hashCode());
        final Object $website = this.getWebsite();
        result = result * PRIME + ($website == null ? 43 : $website.hashCode());
        final Object $explorerUrls = this.getExplorerUrls();
        result = result * PRIME + ($explorerUrls == null ? 43 : $explorerUrls.hashCode());
        final Object $whitePaperUrls = this.getWhitePaperUrls();
        result = result * PRIME + ($whitePaperUrls == null ? 43 : $whitePaperUrls.hashCode());
        final Object $githubId = this.getGithubId();
        result = result * PRIME + ($githubId == null ? 43 : $githubId.hashCode());
        final Object $twitterId = this.getTwitterId();
        result = result * PRIME + ($twitterId == null ? 43 : $twitterId.hashCode());
        final Object $facebookId = this.getFacebookId();
        result = result * PRIME + ($facebookId == null ? 43 : $facebookId.hashCode());
        final Object $telegramId = this.getTelegramId();
        result = result * PRIME + ($telegramId == null ? 43 : $telegramId.hashCode());
        final Object $algorithm = this.getAlgorithm();
        result = result * PRIME + ($algorithm == null ? 43 : $algorithm.hashCode());
        final Object $proof = this.getProof();
        result = result * PRIME + ($proof == null ? 43 : $proof.hashCode());
        final Object $issueDate = this.getIssueDate();
        result = result * PRIME + ($issueDate == null ? 43 : $issueDate.hashCode());
        final Object $details = this.getDetails();
        result = result * PRIME + ($details == null ? 43 : $details.hashCode());
        return result;
    }

    public String toString() {
        return "Symbol(slug=" + this.getSlug() + ", symbol=" + this.getSymbol() + ", fullname=" + this.getFullname() + ", logoUrl=" + this.getLogoUrl() + ", volumeUsd=" + this.getVolumeUsd() + ", status=" + this.getStatus() + ", marketCapUsd=" + this.getMarketCapUsd() + ", availableSupply=" + this.getAvailableSupply() + ", totalSupply=" + this.getTotalSupply() + ", maxSupply=" + this.getMaxSupply() + ", website=" + this.getWebsite() + ", explorerUrls=" + this.getExplorerUrls() + ", whitePaperUrls=" + this.getWhitePaperUrls() + ", githubId=" + this.getGithubId() + ", twitterId=" + this.getTwitterId() + ", facebookId=" + this.getFacebookId() + ", telegramId=" + this.getTelegramId() + ", algorithm=" + this.getAlgorithm() + ", proof=" + this.getProof() + ", issueDate=" + this.getIssueDate() + ", details=" + this.getDetails() + ")";
    }
}
