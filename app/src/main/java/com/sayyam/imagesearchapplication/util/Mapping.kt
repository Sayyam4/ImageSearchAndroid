package com.sayyam.imagesearchapplication.util

import com.sayyam.imagesearchapplication.data.model.HitDto
import com.sayyam.imagesearchapplication.domain.model.ImageModel

fun HitDto.toDomainModel(): ImageModel {
    return ImageModel(
        imageUrl = this.largeImageURL
    )
}