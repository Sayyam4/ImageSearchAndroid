package com.sayyam.imagesearchapplication.data.network

import com.sayyam.imagesearchapplication.data.model.PixabayDto
import retrofit2.http.GET
import retrofit2.http.Query

const val BASE_URL = "https://pixabay.com/"

interface ApiService {


    @GET("api/")
    suspend fun getSearchImage(
        @Query("key") key: String,
        @Query("q") query: String
    ): PixabayDto

}