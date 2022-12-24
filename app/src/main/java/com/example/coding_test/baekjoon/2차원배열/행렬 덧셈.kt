package com.example.coding_test.baekjoon.`2차원배열`

fun main() {
    val size = readLine()!!.split(" ").map { it.toInt() }
    val arr1 = arrayListOf<List<Int>>()
    val arr2 = arrayListOf<List<Int>>()
    repeat(size[0]) {
        arr1.add(readLine()!!.split(" ").map { it.toInt() })
    }
    repeat(size[0]) {
        arr2.add(readLine()!!.split(" ").map { it.toInt() })
    }
    for (i in 0 until size[0]) {
        for (j in 0 until size[1]) {
            print("${arr1[i][j] + arr2[i][j]} ")
        }
        println()
    }
}