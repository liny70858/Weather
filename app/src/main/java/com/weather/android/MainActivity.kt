package com.weather.android
<<<<<<< HEAD

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
=======
import android.os.Bundle
import com.weather.android.Base.BaseActivity

class MainActivity : BaseActivity() {
>>>>>>> 7430ac5 (Add blankj ,viewBinding so on to gradle)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}