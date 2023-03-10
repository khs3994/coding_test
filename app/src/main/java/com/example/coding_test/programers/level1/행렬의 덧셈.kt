package com.example.coding_test.programers.level1

fun main() {
    print(theAdditionOfaMatrix(arrayOf(intArrayOf(1, 2)), arrayOf(intArrayOf(2, 3))))
}

fun theAdditionOfaMatrix(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    var temp = mutableListOf<Int>()
    val answer = mutableListOf<IntArray>()

    arr1.forEachIndexed { index1, ints ->
        ints.forEachIndexed { index2, i ->
            temp.add(ints[index2] + arr2[index1][index2])
        }
        answer.add(temp.toIntArray())
        temp = mutableListOf()
    }

    return answer.toTypedArray()
}