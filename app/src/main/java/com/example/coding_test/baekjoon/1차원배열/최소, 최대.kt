package com.example.coding_test.baekjoon.`1차원배열`

fun main() {
    val cnt = readLine()!!.toInt()
    val numbers = readLine()!!.split(" ").map { it.toInt() }
    print("${numbers.minOf { it }} ${numbers.maxOf { it }}")
}