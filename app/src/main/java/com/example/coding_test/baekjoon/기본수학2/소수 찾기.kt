package com.example.coding_test.baekjoon.기본수학2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine().toInt()
    var cnt = 0
    val input = readLine().split(" ").map { it.toInt() }
    val arr = Array(1001) { true }
    arr[0] = false
    arr[1] = false
    for (i in 2..100)
        if (arr[i]) {
            for (j in (i * i)..1000 step i)
                arr[j] = false
        }
    arr.forEachIndexed { index, b ->
        if (input.contains(index) && b)
            cnt++
    }
    print(cnt)
}