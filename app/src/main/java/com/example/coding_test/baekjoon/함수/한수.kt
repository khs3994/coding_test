package com.example.coding_test.baekjoon.함수

fun main() {
    print(solution(readLine()!!.toInt()))
}

fun solution(num: Int): Int {
    var cnt = 99
    lateinit var arr: List<Int>
    for (i in 100..num) {
        arr = i.toString().toList().map { it.toString().toInt() }
        if (arr.maxOrNull()!! - arr[1] == arr[1] - arr.minOrNull()!!) {
            cnt++
        }
    }
    return if (num < 100) num else cnt
}