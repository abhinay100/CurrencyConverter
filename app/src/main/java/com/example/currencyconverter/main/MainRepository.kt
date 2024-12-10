package com.example.currencyconverter.main

import com.example.currencyconverter.data.models.CurrencyResponse
import com.example.currencyconverter.util.Resource


/**
 * Created by Abhinay on 04/12/24.
 *
 *
 */
interface MainRepository {

    suspend fun getRates(base: String) : Resource<CurrencyResponse>
}