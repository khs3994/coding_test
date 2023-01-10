package com.example.coding_test.baekjoon.재귀

fun main() {
    val input = readLine()!!.toInt()
    print(fibonacci(input))
}

fun fibonacci(input: Int): Int {
    return if (input < 2) input else fibonacci(input - 1) + fibonacci(input - 2)
}