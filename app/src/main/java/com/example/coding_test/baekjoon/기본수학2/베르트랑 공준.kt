package com.example.coding_test.baekjoon.기본수학2

import kotlin.math.round
import kotlin.math.sqrt

fun main() {
    val arr = arrayListOf<Int>()
    while (true) {
        val input = readLine()!!.toInt()
        if (input == 0)
            break
        arr.add(input)
    }
    arr.forEach {
        val squareRoot = round(sqrt((it * 2).toFloat())).toInt()
        val boolArr = Array(it * 2 + 1) { true }
        for (i in 2..squareRoot)
            if (boolArr[i])
                for (j in i + i..it * 2 step i)
                    boolArr[j] = false
        (0 .. it).forEach { index ->
            boolArr[index] = false
        }
        println(boolArr.filter { bool -> bool }.size)
    }
}