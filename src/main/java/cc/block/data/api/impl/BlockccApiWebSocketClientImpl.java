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

package cc.block.data.api.impl;

import cc.block.data.api.BlockccApiCallback;
import cc.block.data.api.BlockccApiWebSocketClient;
import cc.block.data.api.config.BlockccApiConfig;
import cc.block.data.api.domain.Event;
import cc.block.data.api.domain.market.OrderBook;
import cc.block.data.api.domain.market.Price;
import cc.block.data.api.domain.market.Ticker;
import com.fasterxml.jackson.core.type.TypeReference;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.WebSocket;

import java.io.Closeable;

/**
 * @author lijiaxing
 */
public class BlockccApiWebSocketClientImpl implements BlockccApiWebSocketClient, Closeable {

    private final OkHttpClient client;
    private final String apiKey;

    public BlockccApiWebSocketClientImpl(OkHttpClient client, String apiKey) {
        this.client = client;
        this.apiKey = apiKey;
    }

    @Override
    public Closeable getConnection(BlockccApiCallback<Event<Object>> callback, String msg) {
        return createNewWebSocket(apiKey, new BlockccApiWebSocketListener<>(callback, new TypeReference<Event<Object>>() {
        }, msg));
    }

    @Override
    public Closeable getTickers(BlockccApiCallback<Event<Ticker>> callback, String desc) {

        return createNewWebSocket(apiKey, new BlockccApiWebSocketListener<>(callback, new TypeReference<Event<Ticker>>() {
        }, desc));
    }

    @Override
    public Closeable getOrderBooks(BlockccApiCallback<Event<OrderBook>> callback, String desc) {
        return createNewWebSocket(apiKey, new BlockccApiWebSocketListener<>(callback, new TypeReference<Event<OrderBook>>() {
        }, desc));
    }

    @Override
    public Closeable getPrices(BlockccApiCallback<Event<Price>> callback, String desc) {
        return createNewWebSocket(apiKey, new BlockccApiWebSocketListener<>(callback, new TypeReference<Event<Price>>() {
        }, desc));
    }

    /**
     * @deprecated This method is no longer functional. Please use the returned {@link Closeable} from any of the other methods to close the web socket.
     */
    @Override
    @Deprecated
    public void close() {
    }

    private Closeable createNewWebSocket(String apiKey, BlockccApiWebSocketListener<?> listener) {
        Request request = new Request.Builder().url(BlockccApiConfig.getBaseStreamUrl(apiKey)).build();
        WebSocket websocket = client.newWebSocket(request, listener);
        return () -> {
            final int code = 1000;
            listener.onClosing(websocket, code, null);
            websocket.close(code, null);
            listener.onClosed(websocket, code, null);
        };
    }
}
