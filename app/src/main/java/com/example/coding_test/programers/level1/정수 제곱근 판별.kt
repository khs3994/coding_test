package com.example.coding_test.programers.level1

import kotlin.math.sqrt

fun main() {
    print(solution(11L))
}

fun solution(n: Long): Long {
    val num = sqrt(n.toDouble())
    val temp = (num % 1) * 100
    return if (temp.toInt() == 0) {
        ((num + 1) * (num + 1)).toLong()
    } else {
        -1
    }
}
