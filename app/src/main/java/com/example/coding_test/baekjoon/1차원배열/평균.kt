package com.example.coding_test.baekjoon.`1차원배열`

fun main() {
    val count = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }.toList()
    val temp = arrayListOf<Double>()
    for (i in arr.indices)
        temp.add((arr[i] * 100).toDouble() / arr.maxOrNull()!!.toDouble())
    print(temp.average())
}