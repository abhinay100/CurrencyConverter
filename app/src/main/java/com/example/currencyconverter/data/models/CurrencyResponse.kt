package com.example.currencyconverter.data.models


/**
 * Created by Abhinay on 04/12/24.
 *
 *
 */
data class CurrencyResponse(
    val base: String,
    val date: String,
    val rates: Rates
)