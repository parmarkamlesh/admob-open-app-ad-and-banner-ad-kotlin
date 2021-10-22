package com.testing.adapp

import android.app.Application
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.RequestConfiguration
import com.testing.adapp.openappad.AppOpenManager


class MyApplication :Application() {
    private var appOpenManager: AppOpenManager? = null
    override fun onCreate() {
        super.onCreate()
    /*
    * Use either TestDeviceId or use test ad id. Dont use both.
    * Otherwise you will get. no adconfig.
    * here i am using test device id
    * */
    val configuration = RequestConfiguration.Builder()
        .setTestDeviceIds(listOf("ED3BE027DB706238F3911910182E06D3")).build()
    MobileAds.setRequestConfiguration(configuration)

    MobileAds.initialize(this){    }
    appOpenManager = AppOpenManager(this)

    }
}