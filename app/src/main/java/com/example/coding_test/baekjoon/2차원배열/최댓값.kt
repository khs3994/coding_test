package com.example.coding_test.baekjoon.`2차원배열`

fun main() {
    val arr = Array(9) { readLine()!!.split(" ").map { it.toInt() } }
    val max = arr.maxOf { it.maxOf { it } }
    for (i in 0..8)
        for (j in 0..8) {
            if (arr[i][j] == max) {
                println(max)
                println("${i+1} ${j+1}")
                break
            }
        }
}