package com.sayyam.imagesearchapplication.data.repository

import com.sayyam.imagesearchapplication.data.network.ApiService
import com.sayyam.imagesearchapplication.domain.model.ImageModel
import com.sayyam.imagesearchapplication.domain.repository.ImageRepository
import com.sayyam.imagesearchapplication.util.toDomainModel

class ImageRepositoryImpl(private val apiService: ApiService) : ImageRepository {

    override suspend fun getSearchImage(query: String): List<ImageModel> {
        try {
            return apiService.getSearchImage(
                key = "37383551-63be0456b0b602ffbe633b700",
                query
            ).hits.map { it.toDomainModel() }
        } catch (e: java.lang.Exception) {
            throw Exception(e)
        }
    }
}