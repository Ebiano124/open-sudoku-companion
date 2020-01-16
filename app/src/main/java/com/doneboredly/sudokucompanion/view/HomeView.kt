package com.doneboredly.sudokucompanion.view

import android.content.Context
import android.view.LayoutInflater
import com.doneboredly.sudokucompanion.controller.HomeController
import com.doneboredly.sudokucompanion.databinding.ActivityHomeBinding

class HomeView(context:Context):MVC_View {
    override val layoutInflater = LayoutInflater.from(context)
    private val binding = ActivityHomeBinding.inflate(layoutInflater)

    override val view = binding.root

    private lateinit var controller: HomeController

    //Add relevant models

    override fun initViews(){
        //TODO("Handle Views' animations")

        //TODO ("Set EventListeners")

    }
}