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

import cc.block.data.api.BlockccApiRestClient;
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
import okhttp3.Cache;

import java.util.List;

/**
 * @author lijiaxing
 */
public class BlockccApiRestClientImpl implements BlockccApiRestClient {

    private final BlockccApiService blockccApiService;


    public BlockccApiRestClientImpl(String apiKey, String host, Cache cache) {
        blockccApiService = BlockccApiServiceGenerator.createService(BlockccApiService.class, host, apiKey, cache);
    }

    @Override
    public BlockccResponse<List<Ticker>> getTickers(TickerParam tickerParams) {
        return BlockccApiServiceGenerator.executeSync(blockccApiService.getTickers(tickerParams.toMap()));
    }

    @Override
    public BlockccResponse<List<Market>> getMarkets(MarketParam marketParams) {
        return BlockccApiServiceGenerator.executeSync(blockccApiService.getMarkets(marketParams.toMap()));
    }

    @Override
    public BlockccResponse<List<Price>> getPrices(PriceParam priceParams) {
        return BlockccApiServiceGenerator.executeSync(blockccApiService.getPrices(priceParams.toMap()));
    }

    @Override
    public BlockccResponse<List<HistoricalPrice>> getHistoricalPrice(HistoricalPriceParam historicalPriceParams) {
        return BlockccApiServiceGenerator.executeSync(blockccApiService.getHistoricalPrice(historicalPriceParams.toMap()));
    }

    @Override
    public BlockccResponse<List<Symbol>> getSymbols(SymbolParam symbolParams) {
        return BlockccApiServiceGenerator.executeSync(blockccApiService.getSymbols(symbolParams.toMap()));
    }

    @Override
    public BlockccResponse<List<Kline>> getKline(KlineParam klineParams) {
        return BlockccApiServiceGenerator.executeSync(blockccApiService.getKline(klineParams.toMap()));
    }

    @Override
    public BlockccResponse<OrderBook> getOrderBook(OrderBookParam orderBookParams) {
        return BlockccApiServiceGenerator.executeSync(blockccApiService.getOrderBook(orderBookParams.toMap()));
    }

    @Override
    public BlockccResponse<List<Trade>> getTrades(TradeParam tradeParams) {
        return BlockccApiServiceGenerator.executeSync(blockccApiService.getTrades(tradeParams.toMap()));
    }

    @Override
    public BlockccResponse<List<Brief>> getBriefs(BriefParam briefParams) {
        return BlockccApiServiceGenerator.executeSync(blockccApiService.getBriefs(briefParams.toMap()));
    }

    @Override
    public BlockccResponse<List<Announcement>> getAnnouncements(AnnouncementParam announcementParams) {
        return BlockccApiServiceGenerator.executeSync(blockccApiService.getAnnouncements(announcementParams.toMap()));
    }

    @Override
    public BlockccResponse<List<Article>> getArticles(ArticleParam articleParams) {
        return BlockccApiServiceGenerator.executeSync(blockccApiService.getArticles(articleParams.toMap()));
    }

    @Override
    public BlockccResponse<List<SocialMedia>> getSocialMedias(SocialMediaParam socialMediaParams) {
        return BlockccApiServiceGenerator.executeSync(blockccApiService.getSocialMedias(socialMediaParams.toMap()));
    }
}
