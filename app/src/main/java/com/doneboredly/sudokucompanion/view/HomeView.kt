package com.doneboredly.sudokucompanion.view

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.doneboredly.sudokucompanion.SolveActivity
import com.doneboredly.sudokucompanion.controller.HomeController
import com.doneboredly.sudokucompanion.databinding.ActivityHomeBinding
import com.doneboredly.sudokucompanion.interfaces.MVCView

class HomeView(context:Context, viewGroup: ViewGroup?):
    MVCView {
    override val layoutInflater: LayoutInflater = LayoutInflater.from(context)
    private val binding = ActivityHomeBinding.inflate(layoutInflater)

    override val view = binding.root

    private lateinit var controller: HomeController

    //Add relevant models

    override fun initViews(){
        //TODO("Handle Views' animations")

        //Primary Buttons Event Listeners
        binding.buttonPlay.setOnClickListener {
            controller.onPlayButtonClicked()
        }

        binding.buttonSolve.setOnClickListener {
            controller.onSolveButtonClicked()
        }

        binding.buttonLearn.setOnClickListener {
            controller.onLearnButtonClicked()
        }

        //Secondary Buttons Event Listeners
        binding.imageButtonSettings.setOnClickListener{
            controller.onSettingsButtonClicked()
        }

        /**
         * Future Google Play Store Implementation
         */
        binding.imageButtonAchievements.setOnClickListener {
            controller.onAchievementsImageButtonClicked()
        }

        /**
         * Future Google Play Store Implementation
         */
        binding.imageButtonStats.setOnClickListener {
            controller.onStatsImageButtonClicked()
        }

        binding.imageButtonStyles.setOnClickListener {
            controller.onStylesImageButtonClicked()
        }

    }

    /**
     * Needed for future Google Play Store implementation
     */
    override fun bindDataToViews() {
        controller.onViewLoaded()
    }

    override fun showErrorToast(errorMessage:String){
        Toast.makeText(view.context, errorMessage, Toast.LENGTH_LONG).show()
    }

    fun navigateToSolveActivity(){
        view.context.startActivity(Intent(view.context, SolveActivity::class.java))
    }
}