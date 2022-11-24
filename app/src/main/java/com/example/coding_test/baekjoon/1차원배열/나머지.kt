package com.example.coding_test.baekjoon.`1차원배열`

fun main() {
    val arr = arrayListOf<Int>()
    val temp = arrayListOf<Int>()
    for (i in 1..10)
        arr.add(readLine()!!.toInt() % 42)
    arr.forEach {
        if (!temp.contains(it))
            temp.add(it)
    }
    print(temp.size)
}