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
import cc.block.data.api.domain.news.Announcement;
import cc.block.data.api.domain.news.request.AnnouncementParam;

import java.util.Locale;

/**
 * @author lijiaxing
 * @date 2020/10/20
 * @see BlockccApiRestClient#getAnnouncements(AnnouncementParam) (cc.block.api.client.aomain.market.request.AnnouncementParams)
 * All Announcements channel examples.
 * It illustrates how to create a stream to obtain all Announcements.
 */
public class AnnouncementsExample {
    public static void main(String[] args) {
        BlockccApiClientFactory factory = BlockccApiClientFactory.newInstance("YOUR_API_KEY");
        BlockccApiRestClient client = factory.newRestClient();
        AnnouncementParam announcementParams = AnnouncementParam.builder().locale(Locale.US).build();
        for (Announcement announcement : client.getAnnouncements(announcementParams).getContent()) {
            System.out.println(announcement);
        }
    }
}
