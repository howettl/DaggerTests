package com.howettl.daggertests.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.howettl.daggertests.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
