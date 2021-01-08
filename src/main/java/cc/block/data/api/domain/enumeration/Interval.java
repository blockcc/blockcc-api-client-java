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

package cc.block.data.api.domain.enumeration;


/**
 * @author lijiaxing
 */
public enum Interval {
    // kline type
    ONE_MIN(1, "1m"),
    FIVE_MIN(5, "5m"),
    FIFTEEN_MIN(15, "15m"),
    THIRTY_MIN(30, "30m"),
    ONE_HOUR(1, "1h"),
    TWO_HOUR(2, "2h"),
    SIX_HOUR(6, "6h"),
    ONE_DAY(1, "1d"),
    TWO_DAY(2, "2d"),
    SEVEN_DAY(7, "7d");

    private int duration;
    private String key;

    Interval(int i, String s) {
        this.duration = i;
        this.key = s;
    }
}
