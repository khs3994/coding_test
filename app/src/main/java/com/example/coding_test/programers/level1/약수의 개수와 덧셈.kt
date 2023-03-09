package com.example.coding_test.programers.level1

fun main() {
    print(sumOfDivisor(13, 17))
}

fun sumOfDivisor(left: Int, right: Int): Int {
    var temp = 0
    var answer = 0

    (left..right).forEach { num ->
        (1..num).forEach {
            if (num % it == 0)
                temp++
        }
        if (temp % 2 == 0) answer += num
        else answer -= num
        temp = 0
    }
    return answer
}