package collections

fun main() {
    val bristn = Worker(name = "Bristn", wage = 7.0, contractType = "CLT")

    println(bristn)

    println(bristn.fire())
}

fun Worker.fire() = "You're fired, ${this.name}!\nNow go back to work!"