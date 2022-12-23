package com.example.coding_test.baekjoon.문자열

fun main() {
    val cnt = readLine()!!.toInt()
    var answer = cnt
    repeat(cnt) {
        var word = readLine()!!.toString()
        while(word.length > 1) {
            word = if(word[0] == word[1]) {
                word.substring(1)
            } else {
                if(word.substring(1).length != word.replace(word[0].toString(), "").length) {
                    answer--
                    break
                }
                word.substring(1)
            }
        }
    }
    print(answer)
}
