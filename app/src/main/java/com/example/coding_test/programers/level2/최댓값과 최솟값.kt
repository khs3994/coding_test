package com.example.coding_test.programers.level2

fun main() {
    print(minAndMax("-1 -2 -3 -4"))
}

fun minAndMax(s: String): String {
    val list = s.split(" ").toList().map { it.toInt() }
    return "${list.minOrNull()} ${list.maxOrNull()}"
}