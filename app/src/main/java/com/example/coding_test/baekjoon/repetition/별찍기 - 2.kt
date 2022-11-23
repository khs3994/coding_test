package com.example.coding_test.baekjoon.repetition

fun main() {
    val count = readLine()!!.toInt()
    for (i in 1..count) {
        for (j in 1..count - i)
            print(" ")
        for (k in 1..i)
            print("*")
        println()
    }
}