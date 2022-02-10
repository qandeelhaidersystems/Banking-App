package com.example.mvipractise.model.remote.homeFeedResponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class HomeBanner {
    @SerializedName("uuid")
    @Expose
    var uuid: String? = null

    @SerializedName("item_id")
    @Expose
    private var itemId: String? = null

    @SerializedName("item_uuid")
    @Expose
    private var itemUuid: String? = null

    @SerializedName("item_slug")
    @Expose
    var itemSlug: String = ""

    @SerializedName("item_is_favorite")
    @Expose
    var itemIsFavorite: Boolean? = null

    @SerializedName("item_en_title")
    @Expose
    private var itemEnTitle: String? = null

    @SerializedName("item_ar_title")
    @Expose
    private var itemArTitle: String? = null

    @SerializedName("item_price")
    @Expose
    private var itemPrice: String? = null

    @SerializedName("item_sale_price")
    @Expose
    private var itemSalePrice: String? = null

    @SerializedName("discounted_type")
    @Expose
    private var discountedType: String? = null

    @SerializedName("discount")
    @Expose
    private var discount: String? = null

    @SerializedName("item_image")
    @Expose
    private var itemImage: String? = null

    @SerializedName("master_categories_id")
    @Expose
    var masterCategoriesId: Int? = null

    @SerializedName("master_category_slug")
    @Expose
    var masterCategorySlug: String = ""

    @SerializedName("master_category_en_title")
    @Expose
    var masterCategoryEnTitle: String? = null

    @SerializedName("master_category_ar_title")
    @Expose
    var masterCategoryArTitle: String? = null

    @SerializedName("master_category_image")
    @Expose
    var masterCategoryImage: String? = null

    @SerializedName("sub_categories_id")
    @Expose
    var subCategoriesId: Int? = null

    @SerializedName("sub_category_slug")
    @Expose
    var subCategorySlug: String = ""

    @SerializedName("sub_category_en_title")
    @Expose
    var subCategoryEnTitle: String? = null

    @SerializedName("sub_category_ar_title")
    @Expose
    var subCategoryArTitle: String? = null

    @SerializedName("sub_category_image")
    @Expose
    var subCategoryImage: String? = null

    @SerializedName("child_categories_id")
    @Expose
    var childCategoriesId: Any? = null

    @SerializedName("child_categories_slug")
    @Expose
    var childCategoriesSlug: String? = null

    @SerializedName("child_category_en_title")
    @Expose
    var childCategoryEnTitle: Any? = null

    @SerializedName("child_category_ar_title")
    @Expose
    var childCategoryArTitle: Any? = null

    @SerializedName("child_category_image")
    @Expose
    private var childCategoryImage: String? = null

    @SerializedName("brand_id")
    @Expose
    private var brandId = 0

    @SerializedName("brand_slug")
    @Expose
    var brandSlug: String = ""

    @SerializedName("brand_en_title")
    @Expose
    private var brandEnTitle: String? = null

    @SerializedName("brand_ar_title")
    @Expose
    private var brandArTitle: String? = null

    @SerializedName("brand_image")
    @Expose
    var brandImage: String? = null

    @SerializedName("en_banner")
    @Expose
    var enBanner: String? = null

    @SerializedName("ar_banner")
    @Expose
    var arBanner: String? = null

    @SerializedName("ordering_sort")
    @Expose
    private var orderingSort = 0

    @SerializedName("type")
    @Expose
    var type: String? = null
}