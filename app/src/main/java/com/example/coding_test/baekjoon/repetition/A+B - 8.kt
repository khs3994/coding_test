package com.example.coding_test.baekjoon.repetition

fun main() {
    val count = readLine()!!.toInt()
    val arr = arrayOfNulls<String>(count)
    for (i in arr.indices) {
        val arr2 = readLine()!!.split(" ").map { it.toInt() }
        arr[i] = "Case #${i + 1}: ${arr2[0]} + ${arr2[1]} = ${arr2.sum()}"
    }
    for (i in arr.indices)
        println(arr[i])
}