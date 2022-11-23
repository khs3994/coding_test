package com.example.coding_test.baekjoon.repetition

fun main() {
    val arr = arrayListOf<Int>()
    while (true) {
        arr.add(readLine()!!.split(" ").sumOf { it.toInt() })
        if (arr.last() == 0)
            break
    }
    for (i in 0..arr.size - 2)
        println(arr[i])
}