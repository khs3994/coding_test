package com.example.coding_test.programers.level1

fun main() {
    print(solution(arrayOf("jane", "Kim")))
}

fun solution(seoul: Array<String>): String {
    var answer = ""
    seoul.withIndex().forEach { if (it.value == "Kim") answer = "김서방은 ${it.index}에 있다" }
    return answer
}