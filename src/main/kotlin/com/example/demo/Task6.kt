package com.example.demo

fun main() {

    var av1 = 8;
    var av2 = 5;

    var max = if ( av1 > av2 ) {
        println("av1 is bigger")
        av1
    } else {
        println("av2 is bigger")
        av2
    }

    println(max)

}