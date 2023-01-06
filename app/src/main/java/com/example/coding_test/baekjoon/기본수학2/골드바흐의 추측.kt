package com.example.coding_test.baekjoon.기본수학2

import kotlin.math.round
import kotlin.math.sqrt

fun main() {
    val input = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val arr = Array(input.maxOrNull()!! + 1) { true }
    arr[0] = false
    arr[1] = false
    val squareRoot = round(sqrt(input.maxOrNull()!!.toFloat())).toInt()
    for (i in 2..squareRoot)
        if (arr[i])
            for (j in i + i..input.maxOrNull()!! step i)
                arr[j] = false
    val intArr = arrayListOf<Int>()
    arr.forEachIndexed { index, b ->
        if (b)
            intArr.add(index)
    }
    input.forEach {
        var temp1 = it / 2
        var temp2 = it / 2
        while (true) {
            if (intArr.contains(temp1) && intArr.contains(temp2)) {
                print("$temp1 $temp2")
                println()
                break
            }
            temp1--
            temp2++
        }
    }
}