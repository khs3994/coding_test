package com.example.coding_test.baekjoon.기본수학1

fun main() {
    var input = readLine()!!.toInt()
    var sum = 0
    while (input > 0) {
        if (input % 5 == 0) {
            sum += input / 5
            break
        }
        input -= 3
        sum++
    }
    print(if (input < 0) -1 else sum)
}