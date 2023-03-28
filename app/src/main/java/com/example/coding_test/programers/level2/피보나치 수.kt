package com.example.coding_test.programers.level2

fun main() {
    print(fibonacci(3))
}

fun fibonacci(n: Int): Int {
    val answer = IntArray(n + 1){ 1 }
    (3..n).forEach{ answer[it] = (answer[it - 2] + answer[it - 1]) % 1234567 }
    return answer[n]
}