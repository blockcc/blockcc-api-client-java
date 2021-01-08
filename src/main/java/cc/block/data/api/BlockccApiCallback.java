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

/**
 * BlockccApiCallback is a functional interface used together with the BlockccApiAsyncClient to provide a non-blocking REST client.
 *
 * @param <T> the return type from the callback
 * @author lijiaxing
 */
@FunctionalInterface
public interface BlockccApiCallback<T> {

    /**
     * Called whenever a response comes back from the Blockcc API.
     *
     * @param response the expected response object
     */
    void onResponse(T response);

    /**
     * Called whenever an error occurs.
     *
     * @param cause the cause of the failure
     */
    default void onFailure(Throwable cause) {
        System.err.println("Web socket failed");
        cause.printStackTrace(System.err);
    }
}