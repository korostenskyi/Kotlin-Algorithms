fun <T> Iterable<T>.linearSearch(predicate: (T) -> Boolean): T? {
    for (element in this) {
        if (predicate(element)) {
            return element
        }
    }
    return null
}

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(list.linearSearch { it == 10 })
}
