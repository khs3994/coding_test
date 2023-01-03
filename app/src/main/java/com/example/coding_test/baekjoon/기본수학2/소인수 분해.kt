package com.example.coding_test.baekjoon.기본수학2

fun main() {
    var input = readLine()!!.toInt()
    for (i in 2..input) {
        if (input % i == 0) {
            while (input % i == 0) {
                input /= i
                println(i)
            }
        }
        if (input == 1)
            break
    }
}