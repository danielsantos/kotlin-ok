package com.example.demo

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)
    val name = scanner.nextLine()
    val partsOfName = name.split(" ")

    print("${partsOfName[0][0]}. ${partsOfName[1]}, ${partsOfName[2]} years old")

}