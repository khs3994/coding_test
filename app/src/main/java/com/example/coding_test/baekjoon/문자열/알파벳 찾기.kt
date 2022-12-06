package com.example.coding_test.baekjoon.문자열

fun main() {
    val input = readLine()!!.toString()
    ('a'..'z').forEach {
        print("${input.indexOf(it)} ")
    }
}