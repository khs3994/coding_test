package com.example.coding_test.programers.level1

fun main() {
    print(solution5("abcd"))
}

fun solution5(s: String): String = if(s.length % 2 != 0) s.substring(s.length/2, s.length/2+1) else s.substring(s.length/2-1 until (s.length/2+1))