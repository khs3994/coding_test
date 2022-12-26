package com.example.coding_test.baekjoon.기본수학1

fun main() {
    val answer = arrayListOf<Int>()
    repeat(readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        answer.add((if (input[2] % input[0] == 0) input[0]*100 else (input[2] % input[0]) * 100) + (input[2] / input[0]) + if (input[2] % input[0] > 0) 1 else 0)
    }
    answer.forEach { println(it) }
}