package com.doneboredly.sudokucompanion.controller


import android.os.Handler
import com.doneboredly.sudokucompanion.interfaces.MVCController
import com.doneboredly.sudokucompanion.view.SplashScreenView

class SplashScreenController(view: SplashScreenView):MVCController {
    private var view:SplashScreenView = view

    override fun onViewLoaded(){
        try{
            val splashTimeDelay:Long = 3000
            Handler().postDelayed({
                view.navigateToHomeActivity()
            }, splashTimeDelay)
        } catch(e:Exception) {
            view.showErrorToast(e.message.toString())
        }
    }
}