package com.mobwaysolutions.myapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobwaysolutions.myapplication.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel : MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}