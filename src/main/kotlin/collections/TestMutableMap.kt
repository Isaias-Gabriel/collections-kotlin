package collections

fun main() {
    val bristn = Worker(name = "Bristn", wage = 7.0, contractType = "CLT")
    val ferna = Worker(name = "Ferna", wage = 7.1, contractType = "PJ")
    val idina = Worker(name = "Idina", wage = 6.3, contractType = "CLT")

    println(idina.fire())

    val repository = Repository<Worker>()

    repository.create(bristn.name, bristn)
    repository.create(ferna.name, ferna)
    repository.create(idina.name, idina)

    println(repository.findById(bristn.name))

    repository.findAllValues().forEach { println(it) }

    repository.findAllKeys().forEach { println(it) }
}