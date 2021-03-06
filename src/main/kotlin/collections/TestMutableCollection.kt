package collections

fun main() {
    val bristn = Worker(name = "Bristn", wage = 7.0, contractType = "CLT")
    val ferna = Worker(name = "Ferna", wage = 7.1, contractType = "PJ")
    val idina = Worker(name = "Idina", wage = 6.3, contractType = "CLT")

    println("---MUTABLE LIST---")

    val workers = mutableListOf(bristn, ferna)
    workers.forEach { println(it) }

    println("Element added:")
    workers.add(idina)
    workers.forEach { println(it) }

    println("Element removed:")
    workers.remove(ferna)
    workers.forEach { println(it) }

    println("---MUTABLE SET---")

    val workersSet = mutableSetOf(bristn)

    workersSet.add(ferna)
    workersSet.add(idina)

    workersSet.forEach { println(it) }

    println("---MUTABLE MAP---")

    val workersMap = mutableMapOf<String, Double>(bristn.name to bristn.wage)

    workersMap[ferna.name] = ferna.wage
    workersMap[idina.name] = idina.wage

    workersMap.forEach { println(it) }

    println("Element removed from map:")
    workersMap.remove(ferna.name)
    workersMap.forEach { println(it) }

}