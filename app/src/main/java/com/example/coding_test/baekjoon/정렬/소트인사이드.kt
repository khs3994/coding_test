package com.example.coding_test.baekjoon.정렬

fun main() {
    print(
        readLine()!!.toList().map { it.toString().toInt() }.sorted().reversed()
            .joinToString("")
    )
}