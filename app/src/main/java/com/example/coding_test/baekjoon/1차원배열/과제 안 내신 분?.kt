package com.example.coding_test.baekjoon.`1차원배열`

fun main() {
    val arr = arrayListOf<Int>()
    val answer = arrayListOf<Int>()
    while (true) {
        try {
            arr.add(readLine()!!.toInt())
        } catch (e: Exception) {
            break
        }
    }
    for (i in 1..30) {
        if (!arr.contains(i))
            answer.add(i)
    }
    answer.forEach {
        println(it)
    }
}