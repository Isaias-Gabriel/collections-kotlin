package collections

fun main() {
    val values = DoubleArray(3)

    values[0] = 2.1
    values[1] = 3.7
    values[2] = 4.9

    values.forEachIndexed { index, value ->
        values[index] *= 1.21
    }

    values.forEach { println(it) }
}