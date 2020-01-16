package com.doneboredly.sudokucompanion.view

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import androidx.core.os.postDelayed
import com.doneboredly.sudokucompanion.HomeActivity
import com.doneboredly.sudokucompanion.SplashScreenActivity
import com.doneboredly.sudokucompanion.databinding.ActivitySplashScreenBinding

class SplashScreenView(context: Context ):MVC_View
{
    private val splashTimeDelay:Long = 3000

    override val layoutInflater: LayoutInflater = LayoutInflater.from(context)
    private val binding = ActivitySplashScreenBinding.inflate(layoutInflater)
    override val view: View = binding.root

    override fun initViews() {
        //Timer to next activity
        Handler().postDelayed({

            //Consider adding Google Play Store User Registration ---Here---
            //TODO(" Google Play Store Features not yet implemented")

            view.context.startActivity(Intent(view.context, HomeActivity::class.java))
            (view.context as Activity).finish()
        }, splashTimeDelay)
    }
}