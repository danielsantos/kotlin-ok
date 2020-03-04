package com.example.demo

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Write how many ml of water the coffee machine has: ")
    val amountWater = scanner.nextInt()

    print("Write how many ml of milk the coffee machine has: ")
    val amountMilk = scanner.nextInt()

    print("Write how many grams of coffee beans the coffee machine has: ")
    val amountBeans = scanner.nextInt()

    print("Write how many cups of coffee you will need: ")
    val cups = scanner.nextInt()

    var waterNecessary = 200 * cups
    var milkNecessary  = 50 * cups
    var beanNecessary  = 15 * cups

    if ( amountWater == waterNecessary &&
         amountMilk == milkNecessary &&
         amountBeans == beanNecessary ) {
        println("Yes, I can make that amount of coffee")
    } else {

        var cupsForWater = amountWater / 200;
        var cupsForMilk  = amountMilk   / 50;
        var cupsForBeans = amountBeans  / 15;

        var minorAmountCupsMade = 0;

        if (cupsForWater <= cupsForMilk && cupsForWater <= cupsForBeans) {
            minorAmountCupsMade = cupsForWater
        } else if (cupsForMilk <= cupsForWater && cupsForMilk <= cupsForBeans) {
            minorAmountCupsMade = cupsForMilk
        } else {
            minorAmountCupsMade = cupsForBeans
        }

        if ( cups > minorAmountCupsMade ) {

            //var makeOnlyCups = cups - minorAmountCupsMade
            println("No, I can make only $minorAmountCupsMade cups of coffee")

        } else {

            var cupsBeyond = minorAmountCupsMade - cups;
            println("Yes, I can make that amount of coffee (and even $cupsBeyond more than that)")

        }

    }

}