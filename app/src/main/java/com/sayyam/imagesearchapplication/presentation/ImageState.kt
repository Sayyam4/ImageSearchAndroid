package com.sayyam.imagesearchapplication.presentation

import com.sayyam.imagesearchapplication.domain.model.ImageModel

data class ImageState(
    val isLoading:Boolean=false,
    val data:List<ImageModel>?=null,
    val error:String=""
)