package com.example.coding_test.baekjoon.기본수학1

fun main() {
    var input = readLine()!!.toInt()
    var cnt = 1
    do {
        if (input == 1)
            break
        input -= cnt * 6
        cnt++
    } while (0 < input)
    print(cnt)
}