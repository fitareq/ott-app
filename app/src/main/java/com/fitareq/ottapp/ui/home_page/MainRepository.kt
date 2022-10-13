package com.fitareq.ottapp.ui.home_page

import com.fitareq.ottapp.model.Movies
import com.fitareq.ottapp.network.RetrofitHelper
import retrofit2.Response

class MainRepository {

    suspend fun getBatmanMovies(): Response<Movies> {
        return RetrofitHelper.getApi().getBatmanMovies()
    }

    suspend fun getLatestMovies(): Response<Movies> {
        return RetrofitHelper.getApi().getLatestMovies()
    }

    fun getCarouselData():List<String>{
        return listOf(
            "https://image-resizer-cloud-api.akamaized.net/image/2B56CA7A-50E7-4D1A-9FDB-AF9EFBFEFC25/0-3x1.jpg?width=2049",
            "https://image-resizer-cloud-api.akamaized.net/image/6E189326-EC2D-4145-8756-0B7317EAFC6E/0-3x1.jpg?width=2049",
            "https://image-resizer-cloud-api.akamaized.net/image/B890CBBD-4869-4D11-8740-AFD01DF72377/0-3x1.jpg?width=2049",
            "https://image-resizer-cloud-api.akamaized.net/image/F1ED6BFB-7FC6-42AA-89A0-2504F9B62910/0-3x1.jpg?width=2049",
            "https://image-resizer-cloud-api.akamaized.net/image/0EBC7A66-7C5A-4C52-81C3-47CBDF16E29E/0-3x1.jpg?width=2049"
        )
    }
}