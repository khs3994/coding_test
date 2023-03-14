package com.example.coding_test.programers.level1

import kotlin.math.pow

fun main() {
    trigonometric(125)
}

fun trigonometric(n: Int): Int {
    val list = mutableListOf<Int>()
    var temp = n
    var answer = 0

    while (temp != 0) {
        list.add(temp % 3)
        temp /= 3
    }

    list.reverse()
    list.forEachIndexed { index, i ->
        answer += i * ((3.0).pow(index)).toInt()
    }

    return answer
}