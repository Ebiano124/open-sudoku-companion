package com.doneboredly.sudokucompanion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.doneboredly.sudokucompanion.view.SplashScreenView

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var splashScreenView: SplashScreenView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        splashScreenView = SplashScreenView(this)
        setContentView(R.layout.activity_splash_screen)
        splashScreenView.initViews()
    }

    override fun onResume() {
        super.onResume()
        splashScreenView.bindDataToViews()
    }
}
