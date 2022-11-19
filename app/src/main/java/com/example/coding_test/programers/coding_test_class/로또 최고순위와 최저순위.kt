package com.example.coding_test.programers.coding_test_class

fun main() {
    print(solution(intArrayOf(44, 1, 0, 0, 31, 25), intArrayOf(31, 10, 45, 1, 6, 19)))
}

fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
    val array = arrayListOf<Int>()
    val rank = intArrayOf(6, 6, 5, 4, 3, 2, 1)
    val temp = lottos.filter { win_nums.contains(it) }.toList().size
    val zero_cnt = lottos.filter { it == 0 }.toList().size
    array.add(rank[temp + zero_cnt])
    array.add(rank[temp])
    return array.toIntArray()
}