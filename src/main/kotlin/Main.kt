import utils.executionTimeMillis
import kotlin.math.sqrt

fun main() {
    executionTimeMillis {
        println(ePrimoOtimizado(747))
    }
}

fun ePrimo(number: Int): Boolean {
    if (number <= 1) return false
    for (i in 2 until number) {
        if (number % i == 0) return false
    }
    return true
}

fun ePrimoOtimizado(number: Int): Boolean {
    if (number <= 1) return false
    for (i in 2 until sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) return false
    }
    return true
}


fun binarySearch(list: Array<Int>, item: Int): Int? {
    var low = 0
    var high = list.size.dec()

    while (low <= high) {
        val mid = low + high / 2
        val tentative = list[mid]

        if (tentative == item) return mid
        if (tentative > item) {
            high = mid - 1
        } else {
            low = mid + 1
        }
    }
    return null
}