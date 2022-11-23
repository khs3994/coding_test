package com.example.coding_test.baekjoon.repetition

fun main() {
    val price = readLine()!!.toInt()
    val count = readLine()!!.toInt()
    var arr = arrayOfNulls<Int>(count)
    for (i in arr.indices) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        arr[i] = input[0] * input[1]
    }
    if (arr.sumOf { it!! } == price)
        print("Yes")
    else
        print("No")
}