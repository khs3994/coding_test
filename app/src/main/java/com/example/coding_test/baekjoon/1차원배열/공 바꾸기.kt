package com.example.coding_test.baekjoon.`1차원배열`

fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val arr = IntArray(input[0])

    for (i in 0 until input[0])
        arr[i] = i + 1

    repeat(input[1]) {
        val index = readLine()!!.split(" ").map { it.toInt() - 1 }
        val temp = arr[index[0]]
        arr[index[0]] = arr[index[1]]
        arr[index[1]] = temp
    }
    print(arr.joinToString(" "))
}