package com.example.coding_test.baekjoon.기본수학1

fun main() {
    val input = readLine()!!.split(" ").map { it.toLong() }
    print(if (input[1] >= input[2]) -1 else (input[0] / (input[2] - input[1])) + 1)
}