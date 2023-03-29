package com.example.coding_test.programers.level2

fun main() {
    print(carpet(18, 6).joinToString())
}

fun carpet(brown: Int, yellow: Int): IntArray {
    val answer = intArrayOf(0, 0)
    val sum = brown + yellow

    for (i in 2..sum)
        if (i >= sum / i && sum % i == 0 && (i - 2) * (sum / i - 2) == yellow) {
            answer[0] = i
            answer[1] = sum / i
            break
        }

    return answer
}