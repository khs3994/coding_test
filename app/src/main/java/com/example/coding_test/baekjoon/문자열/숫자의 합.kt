package com.example.coding_test.baekjoon.문자열

fun main() {
    val cnt = readLine()!!.toInt()
    val input = readLine()!!.toString().toList().sumOf { it.toString().toInt() }
    print(input)
}

