package com.example.coding_test.baekjoon.문자열

fun main() {
    val input = readLine()!!.toString()
    ('a'..'z').forEach {
        print("${if (input.contains(it)) input.indexOf(it) else "-1"} ")
    }
}