package com.doneboredly.sudokucompanion.interfaces

import android.content.Context
import android.view.LayoutInflater
import android.view.View

/**
 * The view's responsibility is is data formatting, UI rendering
 */
interface MVCView {
    val layoutInflater:LayoutInflater
    val view:View

    fun initViews()
    fun bindDataToViews()
    fun showErrorToast(errorMessage:String)
}