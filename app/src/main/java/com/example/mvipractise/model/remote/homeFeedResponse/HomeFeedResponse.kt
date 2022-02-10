package com.example.mvipractise.model.remote.homeFeedResponse

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mvipractise.model.remote.homeFeedResponse.Data

@Entity(tableName = "homeFeedResponse")
data class HomeFeedResponse(val success: Boolean,
                            val message: String,
                            val status_code: String,
                            var data: Data,
                            @PrimaryKey(autoGenerate = true) val homeFeedId: Long? = null)

