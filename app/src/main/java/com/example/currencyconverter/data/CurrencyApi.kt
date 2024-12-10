package com.example.currencyconverter.data

import com.example.currencyconverter.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


/**
 * Created by Abhinay on 04/12/24.
 *
 *
 */
interface CurrencyApi {

    @GET("/latest")
    suspend fun getRates(
        @Query("base") base: String
    ) : Response<CurrencyResponse>
}