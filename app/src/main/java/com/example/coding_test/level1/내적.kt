package com.example.coding_test.level1

fun main() {

    val a = intArrayOf(1, 2, 3, 4)
    val b = intArrayOf(-3, -1, 0, 2)

    print("answer : " + solution(a, b))
}

fun solution(a: IntArray, b: IntArray): Int {
    var answer = 0

    for (i in a.indices) {
        answer += a[i] * b[i]
    }

    return answer
}