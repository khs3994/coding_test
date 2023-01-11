package com.example.coding_test.baekjoon.`2차원배열`

fun main() {
    val map = Array(101) { Array(101) { false } }

    repeat(readLine()!!.toInt()) {
        val (ix, iy) = readLine()!!.split(" ").map { it.toInt() }

        repeat(10) { x ->
            repeat(10) { y ->
                map[ix + x][iy + y] = true
            }
        }
    }

    println(map.sumOf { it.count { it } })
}