package com.example.coding_test.programers.level1

fun main() {
    print(solution6(10))
}

fun solution6(x: Int): Boolean = x % x.toString().toList().sumOf { it.toString().toInt() } == 0