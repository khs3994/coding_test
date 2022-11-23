package com.example.coding_test.baekjoon.repetition

fun main() {
    val arr = arrayListOf<Int>()
    while (true) {
        try {
            arr.add(readLine()!!.split(" ").sumOf { it.toInt() })
        } catch (e: Exception) {
            break
        }
    }
    for (i in arr.indices)
        println(arr[i])
}