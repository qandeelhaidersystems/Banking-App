package com.example.mvipractise.model.remote.homeFeedResponse

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class ColorItem (
    @field:SerializedName("color_images")
    val colorImages: List<String>? = null,

    @field:SerializedName("color")
    val color: String? = null,

    @field:SerializedName("item_id")
    val itemId: Int? = null,

    @field:SerializedName("color_quantity")
    val colorQuantity: Int = 0,

    @field:SerializedName("item_variant_id")
    val itemVariantId: Int? = null,

    @field:SerializedName("id")
    val id: Int = 0,

    @field:SerializedName("en_color_name")
    val enColorName: String = "",

    @field:SerializedName("ar_color_name")
    val arColorName: String = "",

    @field:SerializedName("color_code")
    val colorCode: String = "",

    @field:SerializedName("isSelected")
    var isSelected: Boolean = false,

): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.createStringArrayList(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readInt(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readInt(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readByte() != 0.toByte()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeStringList(colorImages)
        parcel.writeString(color)
        parcel.writeValue(itemId)
        parcel.writeInt(colorQuantity)
        parcel.writeValue(itemVariantId)
        parcel.writeInt(id)
        parcel.writeString(enColorName)
        parcel.writeString(arColorName)
        parcel.writeString(colorCode)
        parcel.writeByte(if (isSelected) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ColorItem> {
        override fun createFromParcel(parcel: Parcel): ColorItem {
            return ColorItem(parcel)
        }

        override fun newArray(size: Int): Array<ColorItem?> {
            return arrayOfNulls(size)
        }
    }
}