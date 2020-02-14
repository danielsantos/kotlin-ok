package com.example.demo

fun main() {

    println("Operator: NOT !")

    val f = false // f is false
    val t = !f    // t is true

    println(f)
    println(t)

    println()

    println("Operator: AND &&")

    println(false && false) // false
    println(false && true) // false
    println(true && false) // false
    println(true && true)  // true

    println()

    println("Operator: OR ||")

    println(false || false) // false
    println(false || true)  // true
    println(true || false)  // true
    println(true || true)   // true

    println()

    println("Operator: XOR xor")
    // XOR return "true" when values are different

    println(false xor false) // false
    println(false xor true)  // true
    println(true xor false)  // true
    println(true xor true) // false

}