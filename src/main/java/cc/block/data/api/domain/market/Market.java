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

/**
 * @author lijiaxing
 *
 *  market
 */
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Market {
    /**
     * Market slug (ID)
     */
    @JsonProperty("slug")
    private String slug;
    /**
     * Full Market Name
     */
    @JsonProperty("fullname")
    private String fullname;
    /**
     * Exchange's official website link
     */
    @JsonProperty("websiteUrl")
    private String websiteUrl;

    /**
     * (old) Transaction volume (USD) counted by human intervention
     */
    @JsonProperty("volume")
    private Double volume;

    /**
     * Exchange reported trading volume (USD)
     */
    @JsonProperty("reportedVolume")
    private Double reportedVolume;
    /**
     * Estimated Trading Volume (USD)
     */
    @JsonProperty("expectedVolume")
    private Double expectedVolume;

    /**
     * Status: [enable, disable]. disable is to stop updating data
     */
    @JsonProperty("status")
    private String status;

    /**
     * Is access K-line data
     */
    @JsonProperty("kline")
    private Boolean kline;

    /**
     * Is spot market
     */
    @JsonProperty("spot")
    private Boolean spot;

    /**
     * Is futures market
     */
    @JsonProperty("futures")
    private Boolean futures;
}
