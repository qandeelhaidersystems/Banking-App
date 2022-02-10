package com.example.mvipractise.network

import com.example.mvipractise.model.remote.homeFeedResponse.HomeFeedResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface HomeApi {

    @GET("homefeeds")
    suspend fun getHomeFeed(
        @Query("page_no") page: Int
    ) : HomeFeedResponse

}