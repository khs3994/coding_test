package com.example.coding_test.baekjoon.정렬

fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val arr = readLine()!!.split(" ").map { it.toInt() }.sorted().reversed()
    print(arr[input[1] - 1])
}