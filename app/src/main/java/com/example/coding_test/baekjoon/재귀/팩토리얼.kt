package com.example.coding_test.baekjoon.재귀

fun main() {
    val input = readLine()!!.toInt()
    print(factorial(input, 1))
}

fun factorial(num: Int, temp: Int): Int {
    return if (num <= 0) {
        temp
    } else {
        factorial(num - 1, num * temp)
    }
}