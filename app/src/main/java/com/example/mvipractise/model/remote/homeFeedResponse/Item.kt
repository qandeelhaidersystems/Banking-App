package com.example.mvipractise.model.remote.homeFeedResponse

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Item (
    @Expose
    @SerializedName("uuid")
    var uuid: String = "",

    @Expose
    @SerializedName("item_id")
    var itemId: String = "",

    @Expose
    @SerializedName("title")
    var title: String = "",

    @Expose
    @SerializedName("shipping_days")
    var shippingDays: String = "",

    @Expose
    @SerializedName("en_title")
    var enTitle: String = "",

    @Expose
    @SerializedName("shipping_fee")
    var shippingFee: String = "",

    @Expose
    @SerializedName("ar_title")
    var arTitle: String = "",

    @Expose
    @SerializedName("price")
    var price: Double = 0.0,

    @Expose
    @SerializedName("converted_price")
    var convertedPrice: String? = null,

    @Expose
    @SerializedName("converted_currency")
    var convertedCurrency: String? = null,

    @Expose
    @SerializedName("weight")
    var weight: Float = 0F,

    @Expose
    @SerializedName("weight_unit")
    var weightUnit: String = "",

    @Expose
    @SerializedName("slug")
    var slug: String = "",

    @Expose
    @SerializedName("image")
    var image: String = "",

    @Expose
    @SerializedName("quantity")
    var quantity: Int = 0,

    @Expose
    @SerializedName("id")
    var id: Int = 0,

    @Expose
    @SerializedName("order_item_id")
    var orderItemId: String? = null,

    @Expose
    @SerializedName("sale_price")
    var salePrice: Double = 0.0,

    @Expose
    @SerializedName("is_favorite")
    var isFavorite: Boolean = false,

    @Expose
    @SerializedName("cart_quantity")
    var cartQuantity: Int = 0,

    @Expose
    @SerializedName("maxQuantity")
    var maxQuantity: Int = 0,

    @Expose
    @SerializedName("cat_en_title")
    var cat_en_title: String? = null,

    @Expose
    @SerializedName("discounted_type")
    var discountedType: String? = "",

    @Expose
    @SerializedName("discount")
    var discount: Double = 0.0,

    @Expose
    @SerializedName("cat_ar_title")
    var cateArTitle: String? = null,

    @Expose
    @SerializedName("cat_slug")
    var catSlug: String? = null,

    @Expose
    @SerializedName("is_sold")
    var isSold: Boolean = false,

    @Expose
    @SerializedName("is_featured")
    var featured: String? = null,

    @Expose
    @SerializedName("availability")
    var isAvailability: Boolean = false,

    @Expose
    @SerializedName("color_code")
    var colorCode: String? = null,

    @Expose
    @SerializedName("color_names")
    var colorNames: ColorItem? = null,

    @Expose
    @SerializedName("color_image")
    var colorImage: String? = null,

    @Expose
    @SerializedName("color_id")
    var colorId: String = "",

    @Expose
    @SerializedName("selected_color_item")
    var selectedColorItem: ColorItem? = null,

    @Expose
    @SerializedName("message")
    var message: String? = null,

    @Expose
    @SerializedName("model")
    var model: String? = null,

    @Expose
    @SerializedName("is_refunded")
    var isRefunded: String? = null,

    @Expose
    @SerializedName("order_item_status")
    val orderItemStatus: Int? = null,

    @Expose
    @SerializedName("refunded_amount")
    var refundedAmount: Double = 0.0,

    @Expose
    @SerializedName("itemAccessories")
    var orderItemAccessories: ArrayList<ItemAccessory>? = null,

    @Expose
    @SerializedName("converted_refunded_amount")
    val convertedRefundedAmount: Double = 0.0,

    @field:SerializedName("item_code")
    val itemCode: String = "",

    @field:SerializedName("short_info")
    val shortInfo: String? = null,

    @field:SerializedName("color")
    val color: String? = null,

    @field:SerializedName("manual")
    val manual: String? = null,

    @field:SerializedName("specs")
    val specs: String? = null,

    @field:SerializedName("manual_title")
    val manualTitle: String = "",

    @field:SerializedName("categories")
    val categories: List<CategoriesItem>? = null,

    @field:SerializedName("brand")
    val brand: String? = null,

    @field:SerializedName("ItemsColors")
    val itemsColors: List<ColorItem>? = null,

    @field:SerializedName("info")
    val info: String? = null,

    @field:SerializedName("height")
    var height: Double = 0.0,

    @field:SerializedName("techspecs")
    val techspecs: ArrayList<TechSpecsItem>? = null,

    @field:SerializedName("images")
    val images: List<String>? = null,

    @field:SerializedName("orientation_unit")
    val orientationUnit: String? = null,

    @field:SerializedName("lenght")
    var lenght: Double = 0.0,

    @field:SerializedName("width")
    var width: Double = 0.0,

    @Expose
    @SerializedName("video_url")
    var videoUrl: String = "",

    @Expose
    @SerializedName("item_variant_id")
    var itemVariantId: String = "",

    )