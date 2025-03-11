package com.example.mvvm

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class QuotesViewModel(context: Context) : ViewModel() {
    private val repository = QuotesRepository(context)

    private val quotes = repository.getQuotes()

    private val _quote = MutableLiveData<Quotes>()
    val quote: LiveData<Quotes> get() = _quote

    fun showRandomQuote() {
        _quote.value = quotes.random()
    }
}