package com.example.coding_test.baekjoon.문자열

fun main() {
    val input = readLine()!!.split(" ").map { it.toList().reversed().joinToString("").toInt() }
    print(input.maxOrNull())
}