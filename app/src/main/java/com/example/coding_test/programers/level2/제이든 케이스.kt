package com.example.coding_test.programers.level2

fun main() {
    print(jadenCase("for the last week"))
}

fun jadenCase(s: String): String =
    s.split(" ").joinToString {
        it.mapIndexed { index, c -> if (index == 0) c.uppercase() else c.lowercase() }.joinToString("")
    }.replace(",", "")