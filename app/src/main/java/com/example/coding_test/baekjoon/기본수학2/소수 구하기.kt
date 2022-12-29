package com.example.coding_test.baekjoon.기본수학2

import kotlin.math.round
import kotlin.math.sqrt

fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val arr = Array(input[1] + 1) { true }
    arr[0] = false
    arr[1] = false
    val squareRoot = round(sqrt(input[1].toFloat())).toInt()
    for (i in 2..squareRoot)
        if (arr[i])
            for (j in i + i..input[1] step i)
                arr[j] = false
    arr.forEachIndexed { index, b ->
        if (b && index >= input[0] && index <= input[1])
            println(index)
    }
}