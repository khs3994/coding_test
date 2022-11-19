package com.example.coding_test.programers.level1

fun main() {
    print(solution4(12345))
}

fun solution4(n: Long): IntArray {
    val result = mutableListOf<Int>()
    var temp = n
    while (temp >= 1) {
        result.add((temp % 10).toInt())
        temp /= 10
    }
    return result.toIntArray()
}