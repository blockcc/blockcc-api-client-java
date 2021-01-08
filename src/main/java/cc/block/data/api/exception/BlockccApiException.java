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

package cc.block.data.api.exception;

import cc.block.data.api.BlockccApiError;

/**
 * @author lijiaxing
 * <p>
 * An exception which can occur while invoking methods of the Blockcc API.
 */
public class BlockccApiException extends RuntimeException {

    private static final long serialVersionUID = 3788669840036201041L;
    /**
     * Error response object returned by Blockcc API.
     */
    private BlockccApiError error;

    /**
     * Instantiates a new Blockcc api exception.
     *
     * @param error an error response object
     */
    public BlockccApiException(BlockccApiError error) {
        this.error = error;
    }

    /**
     * Instantiates a new Blockcc api exception.
     */
    public BlockccApiException() {
        super();
    }

    /**
     * Instantiates a new Blockcc api exception.
     *
     * @param message the message
     */
    public BlockccApiException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Blockcc api exception.
     *
     * @param cause the cause
     */
    public BlockccApiException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new Blockcc api exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public BlockccApiException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @return the response error object from Blockcc API, or null if no response object was returned (e.g. server returned 500).
     */
    public BlockccApiError getError() {
        return error;
    }

    @Override
    public String getMessage() {
        if (error != null) {
            return error.getMsg();
        }
        return super.getMessage();
    }
}