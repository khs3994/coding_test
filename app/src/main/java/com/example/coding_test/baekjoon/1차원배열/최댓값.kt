package com.example.coding_test.baekjoon.`1차원배열`

fun main() {
    val arr = arrayListOf<Int>()
    while (true) {
        try {
            arr.add(readLine()!!.toInt())
        } catch (e: Exception) {
            break
        }
    }
    print("${arr.maxOf { it }}\n${arr.indexOf(arr.maxOf { it }) + 1}")
}