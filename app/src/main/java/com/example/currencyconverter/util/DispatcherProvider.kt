package com.example.currencyconverter.util

import kotlinx.coroutines.CoroutineDispatcher


/**
 * Created by Abhinay on 05/12/24.
 *
 *
 */
interface DispatcherProvider {

    val main: CoroutineDispatcher
    val io: CoroutineDispatcher
    val default: CoroutineDispatcher
    val unconfined: CoroutineDispatcher
}