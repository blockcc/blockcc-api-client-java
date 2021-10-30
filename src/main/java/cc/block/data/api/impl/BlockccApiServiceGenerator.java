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

package cc.block.data.api.impl;

import cc.block.data.api.BlockccApiError;
import cc.block.data.api.domain.BlockccResponse;
import cc.block.data.api.exception.BlockccApiException;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Cache;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author lijiaxing
 * <p>
 * Generates a Blockcc API implementation based on @see {@link BlockccApiService}.
 */
public class BlockccApiServiceGenerator {

    private static final Converter.Factory CONVERTER_FACTORY = JacksonConverterFactory.create();
    private static final OkHttpClient SHARED_CLIENT;

    static {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequestsPerHost(500);
        dispatcher.setMaxRequests(500);
        SHARED_CLIENT = new OkHttpClient.Builder()
                .dispatcher(dispatcher)
                .pingInterval(20, TimeUnit.SECONDS).build();
    }

    private BlockccApiServiceGenerator() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Using cache will save a lot of traffic
     * please set the cache directory according to your own operating system when calling
     * <p>
     * for example:
     * <p>
     * BlockccApiRestClient client = factory.newRestClient(new Cache(new File("/"), 100));
     *
     * @param serviceClass /
     * @param apiKey       /
     * @param cache        /
     * @param <S>          /
     * @return /
     */
    public static <S> S createService(Class<S> serviceClass, String apiKey, String host, Cache cache) {
        String url = "https://" + host;

        AuthenticationInterceptor interceptor = new AuthenticationInterceptor(apiKey);

        OkHttpClient.Builder builder = SHARED_CLIENT.newBuilder().addInterceptor(interceptor);
        if (cache != null) {
            builder.cache(cache);
        }

        OkHttpClient adaptedClient = builder.build();

        Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(CONVERTER_FACTORY);
        retrofitBuilder.client(adaptedClient);
        Retrofit retrofit = retrofitBuilder.build();
        return retrofit.create(serviceClass);
    }

    /**
     * Execute a REST call and block until the response is received.
     *
     * @param call rest call
     * @param <T>  response class
     * @return exp
     */
    public static <T> BlockccResponse<T> executeSync(Call<T> call) {
        try {
            Response<T> response = call.execute();
            if (response.isSuccessful()) {
                return new BlockccResponse<>(response);
            }

            BlockccApiError apiError = getBlockccApiError(response);
            throw new BlockccApiException(apiError);
        } catch (IOException e) {
            throw new BlockccApiException(e);
        }
    }


    public static BlockccApiError getBlockccApiError(Response<?> response) throws BlockccApiException {
        if (response.errorBody() == null) {
            return new BlockccApiError();
        }
        String errorBody;
        try {
            errorBody = response.errorBody().string();
        } catch (IOException e) {
            return new BlockccApiError();
        }
        try {
            return new ObjectMapper().readValue(errorBody, BlockccApiError.class);
        } catch (IOException e) {
            return new BlockccApiError();
        }
    }

    /**
     * Returns the shared OkHttpClient instance.
     *
     * @return ShareClient
     */
    public static OkHttpClient getSharedClient() {
        return SHARED_CLIENT;
    }
}
