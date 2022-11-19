package com.example.coding_test.programers.level1

fun main() {
    print(solution2(-2, 5))
}

fun solution2(x: Int, n: Int) = LongArray(n) { x.toLong() * (it + 1) }

