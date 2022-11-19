package com.example.coding_test.programers.level1

fun main() {
    solution2("01039948003")
}

fun solution2(phone_number: String): String {
    var answer = ""
    for (i in 1..phone_number.length-4){
        answer += "*"
    }
    answer += phone_number.substring(phone_number.length - 4,phone_number.length)
    return answer
}