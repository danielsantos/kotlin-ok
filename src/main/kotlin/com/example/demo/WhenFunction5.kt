package com.example.demo

fun main() {
    val n = 10

    when (n) {
        in 1..22 -> print("Ok")
        11, 12 -> print("Ok")
        in 1..20 -> print("Ok")
        n + n -> print("Ok")
    }

}