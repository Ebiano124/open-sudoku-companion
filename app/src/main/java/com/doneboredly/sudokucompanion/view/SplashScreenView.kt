package com.doneboredly.sudokucompanion.view

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import com.doneboredly.sudokucompanion.HomeActivity
import com.doneboredly.sudokucompanion.controller.SplashScreenController
import com.doneboredly.sudokucompanion.databinding.ActivitySplashScreenBinding
import com.doneboredly.sudokucompanion.interfaces.MVCView

class SplashScreenView(context: Context ):
    MVCView
{
    override val layoutInflater: LayoutInflater = LayoutInflater.from(context)
    private val binding = ActivitySplashScreenBinding.inflate(layoutInflater)

    override val view: View = binding.root
    private val controller = SplashScreenController(this)

    override fun initViews() {
        //Consider adding Google Play Store User Registration ---Here---
        //TODO(" Google Play Store Features not yet implemented")

        //Timer to next activity
        controller.onViewLoaded()
    }

    override fun bindDataToViews() {
        controller.onViewLoaded()
    }

    fun navigateToHomeActivity() {
        view.context.startActivity(Intent(view.context, HomeActivity::class.java))
        (view.context as Activity).finish()
    }

    override fun showErrorToast(errorMessage:String){
        Toast.makeText(view.context, errorMessage, Toast.LENGTH_LONG).show()
    }
}