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
import cc.block.data.api.exception.BlockccApiException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

import java.io.IOException;

/**
 * Blockcc API WebSocket listener.
 *
 * @author lijiaxing
 */
public class BlockccApiWebSocketListener<T> extends WebSocketListener {

    private static final ObjectMapper MAPPER = new ObjectMapper();
    private final ObjectReader objectReader;
    private final String msg;
    private final BlockccApiCallback<T> callback;
    private boolean closing = false;

    public BlockccApiWebSocketListener(BlockccApiCallback<T> callback, Class<T> eventClass, String msg) {
        this.callback = callback;
        this.objectReader = MAPPER.readerFor(eventClass);
        this.msg = msg;
    }


    public BlockccApiWebSocketListener(BlockccApiCallback<T> callback, TypeReference<T> eventTypeReference, String msg) {
        this.callback = callback;
        this.objectReader = MAPPER.readerFor(eventTypeReference);
        this.msg = msg;
    }

    @Override
    public void onOpen(WebSocket websocket, Response response) {
        try {
            websocket.send(msg);
        } catch (Exception e) {
            throw new BlockccApiException(e);
        }
    }

    @Override
    public void onMessage(WebSocket websocket, String text) {
        try {
            T event = objectReader.readValue(text);
            callback.onResponse(event);
        } catch (IOException e) {
            throw new BlockccApiException(e);
        }
    }

    @Override
    public void onClosing(final WebSocket websocket, final int code, final String reason) {
        closing = true;
    }

    @Override
    public void onFailure(WebSocket websocket, Throwable t, Response response) {
        if (!closing) {
            callback.onFailure(t);
        }
    }

}