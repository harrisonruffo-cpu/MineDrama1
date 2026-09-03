package com.example.data.util

import com.example.data.model.Episode

object DonoDoMorroManager {
    // Capa oficial fornecida pelo usuário no Google Drive (ID: 1ngEUH5l0R0c58zZ-y26kTDqBwFv5dr64)
    const val DEFAULT_COVER_DRIVE_URL = "https://lh3.googleusercontent.com/u/0/d/1ngEUH5l0R0c58zZ-y26kTDqBwFv5dr64"
    const val DEFAULT_COVER_DRIVE_VIEW_URL = "https://drive.google.com/file/d/1ngEUH5l0R0c58zZ-y26kTDqBwFv5dr64/view?usp=drivesdk"

    // Links camuflados dos 7 Episódios fornecidos pelo usuário
    const val EPISODE_1_URL = "https://youtu.be/u0WXCHgZxaY?is=bvomW3X72476KQDG"
    const val EPISODE_2_URL = "https://youtu.be/nfVYJ6jFvRA?is=u2IbhITwKelIq86j"
    const val EPISODE_3_URL = "https://youtu.be/nfVYJ6jFvRA?is=wekmdgSbpDXpLgtN"
    const val EPISODE_4_URL = "https://youtu.be/MjHWLBEyPuA?is=AMmTuy78QirdIDW-"
    const val EPISODE_5_URL = "https://youtu.be/okmDuMzlbWM?is=VqqZ-DOp4yRlBz_a"
    const val EPISODE_6_URL = "https://youtu.be/-dQl0VDN07c?is=-UeFZt_oH8dgm4Jf"
    const val EPISODE_7_URL = "https://youtu.be/4KE0NczMVwI?is=Wex5GdY-Z91WjSLu"

    fun getEpisodes(): List<Episode> {
        return listOf(
            Episode(
                id = "dono_morro_ep_1",
                episodeNumber = 1,
                title = "A Chegada no Morro",
                videoUrl = EPISODE_1_URL,
                duration = "Episódio 1",
                genre = "Ação • Drama • Favela",
                synopsis = "O início da trama tensa nas vielas. Um primeiro encontro inesperado muda o destino do morro e acende a disputa de poder entre as facções rivais.",
                badge = "Episódio 1 • Estreia",
                coverUrl = DEFAULT_COVER_DRIVE_URL
            ),
            Episode(
                id = "dono_morro_ep_2",
                episodeNumber = 2,
                title = "Linha de Frente",
                videoUrl = EPISODE_2_URL,
                duration = "Episódio 2",
                genre = "Ação • Favela",
                synopsis = "A tensão aumenta na comunidade. As alianças são testadas após uma operação surpresa e os moradores precisam tomar partido no confronto.",
                badge = "Episódio 2",
                coverUrl = DEFAULT_COVER_DRIVE_URL
            ),
            Episode(
                id = "dono_morro_ep_3",
                episodeNumber = 3,
                title = "O Cerco Fechado",
                videoUrl = EPISODE_3_URL,
                duration = "Episódio 3",
                genre = "Drama • Favela",
                synopsis = "Segredos do passado vêm à tona no alto da colina. Uma revelação comprometedora coloca em risco a liderança e a lealdade de quem comanda a área.",
                badge = "Episódio 3",
                coverUrl = DEFAULT_COVER_DRIVE_URL
            ),
            Episode(
                id = "dono_morro_ep_4",
                episodeNumber = 4,
                title = "Traição nas Vielas",
                videoUrl = EPISODE_4_URL,
                duration = "Episódio 4",
                genre = "Ação • Tensão",
                synopsis = "Uma quebra de confiança abala as estruturas do morro. Ninguém sabe em quem confiar quando uma emboscada na madrugada deixa feridos.",
                badge = "Episódio 4",
                coverUrl = DEFAULT_COVER_DRIVE_URL
            ),
            Episode(
                id = "dono_morro_ep_5",
                episodeNumber = 5,
                title = "A Virada do Jogo",
                videoUrl = EPISODE_5_URL,
                duration = "Episódio 5",
                genre = "Drama • Ação",
                synopsis = "Um plano arriscado é colocado em prática para retomar o controle. O conflito direto nas esquinas exige coragem e sacrifícios dramáticos.",
                badge = "Episódio 5",
                coverUrl = DEFAULT_COVER_DRIVE_URL
            ),
            Episode(
                id = "dono_morro_ep_6",
                episodeNumber = 6,
                title = "Fogo Cruzado",
                videoUrl = EPISODE_6_URL,
                duration = "Episódio 6",
                genre = "Ação • Favela",
                synopsis = "A grande batalha pelo domínio do território atinge o ponto culminante. Decisões irreversíveis são tomadas em uma perseguição eletrizante.",
                badge = "Episódio 6",
                coverUrl = DEFAULT_COVER_DRIVE_URL
            ),
            Episode(
                id = "dono_morro_ep_7",
                episodeNumber = 7,
                title = "O Novo Dono do Morro",
                videoUrl = EPISODE_7_URL,
                duration = "Episódio 7",
                genre = "Drama • Desfecho",
                synopsis = "O desfecho épico da novela. O destino dos personagens é selado em meio a reviravoltas emocionantes que definirão quem realmente manda no morro.",
                badge = "Episódio 7 • Final",
                coverUrl = DEFAULT_COVER_DRIVE_URL
            )
        )
    }
}
