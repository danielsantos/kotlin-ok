package com.example.demo

import java.util.Scanner

fun main() {

    val water = 1200
    val milk = 540
    val beans = 120
    val cups = 9
    val money = 550
    showAmounts(water, milk, beans, cups, money)
    println()

    val scanner = Scanner(System.`in`)

    print("Write action (buy, fill, take): ")
    val action = scanner.nextLine()

    when (action) {
        "buy" -> {
            buyAct(water, milk, beans, cups, money, scanner)
        }
        "fill" -> {
            fillAct(water, milk, beans, cups, money, scanner)
        }
        "take" -> {
            println("I gave you $money")
            println()
            showAmounts(water, milk, beans, cups, 0)
        }
        else -> 0
    }

}

fun buyAct(water: Int, milk: Int, beans: Int, cups: Int, money: Int, scanner: Scanner) {
    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
    val kindOfCoffee = scanner.nextInt()

    println()

    when (kindOfCoffee) {
        1 -> {
            showAmounts(water-250, milk, beans-16, cups-1, money + 4)
        }
        2 -> {
            showAmounts(water-350, milk-75, beans-20, cups-1, money + 7)
        }
        3 -> {
            showAmounts(water-200, milk-100, beans-12, cups-1, money + 6)
        }
        else -> 0
    }

}

fun fillAct(water: Int, milk: Int, beans: Int, cups: Int, money: Int, scanner: Scanner) {
    print("Write how many ml of water do you want to add: ")
    val addWater = scanner.nextInt()

    print("Write how many ml of milk do you want to add: ")
    val addMilk = scanner.nextInt()

    print("Write how many grams of coffee beans do you want to add: ")
    val addBeans = scanner.nextInt()

    print("Write how many disposable cups of coffee do you want to add: ")
    val addCups = scanner.nextInt()

    showAmounts(water+addWater, milk+addMilk, beans+addBeans, cups+addCups, money)
}

fun showAmounts(water: Int, milk: Int, beans: Int, cups: Int, money: Int) {
    println("The coffee machine has:")
    println("$water of water")
    println("$milk of milk")
    println("$beans of coffee beans")
    println("$cups of disposable cups")
    println("$money of money")
}