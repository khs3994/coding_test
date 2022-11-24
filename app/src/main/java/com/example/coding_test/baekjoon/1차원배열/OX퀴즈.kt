package com.example.coding_test.baekjoon.`1차원배열`

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    repeat(readLine().toInt()) {
        var count = 1
        var sum = 0
        val arr = readLine().toList()
        arr.forEach {
            if (it == 'O') {
                sum += count
                count++
            } else {
                count = 1
            }
        }
        println(sum)
    }
}