package com.example.demo

fun main() {
    println("Hello Kotlin") // string
    println(1_000_000) // integer
    println('D') // character
    println()
    print("Hello World")
    println("On the same line")

    val language = "Portuguese"
    println(language)

    println()

    print("input your age: ")
    var age = readLine()!!
    println("Your Age: $age")

    println()

    val t = true
    val f = false
    println(t)
    println(f)
}