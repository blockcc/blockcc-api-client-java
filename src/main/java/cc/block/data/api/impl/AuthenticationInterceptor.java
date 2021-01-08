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


import cc.block.data.api.constant.BlockccApiConstants;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;

import java.io.IOException;
import java.util.Objects;

/**
 * A request interceptor that injects the API Key Header into requests, whenever required.
 *
 * @author lijiaxing
 */
public class AuthenticationInterceptor implements Interceptor {

    private final String apiKey;


    public AuthenticationInterceptor(String apiKey) {
        this.apiKey = apiKey;

    }

    /**
     * Extracts the request body into a String.
     *
     * @return request body as a string
     */
    @SuppressWarnings("unused")
    private static String bodyToString(RequestBody request) {
        try (final Buffer buffer = new Buffer()) {
            if (request != null) {
                request.writeTo(buffer);
            } else {
                return "";
            }
            return buffer.readUtf8();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        Request.Builder newRequestBuilder = original.newBuilder();


        // Endpoint requires sending a valid API-KEY

        newRequestBuilder.addHeader(BlockccApiConstants.HEADER_API_KEY, apiKey);

        // Build new request after adding the necessary authentication information
        Request newRequest = newRequestBuilder.build();
        return chain.proceed(newRequest);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final AuthenticationInterceptor that = (AuthenticationInterceptor) o;
        return Objects.equals(apiKey, that.apiKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiKey);
    }
}
