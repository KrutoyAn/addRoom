package com.example.diffutilsample.data.dto.heroinfo

import com.example.diffutilsample.data.dto.ThumbNailDto
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class HeroResponse(
    @SerialName("name")
    val name: String,
    @SerialName("thumbnail")
    val thumbnail: ThumbNailDto,
    @SerialName("id")
    val id: Long
)

fun HeroResponse.mapToEntity(): HeroEntity {
    return HeroEntity(
        id = id,
        name = name,
        thumbnail = thumbnail.mapToThumbnailEntity()
    )
}

fun ThumbNailDto.mapToThumbnailEntity(): ThumbNailEntity {
    return ThumbNailEntity(
        extension = extension,
        path = path
    )
}
