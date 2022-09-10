package com.example.coding_test.level1

fun main() {
    print(solution3(0))
}

fun solution3(n: Int): Int = (1..n).filter { n % it == 0 }.sum()