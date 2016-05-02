/*
 * Copyright 2015 Google Inc. All rights reserved.
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

package com.google.samples.apps.iosched;

<<<<<<< HEAD
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.security.ProviderInstaller;
import com.google.samples.apps.iosched.settings.SettingsUtils;
import com.google.samples.apps.iosched.util.AnalyticsHelper;
=======
import com.google.android.gms.security.ProviderInstaller;
import com.google.samples.apps.iosched.settings.SettingsUtils;
import com.google.samples.apps.iosched.util.AnalyticsHelper;
import com.google.samples.apps.iosched.util.LogUtils;
>>>>>>> ioschedLarry/master

import android.app.Application;
import android.content.Intent;

import static com.google.samples.apps.iosched.util.LogUtils.LOGE;
import static com.google.samples.apps.iosched.util.LogUtils.LOGW;
import static com.google.samples.apps.iosched.util.LogUtils.makeLogTag;

/**
 * {@link android.app.Application} used to initialize Analytics. Code initialized in
 * Application classes is rare since this code will be run any time a ContentProvider, Activity,
 * or Service is used by the user or system. Analytics, dependency injection, and multi-dex
 * frameworks are in this very small set of use cases.
 */
public class AppApplication extends Application {

<<<<<<< HEAD
    private static final String TAG = makeLogTag(AppApplication.class);
=======
    private static final String TAG = LogUtils.makeLogTag(AppApplication.class);
>>>>>>> ioschedLarry/master

    @Override
    public void onCreate() {
        super.onCreate();
        AnalyticsHelper.prepareAnalytics(getApplicationContext());
        SettingsUtils.markDeclinedWifiSetup(getApplicationContext(), false);

        // Ensure an updated security provider is installed into the system when a new one is
        // available via Google Play services.
        try {
            ProviderInstaller.installIfNeededAsync(getApplicationContext(),
                    new ProviderInstaller.ProviderInstallListener() {
                        @Override
                        public void onProviderInstalled() {
<<<<<<< HEAD
                            LOGW(TAG, "New security provider installed.");
=======
                            LogUtils.LOGW(TAG, "New security provider installed.");
>>>>>>> ioschedLarry/master
                        }

                        @Override
                        public void onProviderInstallFailed(int errorCode, Intent intent) {
<<<<<<< HEAD
                            LOGE(TAG, "New security provider install failed.");
=======
                            LogUtils.LOGE(TAG, "New security provider install failed.");
>>>>>>> ioschedLarry/master
                            // No notification shown there is no user intervention needed.
                        }
                    });
        } catch (Exception ignorable) {
<<<<<<< HEAD
            LOGE(TAG, "Unknown issue trying to install a new security provider.", ignorable);
=======
            LogUtils.LOGE(TAG, "Unknown issue trying to install a new security provider.", ignorable);
>>>>>>> ioschedLarry/master
        }
    }
}
