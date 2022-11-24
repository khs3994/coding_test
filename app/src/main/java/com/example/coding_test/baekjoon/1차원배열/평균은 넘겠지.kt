package com.example.coding_test.baekjoon.`1차원배열`

fun main() {
    repeat(readLine()!!.toInt()) {
        val arr = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
        arr.removeFirst()
        val temp = arr.filter { it > arr.sum().toDouble() / arr.size.toDouble() }.toList()
        val answer = (temp.size.toDouble() / arr.size.toDouble()) * 100
        println(String.format("%.3f", answer) + "%")
    }
}