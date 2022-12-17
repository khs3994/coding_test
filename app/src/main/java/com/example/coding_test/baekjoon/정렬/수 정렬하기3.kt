package com.example.coding_test.baekjoon.정렬

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val arr = IntArray(br.readLine().toInt())
    for (i in arr.indices)
        arr[i] = br.readLine()!!.toInt()
    Arrays.sort(arr)
    for (i in arr.indices)
        bw.write(arr[i].toString() + "\n")
    bw.flush()
    bw.close()
}