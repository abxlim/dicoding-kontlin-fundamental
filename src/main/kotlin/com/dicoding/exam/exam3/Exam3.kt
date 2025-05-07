package com.dicoding.exam.exam3

// TODO
fun <T> checkType(args: T): String {
    val dataType : String = when (args) {
        is Int -> "Integer"
        is String -> "String"
        is Boolean -> "Boolean"
        is Double -> "Double"
        is List <*> -> "List"
        is Map <*, *> -> "Map"
        else -> "Unknown Type"
    }

    return "Yes! it's $dataType"
}