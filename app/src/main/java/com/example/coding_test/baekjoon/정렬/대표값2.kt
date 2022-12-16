package com.example.coding_test.baekjoon.정렬

fun main() {
    val arr = arrayListOf<Int>()
    for (i in 1..5)
        arr.add(readLine()!!.toInt())
    println(arr.sum() / 5)
    println(arr.sorted()[2])
}