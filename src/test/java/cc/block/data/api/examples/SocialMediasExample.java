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

package cc.block.data.api.examples;

import cc.block.data.api.BlockccApiClientFactory;
import cc.block.data.api.BlockccApiRestClient;
import cc.block.data.api.domain.enumeration.SocialMediaSource;
import cc.block.data.api.domain.news.SocialMedia;
import cc.block.data.api.domain.news.request.SocialMediaParam;

/**
 * @author lijiaxing
 * @date 2020/10/21
 * @see BlockccApiRestClient#getSocialMedias(SocialMediaParam) (cc.block.api.client.aomain.market.request.SocialMediaParams)
 * Example for fetch Social Media
 */
public class SocialMediasExample {
    public static void main(String[] args) {
        BlockccApiClientFactory factory = BlockccApiClientFactory.newInstance("YOUR_API_KEY");
        BlockccApiRestClient client = factory.newRestClient();
        SocialMediaParam socialMediaParams = SocialMediaParam.builder().source(SocialMediaSource.WEIBO).build();
        for (SocialMedia socialMedia : client.getSocialMedias(socialMediaParams).getContent()) {
            System.out.println(socialMedia);
        }
    }
}
