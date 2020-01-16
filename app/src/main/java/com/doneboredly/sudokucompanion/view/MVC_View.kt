package com.doneboredly.sudokucompanion.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View

interface MVC_View {
    val layoutInflater:LayoutInflater
    val view:View

    fun initViews()
}