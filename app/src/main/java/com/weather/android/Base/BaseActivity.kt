package com.weather.android.Base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blankj.utilcode.util.FragmentUtils.getSimpleName
import com.blankj.utilcode.util.LogUtils

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LogUtils.d("${packageName} is onCreate ")
    }
}