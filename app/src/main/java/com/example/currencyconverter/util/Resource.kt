package com.example.currencyconverter.util


/**
 * Created by Abhinay on 04/12/24.
 *
 *
 */
sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T) : Resource<T>(data, null)
    class Error<T>(message: String) : Resource<T>(null, message)
}