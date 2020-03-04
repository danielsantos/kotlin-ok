package com.example.demo

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val A = scanner.nextInt()
    val B = scanner.nextInt()
    val C = scanner.nextInt()

    if (A > B && A > C) {
        print(A)
    } else if (B > A && B > C) {
        print(B)
    } else {
        print(C)
    }
}