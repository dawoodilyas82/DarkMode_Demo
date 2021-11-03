package com.confiz.darkmodedemo

import android.content.Context
import androidx.preference.PreferenceManager

class MyPreferences(context: Context?) {

    companion object {
        private const val DARK_STATUS = "com.confiz.darkmodedemo"
    }

    private val preferences = PreferenceManager.getDefaultSharedPreferences(context)

    var darkMode
        set(value) = preferences.edit().putInt(DARK_STATUS, value).apply()
        get() = preferences.getInt(DARK_STATUS, 0)
}