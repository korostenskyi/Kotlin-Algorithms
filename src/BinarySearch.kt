import kotlin.system.measureTimeMillis

fun <T : Comparable<T>> List<T>.binarySearch(key: T): T? {
    if (count() == 0) return null
    else {
        var start = 0
        var end = count()
        while (start < end) {
            val mid = start + (end - start) / 2
            when {
                this[mid] == key -> {
                    return this[mid]
                }
                this[mid] < key -> {
                    start = mid + 1
                }
                else -> {
                    end = mid
                }
            }
        }
        return null
    }
}

fun main() {
    val list = (0..10000).toList()
    measureTimeMillis {
        println(list.binarySearch(6))
    }.also { println("Time ${it}ms") }
}
