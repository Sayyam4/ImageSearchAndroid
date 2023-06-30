package com.sayyam.imagesearchapplication.domain.repository

import com.sayyam.imagesearchapplication.domain.model.ImageModel

interface ImageRepository {

    suspend fun getSearchImage(query:String):List<ImageModel>

}