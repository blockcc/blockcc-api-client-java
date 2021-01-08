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

package cc.block.data.api;


import cc.block.data.api.domain.Event;
import cc.block.data.api.domain.market.OrderBook;
import cc.block.data.api.domain.market.Price;
import cc.block.data.api.domain.market.Ticker;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author lijiaxing
 */
public interface BlockccApiWebSocketClient extends Closeable {


    /**
     * get Connection to Blockcc WebSocket
     *
     * @param callback Event call back from blockcc
     * @param msg      message which we send on websocket client opened
     * @return Closeable client
     */
    Closeable getConnection(BlockccApiCallback<Event<Object>> callback, String msg);

    /**
     * get Connection to Blockcc WebSocket
     *
     * @param callback Event call back from blockcc
     * @param desc     marketPair which we send on websocket client opened,pairs can be separated by ','
     * @return Closeable client
     */
    Closeable getTickers(BlockccApiCallback<Event<Ticker>> callback, String desc);

    /**
     * get Connection to Blockcc WebSocket
     *
     * @param callback Event call back from blockcc
     * @param desc     marketPair which we send on websocket client opened,pairs can be separated by ','
     * @return Closeable client
     */
    Closeable getOrderBooks(BlockccApiCallback<Event<OrderBook>> callback, String desc);

    /**
     * get Connection to Blockcc WebSocket
     *
     * @param callback Event call back from blockcc
     * @param desc     coin slug which we send on websocket client opened,pairs can be separated by ','
     * @return Closeable client
     */
    Closeable getPrices(BlockccApiCallback<Event<Price>> callback, String desc);

    /**
     * close client
     *
     * @throws IOException /
     */
    @Deprecated
    @Override
    void close() throws IOException;
}
