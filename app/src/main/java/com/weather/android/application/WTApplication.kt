package com.weather.android.application

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import com.blankj.utilcode.util.Utils

class WTApplication:Application() {
    companion object{
        @SuppressLint("staticFieldLeak")
        lateinit var context:Context
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
        // init it in the function of onCreate in ur Application
        Utils.init(this);
    }
}