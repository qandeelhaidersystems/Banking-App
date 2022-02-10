package com.example.mvipractise.model.remote.homeFeedResponse

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class CategoriesItem(

    @field:SerializedName("image")
    val image: String? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("parent_categories")
    val parentCategories: List<ParentCategoriesItem?>? = null,

    @field:SerializedName("uuid")
    val uuid: String? = null,

    @field:SerializedName("slug")
    val slug: String? = null,

    @field:SerializedName("master_id")
    val masterId: Int? = null,

    @field:SerializedName("category_title")
    val categoryTitle: String? = null,

    @field:SerializedName("category_id")
    val categoryId: Int? = null,

    @field:SerializedName("master_category_title")
    val masterCategoryTitle: String? = null,

    @field:SerializedName("master_category_slug")
    val masterCategorySlug: String? = null,

    @field:SerializedName("category_title_ar")
    val categoryTitleAr: String? = null,

    @field:SerializedName("category_slug")
    val categorySlug: String? = null,

    @field:SerializedName("category_title_en")
    val categoryTitleEn: String? = null
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        arrayListOf<ParentCategoriesItem>().apply {
            parcel.readList(this, ParentCategoriesItem::class.java.classLoader)
        },
        parcel.readString(),
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
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
        parcel.writeValue(masterId)
        parcel.writeString(categoryTitle)
        parcel.writeValue(categoryId)
        parcel.writeString(masterCategoryTitle)
        parcel.writeString(masterCategorySlug)
        parcel.writeString(categoryTitleAr)
        parcel.writeString(categorySlug)
        parcel.writeString(categoryTitleEn)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CategoriesItem> {
        override fun createFromParcel(parcel: Parcel): CategoriesItem {
            return CategoriesItem(parcel)
        }

        override fun newArray(size: Int): Array<CategoriesItem?> {
            return arrayOfNulls(size)
        }
    }
}