package com.example.demo

import java.util.Scanner

fun isVowel(letter: Char): Boolean {
    val charsUpper = charArrayOf('A', 'E', 'I', 'O', 'U')
    val charsLower = charArrayOf('a', 'e', 'i', 'o', 'u')
    charsUpper.forEach { char ->
        if (char == letter)
            return true
    }
    charsLower.forEach { char ->
        if (char == letter)
            return true
    }
    return false
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}