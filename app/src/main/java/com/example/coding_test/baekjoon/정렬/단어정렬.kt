package com.example.coding_test.baekjoon.정렬

fun main() {
    val arr = List(readLine()!!.toInt()) {
        readLine()!!.toString().let { Pair(it.length, it) }
    }.sortedWith(
        compareBy(
            { it.first },
            { it.second }
        )
    )
    arr.distinct().forEach {
        println(it.second)
    }
}