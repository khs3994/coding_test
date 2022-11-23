package com.example.coding_test.baekjoon.repetition

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val br = BufferedReader(InputStreamReader(System.`in`))
    val count = br.readLine()!!.toInt()
    val arr = arrayOfNulls<Int>(count)
    for (i in arr.indices) {
        arr[i] = br.readLine()!!.split(" ").sumOf { it.toInt() }
    }
    for (i in arr.indices) {
        bw.write(arr[i].toString())
        bw.newLine()
    }
    bw.flush()
    bw.close()
}
