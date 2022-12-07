package com.example.coding_test.baekjoon.문자열

fun main() {
    print(readLine()!!.split(" ").filter { it.isNotEmpty() }.size)
}