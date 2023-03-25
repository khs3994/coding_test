package com.example.coding_test.baekjoon.`1차원배열`

fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val answer = IntArray(input[0])
    repeat(input[1]) {
        val case = readLine()!!.split(" ").map { it.toInt() }
        for (i in case[0] - 1 until case[1])
            answer[i] = case[2]
    }
    print(answer.joinToString(" "))
}