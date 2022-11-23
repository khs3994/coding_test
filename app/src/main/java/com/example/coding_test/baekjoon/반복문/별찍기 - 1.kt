package com.example.coding_test.baekjoon.반복문

fun main() {
    val count = readLine()!!.toInt()
    for (i in 1..count) {
        for (j in 1..i)
            print("*")
        println()
    }
}