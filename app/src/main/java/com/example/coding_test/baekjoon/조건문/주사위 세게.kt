package com.example.coding_test.baekjoon.조건문

fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }

    if (input[0] == input[1] && input[0] == input[2])
        print(10000 + input[0] * 1000)
    else if ((input[0] != input[1] && input[0] != input[2]) && input[1] != input[2])
        print(input.sorted()[2] * 100)
    else {
        if (input[0] == input[1])
            print(1000 + input[0] * 100)
        else if (input[1] == input[2])
            print(1000 + input[1] * 100)
        else
            print(1000 + input[0] * 100)
    }
}