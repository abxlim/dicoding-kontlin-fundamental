package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    return if (string.length % 2 == 0)
        string.substring(string.length / 2 - 1, string.length / 2 + 1)
    else
        string.substring(string.length / 2, string.length / 2 + 1)
}