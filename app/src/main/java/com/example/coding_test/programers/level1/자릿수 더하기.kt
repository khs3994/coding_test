package com.example.coding_test.programers.level1

fun main() {
    print(solution4(123))
}

fun solution4(n: Int): Int {
    var answer = 0
    var temp = n
    while (temp >= 1) {
        answer += temp % 10
        temp /= 10
    }
    return answer
}