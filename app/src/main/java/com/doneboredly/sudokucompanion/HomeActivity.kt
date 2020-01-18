package com.doneboredly.sudokucompanion

//import androidx.test.orchestrator.junit.BundleJUnitUtils.getResult

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.doneboredly.sudokucompanion.view.HomeView

//import org.junit.experimental.results.ResultMatchers.isSuccessful

class HomeActivity : AppCompatActivity() {

    private lateinit var view:HomeView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = HomeView(this, null)
        setContentView(view.view)
        view.initViews()
    }

    override fun onResume(){
        super.onResume()
        //Get any data from models
        view.bindDataToViews()
    }
}
