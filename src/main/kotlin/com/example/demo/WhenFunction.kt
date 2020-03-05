package com.example.demo

import java.util.Scanner

fun main(args: Array<String>){
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val op = scanner.next()
    val b = scanner.nextInt()

    when (op) {
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println(a * b)
        else -> println("Unknown operator")
    }
}