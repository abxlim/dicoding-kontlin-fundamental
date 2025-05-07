package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    return number.toString().map { it.digitToInt() }.let { it.min() + it.max() }
}
