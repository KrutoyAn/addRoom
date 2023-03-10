package com.example.diffutilsample.data.dto.heroinfo

import com.example.diffutilsample.data.dto.ThumbNailDto
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class HeroInfoDto(
    @SerialName("name")
    val name: String,
    @SerialName("description")
    val description: String,
    @SerialName("thumbnail")
    val thumbnail: ThumbNailDto,
    @SerialName("comics")
    val comicsDto: ComicsDto
)
