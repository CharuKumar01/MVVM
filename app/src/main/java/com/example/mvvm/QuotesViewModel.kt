package com.example.mvvm

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class QuotesViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = QuotesRepository(application.applicationContext)

    private val quotes = repository.getQuotes()

    private val _quote = MutableLiveData<Quotes>()
    val quote: LiveData<Quotes> get() = _quote

    fun showRandomQuote() {
        _quote.value = quotes.random()
    }
}