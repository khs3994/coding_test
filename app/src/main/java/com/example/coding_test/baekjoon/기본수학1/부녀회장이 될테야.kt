package com.example.coding_test.baekjoon.기본수학1

fun main() {
    val cnt = readLine()!!.toInt()
    val arr = Array(15) { Array(15) { 0 } }
    for (i in 0..14) {
        for (j in 0..14) {
            if (i == 0 || j == 0) arr[i][j] = j+1
            else arr[i][j] = arr[i - 1][j] + arr[i][j - 1]
        }
    }
    repeat(cnt){
        val x = readLine()!!.toInt()
        val y = readLine()!!.toInt()
        println(arr[x][y-1])
    }
}