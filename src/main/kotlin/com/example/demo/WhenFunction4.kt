package com.example.demo

import java.util.Scanner

fun main(args: Array<String>){
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    when {
        n == 0 -> println("n is zero")
        n in 100..200 -> println("n is between 100 and 200")
        n > 300 -> println("n is greater than 300")
        n < 0 -> println("n is negative")
        // else-branch is optional here
    }
}