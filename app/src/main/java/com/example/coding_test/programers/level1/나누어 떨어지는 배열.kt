package com.example.coding_test.programers.level1

fun main() {
    print(solution2(intArrayOf(5, 9, 7, 10), 5))
}

fun solution2(arr: IntArray, divisor: Int): IntArray {
    val answer: IntArray = arr.filter { it % divisor == 0 }.sorted().toIntArray()
    return if (answer.isEmpty()) intArrayOf(-1) else answer
}