package com.example.mvvm

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.InputStreamReader

data class Quotes(
    val text: String,
    val author: String
)

object JsonUtils {
    fun loadQuotes(context: Context): List<Quotes> {
        val inputStream = context.resources.openRawResource(R.raw.quotes)
        val reader = InputStreamReader(inputStream)

        val type = object : TypeToken<List<Quotes>>() {}.type
        return Gson().fromJson(reader, type)
    }
}