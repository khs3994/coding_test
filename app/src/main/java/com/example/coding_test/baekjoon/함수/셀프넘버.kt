package com.example.coding_test.baekjoon.함수

fun main() {
    val arr = arrayListOf<Int>()
    for (i in 1..10000) {
        arr.add(i + i.toString().toList().sumOf { it.toString().toInt() })
    }
    (1..10000).subtract(arr.filter { it <= 10000 }.toList().toSet()).forEach {
        println(it)
    }
}