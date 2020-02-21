package com.example.demo

import java.util.Scanner

fun main() {

    // Show de biggest number on two

    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    if (a > b || a == b)
        print(a)
    if (b > a)
        print(b)
}