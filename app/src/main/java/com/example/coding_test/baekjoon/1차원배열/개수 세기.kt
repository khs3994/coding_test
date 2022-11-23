package com.example.coding_test.baekjoon.`1차원배열`

fun main() {
    val count = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }
    val num = readLine()!!.toInt()
    var cnt = 0
    arr.forEach { if (it == num) cnt++ }
    print(cnt)
}