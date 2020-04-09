package ru.skillbranch.skillarticles.extensions

import android.util.Log

fun String?.indexesOf(substr: String, ignoreCase: Boolean? = null): List<Int> {
    var lastPos = 0
    var text = this
    var substring = substr
    when (ignoreCase) {
        null, true -> {
            substring = substr.toLowerCase()
            text = this?.toLowerCase()
        }
    }

    var listOfIndexes: MutableList<Int> = mutableListOf()

    Log.d("TAGString", "Text $text")
    if (substring.isNotBlank() && !text.isNullOrBlank()) {
        while (lastPos > -1) {

            lastPos = text.indexOf(substring, lastPos)
            if (lastPos != -1) {
                listOfIndexes.add(lastPos)
                Log.d("TAGString", "Value $lastPos")
                lastPos = lastPos + substring.length
            }
        }
    }
    return listOfIndexes
}