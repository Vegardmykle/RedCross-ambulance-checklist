package no.uio.ifi.in2000.vamykleb.checklist

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform