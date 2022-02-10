package com.example.mvipractise.model.remote.homeFeedResponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class HomeSalesProduct {
    @Expose
    @SerializedName("uuid")
    var uuid: String? = null

    @Expose
    @SerializedName("item_id")
    var item_id: Int? = 0

    @Expose
    @SerializedName("slug")
    var slug: String = ""

    @Expose
    @SerializedName("en_title")
    var en_title: String? = null

    @Expose
    @SerializedName("ar_title")
    var ar_title: String? = null

    @Expose
    @SerializedName("price")
    var price: Double = 0.0

    @Expose
    @SerializedName("sale_price")
    var sale_price: Double = 0.0

    @Expose
    @SerializedName("shipping_fee")
    var shipping_fee: Double = 0.0

    @Expose
    @SerializedName("image")
    var image: String? = null

    @Expose
    @SerializedName("categories_id")
    var categories_id: String? = null

    @Expose
    @SerializedName("category_slug")
    var category_slug: String? = null

    @Expose
    @SerializedName("category_en_title")
    var category_en_title: String? = null

    @Expose
    @SerializedName("category_ar_title")
    var category_ar_title: String? = null

    @Expose
    @SerializedName("category_image")
    var category_image: String? = null

    @Expose
    @SerializedName("sub_categories_id")
    var sub_categories_id: String? = null

    @Expose
    @SerializedName("sub_category_en_title")
    var sub_category_en_title: String? = null

    @Expose
    @SerializedName("sub_category_ar_title")
    var sub_category_ar_title: String? = null

    @Expose
    @SerializedName("sub_category_image")
    var sub_category_image: String? = null

    @Expose
    @SerializedName("ordering_sort")
    var ordering_sort: String? = null

    @Expose
    @SerializedName("discounted_type")
    var discounted_type: String? = null

    @Expose
    @SerializedName("discount")
    var discount: Double = 0.0

    @Expose
    @SerializedName("type")
    var type: String? = null

    @Expose
    @SerializedName("model")
    var model: String? = null

    @Expose
    @SerializedName("is_favorite")
    private var is_favorite = false
    fun is_favorite(): Boolean {
        return is_favorite
    }

    fun setIs_favorite(is_favorite: Boolean) {
        this.is_favorite = is_favorite
    }
}
