package com.example.coding_test.programers.level1

fun main() {
    solution("one4seveneight")
}

fun solution(s: String): Int{
    var str = s
    val ary =
        arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
    for (i in ary.indices) {
        str = str.replace(ary[i], i.toString())
    }
    return str.toInt()
}