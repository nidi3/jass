package guru.nidi.jass

import java.io.File
import java.net.URL

fun main() {
    val base = "https://www.jassverzeichnis.ch/images/jasskarten"
    for (i in 0..8) {
        for (color in listOf("herz", "karo", "kreuz", "pik")) {
            File("src/main/resources/fr/$color-${8 - i}.gif").writeBytes(URL("$base/fr/$color$i\$.gif").readBytes())
        }
        for (color in listOf("eichel", "rosen", "schellen", "schilten")) {
            File("src/main/resources/de/$color-${8 - i}.gif").writeBytes(URL("$base/de/$color$i\$.gif").readBytes())
        }
    }
}
