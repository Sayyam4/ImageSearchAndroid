package com.sayyam.imagesearchapplication.data.model

data class PixabayDto(
    val hits: List<HitDto>,
    val total: Int,
    val totalHits: Int
)