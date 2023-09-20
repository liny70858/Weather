package com.weather.android.activity
import com.blankj.utilcode.util.LogUtils
import com.weather.android.Base.BaseActivity
import com.weather.android.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding,MainActivityViewModel>() {
    override fun getViewBindingClass(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun getViewModelClass(): Class<MainActivityViewModel> {
        return MainActivityViewModel::class.java
    }

    override fun initData() {
        LogUtils.d("activity initData")
    }

    override fun initOnListener() {
        LogUtils.d("activity initOnListener")
    }

    override fun initObserver() {
        LogUtils.d("activity initObserver")
    }

    override fun destroy() {
        LogUtils.d("activity destroy")
    }

}