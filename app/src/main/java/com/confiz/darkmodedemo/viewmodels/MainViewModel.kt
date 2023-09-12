package com.confiz.darkmodedemo.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.confiz.darkmodedemo.utilities.MyPreferences

class MainViewModel(application: Application): AndroidViewModel(application) {
    private val myPreferences = MyPreferences(application)

    fun getDarkMode(): Int {
        return myPreferences.darkMode
    }

    fun setDarkMode(value: Int) {
        myPreferences.darkMode = value
    }
}
