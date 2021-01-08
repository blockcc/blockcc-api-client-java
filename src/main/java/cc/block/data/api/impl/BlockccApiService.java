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

import cc.block.data.api.domain.market.*;
import cc.block.data.api.domain.news.Announcement;
import cc.block.data.api.domain.news.Article;
import cc.block.data.api.domain.news.Brief;
import cc.block.data.api.domain.news.SocialMedia;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

/**
 * @author lijiaxing
 */
public interface BlockccApiService {

    /**
     * get tickers by tickerParam
     *
     * @param tickerParams a map of tickerParam for query
     * @return a list of ticker
     */
    @GET("/api/v3/tickers")
    Call<List<Ticker>> getTickers(@QueryMap Map<String, Object> tickerParams);

    /**
     * get markets
     *
     * @param marketParams a map of marketParams for query
     * @return a list of markets
     */
    @GET("/api/v3/markets")
    Call<List<Market>> getMarkets(@QueryMap Map<String, Object> marketParams);

    /**
     * get symbols
     *
     * @param symbolParams a map of symbolParams for query
     * @return a list of symbols
     */
    @GET("/api/v3/symbols")
    Call<List<Symbol>> getSymbols(@QueryMap Map<String, Object> symbolParams);

    /**
     * get prices
     *
     * @param priceParams a map of priceParams for query
     * @return a list of price
     */
    @GET("/api/v3/price")
    Call<List<Price>> getPrices(@QueryMap Map<String, Object> priceParams);

    /**
     * get historyPrice
     *
     * @param historicalPriceParams a map of historicalPriceParams for query
     * @return a list of history price
     */
    @GET("/api/v3/price/history")
    Call<List<HistoricalPrice>> getHistoricalPrice(@QueryMap Map<String, Object> historicalPriceParams);

    /**
     * get kline
     *
     * @param klineParams a map of klineParams for query
     * @return a list of kline
     */
    @GET("/api/v3/kline")
    Call<List<Kline>> getKline(@QueryMap Map<String, Object> klineParams);

    /**
     * get one OrderBook
     *
     * @param orderBookParams a map of orderBookParams for query
     * @return a orderBook
     */
    @GET("/api/v3/orderbook")
    Call<OrderBook> getOrderBook(@QueryMap Map<String, Object> orderBookParams);


    /**
     * get trades
     *
     * @param tradeParams a map of tradeParams for query
     * @return a list of trades
     */
    @GET("/api/v3/trades")
    Call<List<Trade>> getTrades(@QueryMap Map<String, Object> tradeParams);

    /**
     * get briefs
     *
     * @param briefParams a map of briefParams for query
     * @return a list of Brief
     */
    @GET("/api/v3/briefs")
    Call<List<Brief>> getBriefs(@QueryMap Map<String, Object> briefParams);

    /**
     * get announcements
     *
     * @param announcementParams a map of announcementParams for query
     * @return a list of Announcement
     */
    @GET("/api/v3/announcements")
    Call<List<Announcement>> getAnnouncements(@QueryMap Map<String, Object> announcementParams);

    /**
     * get articles
     *
     * @param articleParams a map of articleParams for query
     * @return a list of Article
     */
    @GET("/api/v3/articles")
    Call<List<Article>> getArticles(@QueryMap Map<String, Object> articleParams);

    /**
     * get social media
     *
     * @param socialMediaParams a map of socialMediaParams for query
     * @return a list of SocialMedia
     */
    @GET("/api/v3/social_media")
    Call<List<SocialMedia>> getSocialMedias(@QueryMap Map<String, Object> socialMediaParams);


}
