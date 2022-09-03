package com.example.coding_test.level1

fun main() {
    print(solution2(intArrayOf(1,2,3,4,6,7,8,0)))
}

fun solution2(numbers: IntArray): Int = (0..9).filter { !numbers.contains(it) }.sum()