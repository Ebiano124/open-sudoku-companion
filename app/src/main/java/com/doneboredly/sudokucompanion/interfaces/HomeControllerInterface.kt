package com.doneboredly.sudokucompanion.interfaces

interface HomeControllerInterface:MVCController {
    fun onPlayButtonClicked()
    fun onSolveButtonClicked()
    fun onLearnButtonClicked()
    fun onSettingsButtonClicked()
    fun onAchievementsImageButtonClicked()
    fun onStatsImageButtonClicked()
    fun onStylesImageButtonClicked()
}