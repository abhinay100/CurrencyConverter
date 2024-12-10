package com.example.currencyconverter.main

import com.example.currencyconverter.data.CurrencyApi
import com.example.currencyconverter.data.models.CurrencyResponse
import com.example.currencyconverter.util.Resource
import javax.inject.Inject


/**
 * Created by Abhinay on 04/12/24.
 *
 *
 */
class DefaultMainRepository @Inject constructor(
    private val api: CurrencyApi
) : MainRepository {

    override suspend fun getRates(base: String): Resource<CurrencyResponse> {
           return try{
               val response = api.getRates(base)
               val result = response.body()
               if(response.isSuccessful && result != null){
                   Resource.Success(result)
               } else{
                   Resource.Error(response.message())
               }

           } catch (e : Exception) {
               Resource.Error(e.message ?: "An error occured")
           }
    }
}