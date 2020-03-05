package com.example.demo

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val op = scanner.next()
    val b = scanner.nextInt()

    val result = when (op) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        else -> "Unknown operator"
    }
    println(result)
}