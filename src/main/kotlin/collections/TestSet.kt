package collections

fun main() {
    val bristn = Worker(name = "Bristn", wage = 7.0, contractType = "CLT")
    val ferna = Worker(name = "Ferna", wage = 7.1, contractType = "PJ")
    val idina = Worker(name = "Idina", wage = 6.3, contractType = "CLT")

    val workers1 = setOf(bristn, ferna)
    val workers2 = setOf(idina)

    val workersUnion = workers1.union(workers2)

    println("union:")
    workersUnion.forEach { println(it) }

    val workers3 = setOf(bristn, ferna, idina)
    val workersSubtraction = workers3.subtract(workers2)

    println("subtraction:")
    workersSubtraction.forEach { println(it) }

    val workersIntersection = workers3.intersect(workers2)

    println("intersection:")
    workersIntersection.forEach { println(it) }
}