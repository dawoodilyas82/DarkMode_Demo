package com.confiz.darkmodedemo

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class MainViewModel(application: Application): AndroidViewModel(application) {
    private val myPreferences = MyPreferences(application)

    fun getDarkMode(): Int {
        return myPreferences.darkMode
    }

    fun setDarkMode(value: Int) {
        myPreferences.darkMode = value
    }
}
