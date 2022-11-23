package com.example.coding_test.baekjoon.반복문

fun main() {
    val input = readLine()!!.toInt()
    var temp = input
    var cnt = 0
    do {
        temp =
            temp % 10 * 10 + if ((temp / 10 + temp % 10) >= 10) temp / 10 + temp % 10 - 10 else temp / 10 + temp % 10
        cnt++
    } while (temp != input)
    print(cnt)
}