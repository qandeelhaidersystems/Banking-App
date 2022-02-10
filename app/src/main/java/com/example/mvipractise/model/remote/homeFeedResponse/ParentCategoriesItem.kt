package com.example.mvipractise.model.remote.homeFeedResponse

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class ParentCategoriesItem(

    @field:SerializedName("image")
    val image: String? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("uuid")
    val uuid: String? = null,

    @field:SerializedName("slug")
    val slug: String? = null

) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(image)
        parcel.writeString(title)
        parcel.writeString(uuid)
        parcel.writeString(slug)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ParentCategoriesItem> {
        override fun createFromParcel(parcel: Parcel): ParentCategoriesItem {
            return ParentCategoriesItem(parcel)
        }

        override fun newArray(size: Int): Array<ParentCategoriesItem?> {
            return arrayOfNulls(size)
        }
    }
}