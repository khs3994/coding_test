package com.example.coding_test.baekjoon.기본수학1

fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    var cnt = (input[2] - input[1]) / (input[0] - input[1])
    if ((input[2] - input[1]) % (input[0] - input[1]) != 0) {
        cnt++
    }
    print(cnt)
}