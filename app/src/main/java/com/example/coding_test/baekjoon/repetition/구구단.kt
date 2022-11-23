package com.example.coding_test.baekjoon.repetition

fun main() {
    val input = readLine()!!.toInt()
    for (i in 1..9) {
        println("$input * $i = ${input * i}")
    }
}