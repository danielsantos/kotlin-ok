package com.example.demo

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val A = scanner.nextInt()
    val B = scanner.nextInt()
    val C = scanner.nextInt()

    if (A+B > C || A+C > B || B+C > A)
        print("YES")
    else
        print("NO")
}