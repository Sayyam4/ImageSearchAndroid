package com.sayyam.imagesearchapplication.data.di

import com.sayyam.imagesearchapplication.data.network.ApiService
import com.sayyam.imagesearchapplication.data.network.BASE_URL
import com.sayyam.imagesearchapplication.data.repository.ImageRepositoryImpl
import com.sayyam.imagesearchapplication.domain.repository.ImageRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
object DataModule {

    @Provides
    fun provideApiService(): ApiService {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(ApiService::class.java)
    }

    @Provides
    fun provideImageRepo(apiService: ApiService): ImageRepository {
        return ImageRepositoryImpl(apiService)
    }

}