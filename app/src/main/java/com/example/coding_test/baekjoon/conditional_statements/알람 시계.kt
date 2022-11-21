package com.example.coding_test.baekjoon.conditional_statements

fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }

    if (input[0] != 0 && input[1] < 45)
        print("${input[0] - 1} ${input[1] + 60 - 45}")
    else if (input[0] == 0 && input[1] < 45)
        print("23 ${input[1] + 60 - 45}")
    else
        print("${input[0]} ${input[1] - 45}")
}