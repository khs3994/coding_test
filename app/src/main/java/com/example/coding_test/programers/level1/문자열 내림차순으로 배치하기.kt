package com.example.coding_test.programers.level1

fun main() {
    print(sortByDescendingOrder("Zbcdefg"))
}

fun sortByDescendingOrder(s: String): String =
    s.toList().sortedDescending().joinToString("")
