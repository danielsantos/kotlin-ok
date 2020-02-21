package com.example.demo

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()

    if (num.toInt() % 2 == 0)
        println("Divided by 2")
    if (num.toInt() % 3 == 0)
        println("Divided by 3")
    if (num.toInt() % 5 == 0)
        println("Divided by 5")
    if (num.toInt() % 6 == 0)
        println("Divided by 6")

}