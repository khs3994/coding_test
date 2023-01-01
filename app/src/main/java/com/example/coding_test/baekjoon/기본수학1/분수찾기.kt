package com.example.coding_test.baekjoon.기본수학1

fun main() {
    val input = readLine()!!.toInt()
    var x = 0
    var y = 1
    for (i in 1..input) {
        if (x == 1 && (x + y) % 2 == 0) {
            y++
        } else if (x != 1 && (x + y) % 2 == 0) {
            x--
            y++
        } else if (y == 1 && (x + y) % 2 == 1) {
            x++
        } else {
            x++
            y--
        }
    }
    print("$x/$y")
}