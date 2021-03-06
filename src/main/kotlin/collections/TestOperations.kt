package collections

fun main() {
    val values = doubleArrayOf(2.1, 3.7, 4.9)

    for(value in values) {
        println(value)
    }

    println("---")

    println(
        """
            Maximum value: ${values.maxOrNull()},
            Minimum value: ${values.minOrNull()},
            Average: ${values.average()}
        """.trimIndent()
    )

    println("---")

    val greaterThan = values.filter { it > 2.5 }

    println("Greater than 2.5: ")

    greaterThan.forEach() { println(it) }

    println("---")

    println(values.count { it in 2.0..3.5 })

    println("---")

    println(values.find { it === 2.1 })

    println("---")

    println(values.any { it === 2.1 })

    println("---")

    println(values.all { it === 2.1 })
}