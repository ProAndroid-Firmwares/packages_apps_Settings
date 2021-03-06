/*
 * Copyright (C) 2017 The ProAndroid-Firmwares
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.settings.deviceinfo;

import android.content.Context;
import android.os.SystemProperties;
import android.support.v7.preference.Preference;

import com.android.settings.core.PreferenceController;
import com.android.settings.R;
import com.android.settings.Utils;

public class ProandroidbuilddatePreferenceController extends PreferenceController {

    private static final String PROANDROID_BUILD_DATE = "proandroid_build_date";
    private static final String PROANDROID_BUILD_DATE_PROP = "ro.build.date";

    public ProandroidbuilddatePreferenceController(Context context) {
        super(context);
    }

    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public String getPreferenceKey() {
        return PROANDROID_BUILD_DATE;
    }

    @Override
    public void updateState(Preference preference) {
        super.updateState(preference);
        preference.setSummary(SystemProperties.get(PROANDROID_BUILD_DATE_PROP,
                mContext.getResources().getString(R.string.device_info_default)));
    }
} 
