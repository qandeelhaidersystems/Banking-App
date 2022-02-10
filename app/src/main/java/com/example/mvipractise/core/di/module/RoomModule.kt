package com.example.mvipractise.core.di.module

import android.content.Context
import androidx.room.Room
import com.example.mvipractise.core.db.AppDatabase
import com.example.mvipractise.core.db.DataManager
import com.example.mvipractise.core.db.DataManagerImpl
import com.example.mvipractise.core.db.helper.DbHelper
import com.example.mvipractise.core.db.helper.DbHelperImpl
import com.example.mvipractise.core.di.qualifiers.DatabaseInfo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RoomModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@DatabaseInfo dbName: String?, @ApplicationContext context: Context?): AppDatabase {
        return Room.databaseBuilder(context!!, AppDatabase::class.java, dbName!!)
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @DatabaseInfo
    fun provideDatabaseName(): String {
        return "room"
    }

    @Provides
    @Singleton
    fun provideDbHelper(appDbHelper: DbHelperImpl): DbHelper {
        return appDbHelper
    }

    @Provides
    @Singleton
    fun provideDataManager(appDataManager: DataManagerImpl): DataManager {
        return appDataManager
    }
}