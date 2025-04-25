package com.dicoding.exam.exam3

// TODO
fun <T> checkType(args: T): String {
    val dataType: String

    if (args is Int) {
        dataType = "Integer"
    }
    else if (args is String) {
        dataType = "String"
    }
    else if (args is Boolean) {
        dataType = "Boolean"
    }
    else if (args is Double) {
        dataType = "Double"
    }
    else if (args is List <*>) {
        dataType = "List"
    }
    else if (args is Map <*, *>) {
        dataType = "Map"
    }
    else {
        dataType = "Unknown Type"
    }
    return "Yes! it's $dataType"
}