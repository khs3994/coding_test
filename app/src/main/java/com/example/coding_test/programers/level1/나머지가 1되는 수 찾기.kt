package com.example.coding_test.programers.level1

fun main() {
    print(findTherest(10))
}

fun findTherest(n: Int): Int {
    var answer = 0

    for (i in 1..n)
        if (n % i == 1) {
            answer = i
            break
        }

    return answer
}