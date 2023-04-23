package utils
inline fun <T> executionTimeMillis(
    loggingFunction : (Long) -> Unit = {
        println("Execution time: $it milliseconds")
    },
    function: () -> T
): T {
    val startTime = System.currentTimeMillis()
    val result: T = function.invoke()
    loggingFunction.invoke(System.currentTimeMillis() - startTime)

    return result
}

fun main() {
    val test = Array(2000000) {it + 1}
    println(test.joinToString(", "))
}