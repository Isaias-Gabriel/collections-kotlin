package collections

fun main() {
    val pair: Pair<String, Double> = Pair("Bristn", 33.5)
    val map1 = mapOf(pair)

    println("map1:")
    map1.forEach { (key, value) -> println("Key: $key - Value: $value") }

    val map2 = mapOf(
        "Ferna" to 22.0,
        "Idina" to 16.0,
    )

    println("map2:")
    map2.forEach { (key, value) -> println("Key: $key - Value $value") }
}