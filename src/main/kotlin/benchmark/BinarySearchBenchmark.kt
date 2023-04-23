package benchmark

import chapter1.BinarySearch.binarySearch
import chapter1.BinarySearch.normalSearch
import kotlinx.benchmark.Scope
import org.openjdk.jmh.annotations.*
import java.util.concurrent.TimeUnit

@State(Scope.Benchmark)
@Fork(1)
@Warmup(iterations = 0)
@Measurement(
    iterations = 1,
    time = 1,
    timeUnit = TimeUnit.MILLISECONDS
)
class BinarySearchBenchmark {

    private lateinit var numbers: Array<Int>

    @Setup
    fun setUp() {
        numbers = Array(2000000) {it + 1}
    }

    @Benchmark
    fun binarySearchBenchmark(): Int? {
        return numbers.binarySearch(500000)
    }

    @Benchmark
    fun normalSearchBenchmark(): Int? {
        return numbers.normalSearch(500000)
    }
}