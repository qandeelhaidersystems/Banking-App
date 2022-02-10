package com.example.mvipractise.core.di.module

import com.example.mvipractise.network.HomeApi
import com.example.mvipractise.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideRetrofitInstance(): Retrofit {

        val client = OkHttpClient.Builder()

        client.interceptors().add(Interceptor { chain: Interceptor.Chain ->
            var request = chain.request()
            request = request
                .newBuilder()
                .addHeader(Constants.API_KEY, "Ujf4ZHdP3zHrmfsvAETpUmvK7BPS/jU/YKCp+VXaF1A=")
                .addHeader(Constants.LANGUAGE, "en")
                .addHeader(Constants.CURRENCY, "usd")
                .addHeader(Constants.USER_TOKEN, "")
                .addHeader(Constants.DEVICE_TYPE, Constants.ANDROID)
                .build()
            chain.proceed(request)
        })


        return Retrofit.Builder()
            .baseUrl("https://staging.mgasha.com/apis/api/")
//            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .client(client.build())
            .build()
    }

    @Provides
    fun provideHomeApi(retrofit: Retrofit): HomeApi {
        return retrofit.create(HomeApi::class.java)
    }
}