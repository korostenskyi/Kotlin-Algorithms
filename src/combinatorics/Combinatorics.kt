package combinatorics

import kotlin.system.measureTimeMillis

fun factorial(number: Long): Long {
    return if (number <= 1) 1
    else factorial(number - 1) * number
}

fun permutations(n: Long, k: Long): Long {
    return factorial(n) / factorial(n - k)
}

fun combinations(n: Long, k: Long): Long {
    return permutations(n, k) / factorial(k)
}

fun main() {
    measureTimeMillis {
        println(factorial(20))
    }.also { println("Time: $it ms") }
}
