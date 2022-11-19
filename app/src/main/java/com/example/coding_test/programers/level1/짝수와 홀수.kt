package com.example.coding_test.programers.level1

fun main() {
    print(solution2(4))
}

fun solution2(num: Int): String = if (num % 2 == 0) "Even" else "Odd"