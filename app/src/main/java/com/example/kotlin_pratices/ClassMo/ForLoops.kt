package com.example.kotlin_pratices.ClassMo

fun main() {
    var num =10
    for ( i in 1..10){
        println("number is ${num++}")
    }
var num1 =1
    for(i in 10 downTo 1){
        println("number is ${num1++}")

    }

    var num2 =30
    for(i in 1 .. 10 step 2){
        println("number is ${num2++}")

    }

    var num3 = 70
    for (i in 1 until 10){
        println("number is ${num3++}")

    }
}