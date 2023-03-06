package com.example.coding_test.programers.level1

fun main() {
    print(theSumOfIntegers(3, 5))
}

fun theSumOfIntegers(a: Int, b: Int): Long =
    (if (a > b) b.toLong()..a.toLong() else a.toLong()..b.toLong()).sum()