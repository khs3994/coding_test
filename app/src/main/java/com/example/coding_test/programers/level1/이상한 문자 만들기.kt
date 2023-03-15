package com.example.coding_test.programers.level1

fun main() {
    print(strangeCharacter("abc abcd abcde"))
}

fun strangeCharacter(s: String): String =
    s.split(" ").joinToString(" ") {
        it.mapIndexed { index, c ->
            if (index % 2 == 0)
                c.uppercase()
            else
                c.lowercase()
        }.joinToString("")
    }