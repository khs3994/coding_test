package com.example.coding_test.programers.level1

fun main() {
    print(solution5(626331))
}

fun solution5(num: Int): Int {
    var number: Long = num.toLong()
    var cnt = 0
    while (cnt <= 500) {
        if (number.toInt() == 1) return cnt
        number = if (number.toInt() % 2 == 0) number / 2 else number * 3 + 1
        cnt++
    }
    return -1
}