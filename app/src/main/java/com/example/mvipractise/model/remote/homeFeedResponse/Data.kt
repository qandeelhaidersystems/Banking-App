package com.example.mvipractise.model.remote.homeFeedResponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Data {
    @Expose
    @SerializedName("banners")
    var banners: List<HomeBanner>? = null


    @Expose
    @SerializedName("top_sales")
    var top_sales: List<HomeSalesProduct>? = null

    @Expose
    @SerializedName("featuredItems")
    var featuredItems: List<Item>? = null

    @Expose
    @SerializedName("items")
    var items: List<Item>? = null


    @Expose
    @SerializedName("convertRate")
    var convertionRate: Float = 1F

    @Expose
    @SerializedName("discount")
    var discount: Int? = 0
}