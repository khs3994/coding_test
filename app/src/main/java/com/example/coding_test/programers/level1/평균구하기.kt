package com.example.coding_test.programers.level1

fun main() {
    print(solution3(intArrayOf(5, 5)))
}

fun solution3(arr: IntArray): Double = arr.sum() / arr.size.toDouble()