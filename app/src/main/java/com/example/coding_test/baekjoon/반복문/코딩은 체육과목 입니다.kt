package com.example.coding_test.baekjoon.반복문

fun main() {
    var answer = ""
    repeat(readLine()!!.toInt() / 4) {
        answer += "long "
    }
    print(answer + "int")
}