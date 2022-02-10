package com.example.mvipractise.model.remote.homeFeedResponse

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ItemAttributes (
    @Expose
    @SerializedName("id")
    var id: String? = null,

    @Expose
    @SerializedName("label")
    var label: String? = null,

    @Expose
    @SerializedName("unit")
    var unit: String? = null,

    @Expose
    @SerializedName("value")
    var value: String? = null,

) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(id)
        parcel.writeString(label)
        parcel.writeString(unit)
        parcel.writeString(value)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ItemAttributes> {
        override fun createFromParcel(parcel: Parcel): ItemAttributes {
            return ItemAttributes(parcel)
        }

        override fun newArray(size: Int): Array<ItemAttributes?> {
            return arrayOfNulls(size)
        }
    }
}