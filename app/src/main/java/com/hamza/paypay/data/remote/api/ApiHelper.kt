package com.hamza.paypay.data.remote.api

import com.hamza.paypay.data.remote.model.Currencies
import retrofit2.Response

interface ApiHelper {
    //can with as non blocking
   suspend fun getCurrencyies(apiKey: String): Response<Currencies>
}


