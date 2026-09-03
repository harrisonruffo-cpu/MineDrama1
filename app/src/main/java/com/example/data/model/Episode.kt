package com.example.data.model

data class Episode(
    val id: String,
    val episodeNumber: Int,
    val title: String,
    val videoUrl: String,
    val duration: String,
    val isUnlocked: Boolean = true,
    val synopsis: String = "",
    val badge: String? = null,
    val coverUrl: String? = null
)
