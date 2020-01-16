package com.doneboredly.sudokucompanion

//import androidx.test.orchestrator.junit.BundleJUnitUtils.getResult

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.doneboredly.sudokucompanion.view.HomeView

//import org.junit.experimental.results.ResultMatchers.isSuccessful

class HomeActivity : AppCompatActivity() {

    private lateinit var homeView:HomeView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        homeView = HomeView(this)
        setContentView(homeView.view)
        homeView.initViews()
    }

    override fun onResume(){
        super.onResume()
    }
}
