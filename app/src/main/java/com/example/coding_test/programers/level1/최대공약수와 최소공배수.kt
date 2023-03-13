package com.example.coding_test.programers.level1

fun main() {
    print(minimumCommonMultipleAndMaximumCommonMultiple(3, 12))
}

fun minimumCommonMultipleAndMaximumCommonMultiple(n: Int, m: Int): IntArray {
    val num = mutableListOf(1)
    for (i in 2..n * m) {
        if (n % i == 0 && m % i == 0) {
            num.add(i)
        }
    }
    return intArrayOf(num.maxOrNull()!!, n * m / num.maxOrNull()!!)
}