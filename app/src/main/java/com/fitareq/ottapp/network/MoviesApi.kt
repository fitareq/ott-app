package com.fitareq.ottapp.network

import com.fitareq.ottapp.AppConstants
import com.fitareq.ottapp.model.Movies
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface MoviesApi {

    //get Batman movies
    @GET("?s=Batman&${AppConstants.API_KEY}")
    suspend fun getBatmanMovies(): Response<Movies>

    // get new releases
    @GET("?y=2022&s=2022&${AppConstants.API_KEY}")
    suspend fun getLatestMovies(): Response<Movies>
}