package com.example.coding_test.baekjoon.`1차원배열`

fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val numbers = readLine()!!.split(" ").map { it.toInt() }.filter { it < input[1] }.toList()
    for (i in numbers.indices)
        print("${numbers[i]} ")
}