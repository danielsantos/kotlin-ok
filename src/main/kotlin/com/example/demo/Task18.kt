package com.example.demo

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    when (n) {
        in 0..9 -> print(1)
        in 10..99 -> print(2)
        in 100..999 -> print(3)
        else -> println(4)
    }
}
