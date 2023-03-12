package com.example.coding_test.programers.level1

fun main() {
    print(cola(5, 3, 21))
}

fun cola(a: Int, b: Int, n: Int): Int {
    var answer: Int = n
    var temp = 0

    while (answer >= a) {
        temp += (answer / a) * b
        answer = ((answer / a)*b) + (answer % a)
    }

    return temp
}