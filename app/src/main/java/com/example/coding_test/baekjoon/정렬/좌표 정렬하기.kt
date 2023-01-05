package com.example.coding_test.baekjoon.정렬

fun main() {
    val arr = List(readLine()!!.toInt()) {
        readLine()!!.split(" ").map { it.toInt() }.let { Pair(it[0], it[1]) }
    }.sortedWith(
        compareBy(
            { it.first },
            { it.second }
        )
    )
    arr.forEach {
        println("${it.first} ${it.second}")
    }
}