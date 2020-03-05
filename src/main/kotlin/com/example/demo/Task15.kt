package com.example.demo

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val age = scanner.nextInt()
    val range = 18..59
    println(age in range)
}