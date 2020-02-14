package com.example.demo

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var name = scanner.nextLine()
    var position = scanner.nextInt()
    var result = name[position.minus(1)]

    println("Symbol # $position of the string \"$name\" is '$result'")
}