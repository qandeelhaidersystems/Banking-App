package com.example.mvipractise.model.remote.homeFeedResponse

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class TechSpecsItem(

    @field:SerializedName("specs")
    val specs: String? = null,

    @field:SerializedName("unit")
    val unit: String? = null,

    @field:SerializedName("desp_unit")
    val despUnit: String? = null,

    @field:SerializedName("value")
    val value: String? = null

) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(specs)
        parcel.writeString(unit)
        parcel.writeString(despUnit)
        parcel.writeString(value)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TechSpecsItem> {
        override fun createFromParcel(parcel: Parcel): TechSpecsItem {
            return TechSpecsItem(parcel)
        }

        override fun newArray(size: Int): Array<TechSpecsItem?> {
            return arrayOfNulls(size)
        }
    }
}