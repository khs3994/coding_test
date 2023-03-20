package com.example.coding_test.programers.level2

fun main() {
    print(binaryTransformation("110010101001"))
}

fun binaryTransformation(s: String): IntArray {
    var temp = s
    var zeroCnt = 0
    var cnt = 0

    while (temp != "1") {
        zeroCnt += temp.filter { it.toString() == "0" }.length
        temp = Integer.toBinaryString(temp.filter { it.toString() == "1" }.length)
        cnt++
    }

    return intArrayOf(cnt, zeroCnt)
}