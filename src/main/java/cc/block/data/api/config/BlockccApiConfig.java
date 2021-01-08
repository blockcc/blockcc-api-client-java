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

package cc.block.data.api.config;

/**
 * @author lijiaxing
 * <p>
 * Configuration used for Blockcc operations.
 */
public class BlockccApiConfig {

    private static final String BASE_URL = "https://data.block.cc";

    private static final String BASE_STREAM_URL = "wss://data.block.cc/ws/v3";


    private BlockccApiConfig() {
        throw new IllegalStateException("Config class");
    }

    /**
     * REST API base URL.
     *
     * @return baseURL
     */
    public static String getBaseUrl() {
        return BASE_URL;
    }

    public static String getBaseStreamUrl(String apiKey) {
        return BASE_STREAM_URL + "?api_key=" + apiKey;
    }
}
