package com.hamza.paypay.data.remote.api

import com.hamza.paypay.data.remote.model.Currencies
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {
   override suspend fun getCurrencyies(apiKey: String): Response<Currencies> = apiService.getCurrencies(apiKey)

}