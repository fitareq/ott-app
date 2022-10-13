package com.fitareq.ottapp.network

import com.fitareq.ottapp.AppConstants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    private fun getInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(AppConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getApi(): MoviesApi {
        return getInstance().create(MoviesApi::class.java)
    }
}