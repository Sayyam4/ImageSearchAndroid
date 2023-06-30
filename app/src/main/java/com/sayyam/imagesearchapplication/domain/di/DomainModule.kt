package com.sayyam.imagesearchapplication.domain.di

import com.sayyam.imagesearchapplication.domain.repository.ImageRepository
import com.sayyam.imagesearchapplication.domain.use_cases.GetSearchImageUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainModule {

    @Provides
    fun provideGetSearchUseCase(imageRepository: ImageRepository): GetSearchImageUseCase {
        return GetSearchImageUseCase(imageRepository)
    }

}