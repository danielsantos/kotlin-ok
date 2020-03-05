package com.example.demo

import java.util.Scanner

fun isGreater(number1: Int, number2: Int, number3: Int, number4: Int): Boolean {
    val firstArg = number1 + number2
    val secondArg = number3 + number4
    return firstArg > secondArg
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number1 = scanner.nextInt()
    val number2 = scanner.nextInt()
    val number3 = scanner.nextInt()
    val number4 = scanner.nextInt()

    println(isGreater(number1, number2, number3, number4))
}