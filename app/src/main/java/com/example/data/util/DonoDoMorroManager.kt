package com.example.data.util

import android.content.Context
import android.content.SharedPreferences
import com.example.data.model.Episode

object DonoDoMorroManager {
    private const val PREFS_NAME = "dono_do_morro_prefs"

    // Link oficial da capa fornecido pelo usuário (Google Drive)
    const val DEFAULT_COVER_DRIVE_VIEW_URL = "https://drive.google.com/file/d/1ngEUH5l0R0c58zZ-y26kTDqBwFv5dr64/view?usp=drivesdk"
    // URL direta para imagem no Coil / Glide
    const val DEFAULT_COVER_IMAGE_URL = "https://lh3.googleusercontent.com/u/0/d/1ngEUH5l0R0c58zZ-y26kTDqBwFv5dr64"

    // Links camuflados dos Episódios
    const val EPISODE_1_URL = "https://youtu.be/u0WXCHgZxaY?is=bvomW3X72476KQDG"
    const val EPISODE_2_URL = "https://youtu.be/nfVYJ6jFvRA?is=u2IbhITwKelIq86j"
    const val EPISODE_3_URL = "https://youtu.be/nfVYJ6jFvRA?is=wekmdgSbpDXpLgtN"
    const val EPISODE_4_URL = "https://youtu.be/MjHWLBEyPuA?is=AMmTuy78QirdIDW-"
    const val EPISODE_5_URL = "https://youtu.be/okmDuMzlbWM?is=VqqZ-DOp4yRlBz_a"
    const val EPISODE_6_URL = "https://youtu.be/-dQl0VDN07c?is=-UeFZt_oH8dgm4Jf"
    const val EPISODE_7_URL = "https://youtu.be/4KE0NczMVwI?is=Wex5GdY-Z91WjSLu"

    fun getEpisodes(context: Context? = null): List<Episode> {
        return listOf(
            Episode(
                id = "dono_morro_ep_1",
                episodeNumber = 1,
                title = "Episódio 1",
                videoUrl = EPISODE_1_URL,
                duration = "1º Episódio",
                isUnlocked = true,
                synopsis = "A chegada ao morro e o primeiro encontro tenso que inicia a história.",
                badge = "Episódio 1",
                coverUrl = DEFAULT_COVER_IMAGE_URL
            ),
            Episode(
                id = "dono_morro_ep_2",
                episodeNumber = 2,
                title = "Episódio 2",
                videoUrl = EPISODE_2_URL,
                duration = "2º Episódio",
                isUnlocked = true,
                synopsis = "Novas alianças e segredos começam a ser revelados.",
                badge = "Episódio 2",
                coverUrl = DEFAULT_COVER_IMAGE_URL
            ),
            Episode(
                id = "dono_morro_ep_3",
                episodeNumber = 3,
                title = "Episódio 3",
                videoUrl = EPISODE_3_URL,
                duration = "3º Episódio",
                isUnlocked = true,
                synopsis = "A disputa de território e lealdade atinge um novo patamar.",
                badge = "Episódio 3",
                coverUrl = DEFAULT_COVER_IMAGE_URL
            ),
            Episode(
                id = "dono_morro_ep_4",
                episodeNumber = 4,
                title = "Episódio 4",
                videoUrl = EPISODE_4_URL,
                duration = "4º Episódio",
                isUnlocked = true,
                synopsis = "Confrontos inesperados colocam a comunidade em alerta máximo.",
                badge = "Episódio 4",
                coverUrl = DEFAULT_COVER_IMAGE_URL
            ),
            Episode(
                id = "dono_morro_ep_5",
                episodeNumber = 5,
                title = "Episódio 5",
                videoUrl = EPISODE_5_URL,
                duration = "5º Episódio",
                isUnlocked = true,
                synopsis = "Decisões arriscadas mudam as regras do jogo no morro.",
                badge = "Episódio 5",
                coverUrl = DEFAULT_COVER_IMAGE_URL
            ),
            Episode(
                id = "dono_morro_ep_6",
                episodeNumber = 6,
                title = "Episódio 6",
                videoUrl = EPISODE_6_URL,
                duration = "6º Episódio",
                isUnlocked = true,
                synopsis = "O cerco se fecha e os limites de cada personagem são testados.",
                badge = "Episódio 6",
                coverUrl = DEFAULT_COVER_IMAGE_URL
            ),
            Episode(
                id = "dono_morro_ep_7",
                episodeNumber = 7,
                title = "Episódio 7",
                videoUrl = EPISODE_7_URL,
                duration = "7º Episódio",
                isUnlocked = true,
                synopsis = "Reviravolta emocionante que define os rumos da novela.",
                badge = "Episódio 7",
                coverUrl = DEFAULT_COVER_IMAGE_URL
            )
        )
    }
}
