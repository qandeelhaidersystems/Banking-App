package com.example.mvipractise.core.di.module

import com.example.mvipractise.ui.home.repository.HomeRepository
import com.example.mvipractise.ui.home.repository.HomeRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class HomeModule {

    @Binds
    abstract fun getHomeRepository(repositoryImpl: HomeRepositoryImpl) : HomeRepository

}