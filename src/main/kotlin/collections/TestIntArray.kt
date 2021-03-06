package collections

fun main() {
    val values = IntArray(5)

    values[0] = 7
    values[4] = 1

//    values.forEach {
//        println(it)
//    }

    println(values.indices)

    println("---")

    values.forEach { value ->
        println(value)
    }

    println("---")

    values.sort()

    for(index in values.indices) {
        println(values[index])
    }
}