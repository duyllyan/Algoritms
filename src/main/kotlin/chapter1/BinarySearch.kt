package chapter1

object BinarySearch {
    fun Array<Int>.binarySearch(item: Int): Int? {
        var min = 0
        var max = lastIndex

        while (min <= max) {
            val mid = (min + max) / 2
            val tentative = this[mid]

            if (tentative == item) return mid
            if (tentative > item) max = mid.dec()
            else min = mid.inc()
        }
        return null
    }

    fun Array<Int>.normalSearch(item: Int): Int? {
        for (i in 0..lastIndex) {
            if (i == item) return i
        }
        return null
    }
}