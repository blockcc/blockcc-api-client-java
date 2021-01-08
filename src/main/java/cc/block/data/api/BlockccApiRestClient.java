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

import cc.block.data.api.domain.BlockccResponse;
import cc.block.data.api.domain.market.*;
import cc.block.data.api.domain.market.request.*;
import cc.block.data.api.domain.news.Announcement;
import cc.block.data.api.domain.news.Article;
import cc.block.data.api.domain.news.Brief;
import cc.block.data.api.domain.news.SocialMedia;
import cc.block.data.api.domain.news.request.AnnouncementParam;
import cc.block.data.api.domain.news.request.ArticleParam;
import cc.block.data.api.domain.news.request.BriefParam;
import cc.block.data.api.domain.news.request.SocialMediaParam;

import java.util.List;

/**
 * @author lijiaxing
 */
public interface BlockccApiRestClient {


    /**
     * get Tickers By tickerParams
     *
     * @param tickerParams Ticker Request Parameter
     * @return BlockccResponse:a list of ticker
     */
    BlockccResponse<List<Ticker>> getTickers(TickerParam tickerParams);

    /**
     * get Markets By marketParams
     *
     * @param marketParams Market Request Parameter
     * @return BlockccResponse:a list of Market
     */
    BlockccResponse<List<Market>> getMarkets(MarketParam marketParams);

    /**
     * get Prices By priceParams
     *
     * @param priceParams Ticker Request Parameter
     * @return BlockccResponse:a list of Price
     */
    BlockccResponse<List<Price>> getPrices(PriceParam priceParams);

    /**
     * get historicalPrice By historicalPriceParams
     *
     * @param historicalPriceParams HistoricalPrice Request Parameter
     * @return BlockccResponse:a list of historicalPrice
     */
    BlockccResponse<List<HistoricalPrice>> getHistoricalPrice(HistoricalPriceParam historicalPriceParams);

    /**
     * get Symbols By symbolParams
     *
     * @param symbolParams symbol Request Parameter
     * @return BlockccResponse:a list of tickers
     */
    BlockccResponse<List<Symbol>> getSymbols(SymbolParam symbolParams);

    /**
     * get Kline By klineParams
     *
     * @param klineParams Kline Request Parameter
     * @return BlockccResponse：a list of kline
     */
    BlockccResponse<List<Kline>> getKline(KlineParam klineParams);

    /**
     * get OrderBooks By orderBookParams
     *
     * @param orderBookParams OrderBook Request Parameter
     * @return BlockccResponse:a list of OrderBook
     */
    BlockccResponse<OrderBook> getOrderBook(OrderBookParam orderBookParams);

    /**
     * get Trades By tradeParams
     *
     * @param tradeParams Trade Request Parameter
     * @return BlockccResponse:a list of Trade
     */
    BlockccResponse<List<Trade>> getTrades(TradeParam tradeParams);

    /**
     * get Briefs By briefParams
     *
     * @param briefParams Brief Request Parameter
     * @return BlockccResponse:a list of Brief
     */
    BlockccResponse<List<Brief>> getBriefs(BriefParam briefParams);

    /**
     * get Announcement By announcementParams
     *
     * @param announcementParams AnnouncementParams Request Parameter
     * @return BlockccResponse:a list of Announcement
     */
    BlockccResponse<List<Announcement>> getAnnouncements(AnnouncementParam announcementParams);

    /**
     * get Article By articleParams
     *
     * @param articleParams Article Request Parameter
     * @return BlockccResponse:a list of Article
     */
    BlockccResponse<List<Article>> getArticles(ArticleParam articleParams);

    /**
     * get SocialMedia By socialMediaParams
     *
     * @param socialMediaParams SocialMedia Request Parameter
     * @return BlockccResponse:a list of SocialMedia
     */
    BlockccResponse<List<SocialMedia>> getSocialMedias(SocialMediaParam socialMediaParams);
}
