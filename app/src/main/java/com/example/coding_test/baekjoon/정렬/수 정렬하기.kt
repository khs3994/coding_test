package com.example.coding_test.baekjoon.정렬

fun main() {
    val size = readLine()!!.toInt()
    val arr = arrayListOf<Int>()
    for (i in 1..size)
        arr.add(readLine()!!.toInt())
    arr.sorted().forEach {
        println(it)
    }
}