package ru.skillbranch.skillarticles.data.local

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import ru.skillbranch.skillarticles.data.delegates.PrefsDelegate

class PrefManager(context: Context) {
    internal val preferences : SharedPreferences by lazy { PreferenceManager(context).sharedPreferences }

    var storedBoolean by PrefsDelegate(false)
    var storedString by PrefsDelegate("test")
    var storedInt by PrefsDelegate(Int.MAX_VALUE)
    var storedLong by PrefsDelegate(Long.MAX_VALUE)
    var storedFloat by PrefsDelegate(100f)

    fun clearAll(){
        preferences.edit().clear().apply()
    }
}