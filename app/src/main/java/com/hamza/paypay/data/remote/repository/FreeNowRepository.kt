package com.hamza.paypay.data.remote.repository

import com.hamza.paypay.data.remote.api.ApiHelper
import com.hamza.paypay.data.remote.model.Currencies
import retrofit2.Response
import javax.inject.Inject

class FreeNowRepository @Inject constructor(private val apiHelper: ApiHelper) {
    suspend fun getCurrencyies(lastKey: String):Response<Currencies> = apiHelper.getCurrencyies(lastKey)
}