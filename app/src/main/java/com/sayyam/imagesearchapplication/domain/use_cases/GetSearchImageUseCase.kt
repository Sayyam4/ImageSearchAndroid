package com.sayyam.imagesearchapplication.domain.use_cases

import com.sayyam.imagesearchapplication.domain.model.ImageModel
import com.sayyam.imagesearchapplication.domain.repository.ImageRepository
import com.sayyam.imagesearchapplication.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.lang.Exception

class GetSearchImageUseCase(private val imageRepository: ImageRepository) {

    operator fun invoke(query: String): Flow<Resource<List<ImageModel>>> = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(data = imageRepository.getSearchImage(query = query)))
        } catch (e: Exception) {
            emit(Resource.Error(message = e.message.toString()))
        }
    }

}