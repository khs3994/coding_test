package com.example.coding_test.baekjoon.반복문

fun main() {
    val input = readLine()!!.toInt()
    var sum = 0
    for (i in 1..input)
        sum += i
    print(sum)
}