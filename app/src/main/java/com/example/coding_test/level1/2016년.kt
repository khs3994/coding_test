package com.example.coding_test.level1

fun main() {
    print(solution(1, 1))
}

fun solution(a: Int, b: Int): String {
    val mon = listOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val day = listOf("THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED")
    return day[((0 until a - 1).sumOf { mon[it] } + b) % 7]
}