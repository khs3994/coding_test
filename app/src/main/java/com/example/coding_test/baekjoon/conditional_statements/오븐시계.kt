package com.example.coding_test.baekjoon.conditional_statements

fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val time = readLine()!!.toInt()
    val minute = input[0] * 60 + input[1] + time
    print("${minute / 60 % 24} ${minute % 60}")
}