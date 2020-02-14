package com.example.demo

fun main() {

    // show if this numbers on asc or desc order... 44 21 9 = true
    // show if this numbers on asc or desc order... 7 41 97 = true
    // show if this numbers on asc or desc order... 17 2 35 = false

    var ages = readLine()!!
    var agesSplit = ages.split(" ")
    var desc = false
    var asc = false
    for (i in 0 until agesSplit.size) {
        if (i != 0) {
            if (agesSplit[i.minus(1)] >= agesSplit[i]) {
                desc = true
            } else {
                desc = false
                break
            }
        }
    }
    for (i in 0 until agesSplit.size) {
        if (i != 0) {
            if (agesSplit[i.minus(1)] <= agesSplit[i]) {
                asc = true
            } else {
                asc = false
                break
            }
        }
    }
    print(desc || asc)

}