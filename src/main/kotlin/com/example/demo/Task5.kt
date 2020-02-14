package com.example.demo

fun main() {

    // show if the first number is between the others two
    // 14 7 25 = true

    var numbers = readLine()!!.split(" ")

    if (numbers[0].toInt() >= numbers[1].toInt() && numbers[0].toInt() <= numbers[2].toInt()) {
        print(true)
    } else if (numbers[0].toInt() <= numbers[1].toInt() && numbers[0].toInt() >= numbers[2].toInt()) {
        print(true)
    } else {
        print(false)
    }

}