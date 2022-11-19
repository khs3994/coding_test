package com.example.coding_test.programers.level1

fun main() {
    print(
        solution(
            intArrayOf(1, 5, 2, 6, 3, 7, 4),
            arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))
        )
    )
}

fun solution(array: IntArray, commands: Array<IntArray>): IntArray =
    commands.map { array.sliceArray(it[0] - 1 until it[1]).apply { sort() }[it[2] - 1] }
        .toIntArray()