package com.example.coding_test.level1

fun main() {
    print(solution2(2,5))
}

fun solution2(x: Int, n: Int): LongArray {
    var answer = longArrayOf()
    for (i in 1..n) {
        answer.plus((x * i).toLong())
    }
    return answer
}
