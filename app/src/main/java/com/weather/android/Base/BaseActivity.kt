package com.weather.android.Base

import android.content.Context
import android.os.Bundle
import android.view.KeyEvent
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.blankj.utilcode.util.BarUtils
import com.blankj.utilcode.util.BusUtils
import com.blankj.utilcode.util.LanguageUtils
import com.blankj.utilcode.util.LogUtils
import com.weather.android.application.WTApplication

abstract class BaseActivity<VB : ViewBinding, VM : BaseViewModel> : AppCompatActivity() {
    protected var viewBinding: VB? = null
    protected var mViewModel: VM? = null
    protected var mApplication: WTApplication? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding=getViewBindingClass()
        mViewModel = ViewModelProvider(this)[getViewModelClass()]
        mApplication = application as WTApplication
        setContentView(viewBinding?.root)
        LogUtils.d("onCreate:${javaClass.name}")
    }
    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(LanguageUtils.attachBaseContext(newBase))
    }
    //隐藏导航栏
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (BarUtils.isNavBarVisible(this)) {
            BarUtils.setNavBarVisibility(this, false)
        }
    }
    //屏幕触摸事件
    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        return super.dispatchTouchEvent(ev)
    }

    override fun onDestroy() {
        super.onDestroy()
        try {
            LogUtils.d("onDestroy:${javaClass.name}")
            destroy()
        } catch (e: Exception) {
            LogUtils.e("onDestroy:${javaClass.name} - ${e.message}")
        }
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent): Boolean {
        return false
    }

    protected abstract fun getViewBindingClass(): VB

    protected abstract fun getViewModelClass(): Class<VM>

    protected abstract fun initData()

    protected abstract fun initOnListener()

    protected abstract fun initObserver()

    protected abstract fun destroy()
}