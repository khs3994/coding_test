package com.example.coding_test.baekjoon.기본수학2

fun main() {
    val min = readLine()!!.toInt()
    val max = readLine()!!.toInt()
    var mArr = arrayListOf<Int>()
    val arr = Array(10000) { true }
    arr[0] = false
    arr[1] = false
    for (i in 2 until 101)
        if (arr[i])
            for (j in i + i until 10000 step i)
                arr[j] = false
    arr.forEachIndexed { index, b ->
        if (b)
            mArr.add(index)
    }
    mArr = mArr.filter { it in min..max } as ArrayList<Int>
    println(if (mArr.sum() == 0) -1 else "${mArr.sum()}\n${mArr.minOrNull()}")
}