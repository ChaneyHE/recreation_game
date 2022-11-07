package com.example.game1.viewmodel

import  com.example.game1.view.main;
import androidx.lifecycle.ViewModel;
import androidx.databinding.ObservableField;

class MainViewModel(val vote:main) {
    val show=ObservableField<String>("${vote.name}得了${vote.count}票")

    fun getCount(){
        vote.count++
        show.set(("${vote.name}得了${vote.count}票"))
    }


}