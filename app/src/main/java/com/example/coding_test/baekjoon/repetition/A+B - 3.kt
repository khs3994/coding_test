package com.example.coding_test.baekjoon.repetition

fun main() {
    val count = readLine()!!.toInt()
    val arr = arrayOfNulls<Int>(count)
    for (i in arr.indices)
        arr[i] = readLine()!!.split(" ").sumOf { it.toInt() }
    for (i in arr.indices)
        println(arr[i])
}