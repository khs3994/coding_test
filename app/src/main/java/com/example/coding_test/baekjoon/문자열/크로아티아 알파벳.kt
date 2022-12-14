package com.example.coding_test.baekjoon.문자열

fun main() {
    var input = readLine()!!.toString()
    val croatia = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    croatia.forEach {
        if (input.contains(it))
            input = input.replace(it, "0")
    }
    print(input.length)
}