package com.example.coding_test.programers.level1

fun main() {
    print(solution(intArrayOf(4,7,12), booleanArrayOf(true,false,true)))
}

fun solution(absolutes: IntArray, signs: BooleanArray): Int {
    var answer: Int = 0

    for (i in absolutes.indices) {
        if (!signs[i]) {
            answer -= absolutes[i]
        } else {
            answer += absolutes[i]
        }
    }

    return answer
}