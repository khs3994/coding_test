package com.example.coding_test.baekjoon.문자열

fun main() {
    val number = readLine().toString()
    var answer = 0

    for (i in number.indices) {
        answer += dial(number[i].toString())
    }
    print(answer)
}

fun dial(dial: String): Int {
    return when (dial) {
        in "A".."C" -> 3
        in "D".."F" -> 4
        in "G".."I" -> 5
        in "J".."L" -> 6
        in "M".."O" -> 7
        in "P".."S" -> 8
        in "T".."V" -> 9
        in "W".."Z" -> 10
        else -> 0
    }
}