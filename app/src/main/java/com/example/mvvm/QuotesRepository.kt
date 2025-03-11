package com.example.mvvm

import android.content.Context

class QuotesRepository(private val context: Context) {
    fun getQuotes(): List<Quotes>{
        return JsonUtils.loadQuotes(context)
    }
}