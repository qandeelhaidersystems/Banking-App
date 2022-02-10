package com.example.mvipractise.model.remote.homeFeedResponse

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ItemAccessory (
    @field:SerializedName("item_code")
    val itemCode: String = "",

    @field:SerializedName("ar_title")
    val arTitle: String = "",

    @field:SerializedName("short_info")
    val shortInfo: String? = null,

    @field:SerializedName("is_favorite")
    val isFavorite: Boolean = false,

    @field:SerializedName("color")
    val color: String = "",

    @field:SerializedName("discount")
    val discount: Double = 0.0,

    @field:SerializedName("min_qty_range")
    val minQtyRange: String? = null,

    @field:SerializedName("title")
    val title: String = "",

    @field:SerializedName("uuid")
    val uuid: String = "",

    @field:SerializedName("specs")
    val specs: Any? = null,

    @field:SerializedName("shipping_days")
    val shippingDays: String = "",

    @field:SerializedName("is_sold")
    val isSold: Boolean = false,

    @field:SerializedName("price")
    val price: Double = 0.0,

    @field:SerializedName("model")
    val model: String? = null,

    @field:SerializedName("categories")
    val categories: List<CategoriesItem>? = null,

    @field:SerializedName("id")
    val id: Int = 0,

    @field:SerializedName("brand")
    val brand: String? = null,

    @field:SerializedName("slug")
    val slug: String = "",

    @field:SerializedName("ItemsColors")
    val itemsColors: List<ColorItem>? = null,

    @field:SerializedName("color_code")
    val colorCode: String? = null,

    @field:SerializedName("info")
    val info: String? = null,

    @field:SerializedName("height")
    val height: Float = 0F,

    @field:SerializedName("techspecs")
    val techspecs: List<TechSpecsItem>? = null,

    @field:SerializedName("image")
    val image: String = "",

    @field:SerializedName("images")
    val images: List<String>? = null,

    @field:SerializedName("quantity")
    var quantity: Int = 1,

    @field:SerializedName("accessory_item_id")
    val accessoryItemId: Int? = null,

    @field:SerializedName("discounted_type")
    val discountedType: String? = null,

    @field:SerializedName("weight")
    val weight: Float = 0F,

    @field:SerializedName("max_qty_value")
    val maxQtyValue: Float = 0F,

    @field:SerializedName("orientation_unit")
    val orientationUnit: String? = null,

    @field:SerializedName("cart_quantity")
    val cartQuantity: Int = 0,

    @field:SerializedName("sale_price")
    val salePrice: Double = 0.0,

    @field:SerializedName("shipping_fee")
    var shippingFee: String = "",

    @field:SerializedName("lenght")
    val lenght:  Float = 0F,

    @field:SerializedName("weight_unit")
    val weightUnit: String = "",

    @field:SerializedName("en_title")
    val enTitle: String = "",

    @field:SerializedName("max_qty_range")
    val maxQtyRange: Float = 0F,

    @field:SerializedName("width")
    val width:  Float = 0F,

    @field:SerializedName("must_purchase")
    val mustPurchase: Int? = null,

    @field:SerializedName("min_qty_value")
    val minQtyValue: Int? = null,

    @field:SerializedName("isSelected")
    var isSelected: Boolean = false,

    @field:SerializedName("selectedQuantity")
    var selectedQuantity: Int = 1,

    @field:SerializedName("maxQuantity")
    var maxQuantity: Int = 1,

    @field:SerializedName("availability")
    var isAvailability: Boolean = false,

    @field:SerializedName("selected_accessory_item")
    var selectedAccessoryColor: ColorItem? = null,

    @field:SerializedName("item_variant_id")
    var itemVariantId: String = "",

    @Expose
    @SerializedName("selected_color_item")
    var selectedItemColor: ColorItem? = null,


    @field:SerializedName("item_quantity_in_cart")
    var itemQuantityInCart: Int = 1,

    ) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString(),
        parcel.readByte() != 0.toByte(),
        parcel.readString().toString(),
        parcel.readDouble(),
        parcel.readString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        arrayListOf<TechSpecsItem>().apply {
            parcel.readList(this, TechSpecsItem::class.java.classLoader)
        },
        parcel.readString().toString(),
        parcel.readByte() != 0.toByte(),
        parcel.readDouble(),
        parcel.readString(),
        parcel.createTypedArrayList(CategoriesItem),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString().toString(),
        parcel.createTypedArrayList(ColorItem),
        parcel.readString(),
        parcel.readString(),
        parcel.readFloat(),
        parcel.createTypedArrayList(TechSpecsItem),
        parcel.readString().toString(),
        parcel.createStringArrayList(),
        parcel.readInt(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readFloat(),
        parcel.readFloat(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readDouble(),
        parcel.readString().toString(),
        parcel.readFloat(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readFloat(),
        parcel.readFloat(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readByte() != 0.toByte(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readByte() != 0.toByte(),
        parcel.readParcelable(ColorItem::class.java.classLoader),
        parcel.readString().toString(),
        parcel.readParcelable(ColorItem::class.java.classLoader),
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(itemCode)
        parcel.writeString(arTitle)
        parcel.writeString(shortInfo)
        parcel.writeByte(if (isFavorite) 1 else 0)
        parcel.writeString(color)
        parcel.writeDouble(discount)
        parcel.writeString(minQtyRange)
        parcel.writeString(title)
        parcel.writeString(uuid)
        parcel.writeString(shippingDays)
        parcel.writeByte(if (isSold) 1 else 0)
        parcel.writeDouble(price)
        parcel.writeString(model)
        parcel.writeTypedList(categories)
        parcel.writeInt(id)
        parcel.writeString(brand)
        parcel.writeString(slug)
        parcel.writeTypedList(itemsColors)
        parcel.writeString(colorCode)
        parcel.writeString(info)
        parcel.writeTypedList(techspecs)
        parcel.writeString(image)
        parcel.writeStringList(images)
        parcel.writeInt(quantity)
        parcel.writeValue(accessoryItemId)
        parcel.writeString(discountedType)
        parcel.writeFloat(weight)
        parcel.writeString(orientationUnit)
        parcel.writeInt(cartQuantity)
        parcel.writeDouble(salePrice)
        parcel.writeString(shippingFee)
        parcel.writeFloat(lenght)
        parcel.writeString(weightUnit)
        parcel.writeString(enTitle)
        parcel.writeFloat(width)
        parcel.writeValue(mustPurchase)
        parcel.writeValue(minQtyValue)
        parcel.writeByte(if (isSelected) 1 else 0)
        parcel.writeInt(selectedQuantity)
        parcel.writeInt(maxQuantity)
        parcel.writeByte(if (isAvailability) 1 else 0)
        parcel.writeParcelable(selectedAccessoryColor, flags)
        parcel.writeString(itemVariantId)
        parcel.writeParcelable(selectedItemColor, flags)
        parcel.writeInt(itemQuantityInCart)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ItemAccessory> {
        override fun createFromParcel(parcel: Parcel): ItemAccessory {
            return ItemAccessory(parcel)
        }

        override fun newArray(size: Int): Array<ItemAccessory?> {
            return arrayOfNulls(size)
        }
    }
}
