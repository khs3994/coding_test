package com.example.coding_test.baekjoon.정렬

fun main() {
    val arr = List(readLine()!!.toInt()) {
        val input = readLine()!!.split(" ")
        Pair(input[0].toInt(), input[1])
    }.sortedWith(
        compareBy { it.first }
    )
    arr.forEach {
        println("${it.first} ${it.second}")
    }
}