package com.example.coding_test.baekjoon.repetition

fun main() {
    val input = readLine()!!.toInt()
    var sum = 0
    for (i in 1..input)
        sum += i
    print(sum)
}