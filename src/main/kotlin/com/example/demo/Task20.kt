package com.example.demo

import java.math.BigInteger
import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextBigInteger()
    val op = scanner.next()
    val b = scanner.nextBigInteger()

    when (op) {
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println(a * b)
        "/" -> {
            if (b == BigInteger.ZERO) {
                println("Division by 0!")
            } else {
                println(a / b)
            }
        }
        else -> println("Unknown operator")
    }
}