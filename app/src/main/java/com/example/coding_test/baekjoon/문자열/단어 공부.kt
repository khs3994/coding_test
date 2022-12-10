package com.example.coding_test.baekjoon.문자열

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()!!.toString().uppercase()
    val arr = IntArray(26) { 0 }
    ('A'..'Z').forEachIndexed { index, c ->
        input.forEach {
            if (c == it) {
                arr[index]++
            }
        }
    }
    print(if (arr.filter { it == arr.maxOrNull() }
            .sum() == arr.maxOrNull()) (65 + arr.indexOf(arr.maxOrNull()!!)).toChar() else "?")
}