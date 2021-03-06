package collections

fun main() {
    val bristn = Worker(name = "Bristn", wage = 7.0, contractType = "CLT")
    val ferna = Worker(name = "Ferna", wage = 7.1, contractType = "PJ")
    val idina = Worker(name = "Idina", wage = 6.3, contractType = "CLT")

    val workers = listOf(bristn, ferna, idina)

    workers.forEach() { println(it.toString()) }

    println(workers.find { it.name == "Ferna" })

    println("sorted by wage:")

    workers
        .sortedBy { it.wage }
        .forEach { println(it) }

    println("grouped by contract type:")

    workers
        .groupBy { it.contractType }
        .forEach { println(it) }

}

data class Worker(
    val name: String,
    val wage: Double,
    val contractType: String,
) {
    override fun toString(): String =
        """
            Name: $name,
            Wage: $wage
            ---
        """.trimIndent()

}