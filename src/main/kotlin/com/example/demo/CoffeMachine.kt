package com.example.demo

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Write how many cups of coffee you will need: ")
    val cups = scanner.nextInt()

    var water = 200 * cups
    var milk = 50 * cups
    var bean = 15 * cups

    println("For $cups cups of coffee you will need:")
    println("$water ml of water")
    println("$milk ml of milk")
    println("$bean g of coffee beans")
}