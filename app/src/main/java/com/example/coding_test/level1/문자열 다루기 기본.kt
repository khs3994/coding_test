package com.example.coding_test.level1

fun main() {
    print(solution4("a234"))
}

fun solution4(s: String): Boolean {
    var answer = true
    answer = s.length == 4 || s.length == 6
    try {
        s.toInt()
    } catch (e: Exception) {
        answer = false
    }
    return answer
}