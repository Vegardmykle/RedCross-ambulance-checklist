package no.uio.ifi.in2000.vamykleb.checklist

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return sayHello(platform.name)
    }
}