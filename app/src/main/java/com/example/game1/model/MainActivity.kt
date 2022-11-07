package com.example.game1.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.game1.R
import com.example.game1.databinding.ActivityMainBinding
import com.example.game1.view.main

import com.example.game1.viewmodel.MainViewModel


import kotlinx.android.synthetic.main.activity_main.*

import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var mViewMode: MainViewModel
//sss
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val main = main("lisa",0)
        mViewMode = MainViewModel(main)


    }



}
