/*
 * Copyright (c) 2021. Block.cc Inc @ https://block.cc.
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

package cc.block.data.api;

import cc.block.data.api.impl.BlockccApiRestClientImpl;
import cc.block.data.api.impl.BlockccApiServiceGenerator;
import cc.block.data.api.impl.BlockccApiWebSocketClientImpl;
import okhttp3.Cache;

/**
 * @author lijiaxing
 * <p>
 * A factory for creating BlockccApi client objects.
 */
public class BlockccApiClientFactory {

    /**
     * api key
     */
    private final String apiKey;

    public BlockccApiClientFactory(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * New instance.
     *
     * @param apiKey the API key
     * @return the Blockcc api client factory
     */
    public static BlockccApiClientFactory newInstance(String apiKey) {
        return new BlockccApiClientFactory(apiKey);
    }

    /**
     * Creates a new synchronous/blocking REST client.
     *
     * @return BlockccApiRestClient
     */
    public BlockccApiRestClient newRestClient() {

        return new BlockccApiRestClientImpl(apiKey);
    }

    /**
     * Creates a new synchronous/blocking REST client.
     *
     * @param cache /
     * @return apiClient
     */
    public BlockccApiRestClient newRestClient(Cache cache) {
        return new BlockccApiRestClientImpl(apiKey, cache);
    }

    /**
     * Creates a new web socket client used for handling data streams.
     *
     * @return BlockccApiWebSocketClient
     */
    public BlockccApiWebSocketClient newWebSocketClient() {
        return new BlockccApiWebSocketClientImpl(BlockccApiServiceGenerator.getSharedClient(), apiKey);
    }
}
