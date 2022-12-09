package com.example.coding_test.baekjoon.문자열

fun main() {
    val arr = arrayListOf<List<String>>()
    repeat(readLine()!!.toInt()) {
        arr.add(readLine()!!.split(" "))
    }
    arr.forEach { input ->
        input[1].forEach { str -> repeat(input[0].toInt()) { print(str) } }
        println()
    }
}