package com.example.coding_test.level1

fun main() {
    print(solution(intArrayOf(10)))
}

fun solution(arr: IntArray): IntArray =
    if (arr.size > 1) arr.filter { it != arr.minOrNull() }.toIntArray() else intArrayOf(-1)