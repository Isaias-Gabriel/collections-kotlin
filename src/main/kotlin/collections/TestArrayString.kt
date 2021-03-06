package collections

fun main() {
    val intValues = Array<Int>(7) {1}

    intValues.forEach { value ->
        println(value)
    }

    println("---")

    val stringValues = Array<String>(4) {":D"}

    stringValues.forEach { value ->
        println(value)
    }

    println("---")

    val names = arrayOf("Bristn", "Karva", "Destermion", "Gralda", "Eldrfvn")

    names.sort()

    names.forEach { name ->
        println(name)
    }
}