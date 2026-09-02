package com.example.data.util

import android.content.Context
import android.content.SharedPreferences
import com.example.data.model.Episode

object DonoDoMorroManager {
    private const val PREFS_NAME = "dono_do_morro_prefs"
    private const val KEY_CUSTOM_EPISODE_1 = "custom_episode_1_url"

    // Link padrão do Episódio 1 com suporte a YouTube ou MP4 camuflado
    const val DEFAULT_EPISODE_1_URL = "https://youtu.be/u0WXCHgZxaY?is=bvomW3X72476KQDG"

    private fun getPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    fun getEpisode1Url(context: Context): String {
        return getPrefs(context).getString(KEY_CUSTOM_EPISODE_1, DEFAULT_EPISODE_1_URL)
            ?: DEFAULT_EPISODE_1_URL
    }

    fun setEpisode1Url(context: Context, url: String) {
        getPrefs(context).edit().putString(KEY_CUSTOM_EPISODE_1, url.trim()).apply()
    }

    fun resetEpisode1Url(context: Context) {
        getPrefs(context).edit().remove(KEY_CUSTOM_EPISODE_1).apply()
    }

    fun isCustomUrlActive(context: Context): Boolean {
        val current = getEpisode1Url(context)
        return current.isNotBlank() && current != DEFAULT_EPISODE_1_URL
    }

    fun getEpisodes(context: Context): List<Episode> {
        val ep1Url = getEpisode1Url(context)
        return listOf(
            Episode(
                id = "dono_morro_ep_1",
                episodeNumber = 1,
                title = "O Primeiro Olhar",
                videoUrl = ep1Url,
                duration = "1:45",
                isUnlocked = true,
                synopsis = "A chegada ao morro e o primeiro encontro tenso que vai mudar o destino de todos.",
                badge = "Link Camuflado"
            ),
            Episode(
                id = "dono_morro_ep_2",
                episodeNumber = 2,
                title = "Encontro Inesperado",
                videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4",
                duration = "2:10",
                isUnlocked = true,
                synopsis = "Alianças improváveis são forjadas sob a pressão das cobranças no topo do morro."
            ),
            Episode(
                id = "dono_morro_ep_3",
                episodeNumber = 3,
                title = "Acordo Perigoso",
                videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
                duration = "3:20",
                isUnlocked = true,
                synopsis = "A negociação do território atinge o ápice e segredos do passado vêm à tona."
            ),
            Episode(
                id = "dono_morro_ep_4",
                episodeNumber = 4,
                title = "Fogo Cruzado",
                videoUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4",
                duration = "2:45",
                isUnlocked = true,
                synopsis = "Quando a trégua é quebrada, cada decisão custa caro para a comunidade."
            )
        )
    }
}
