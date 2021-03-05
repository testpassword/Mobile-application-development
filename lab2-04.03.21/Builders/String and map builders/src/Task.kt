import java.util.HashMap

fun <K, V> buildMap(build: HashMap<K, V>.() -> Unit): Map<K, V> = HashMap<K, V>().apply { build() }

fun usage(): Map<Int, String> =
    buildMap {
        put(0, "0")
        for (i in 1..10) put(i, "$i")
    }
