package org.example.practice

const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65

fun main() {

    //Операторы сравнения
    val userAge = 15
    var comparisonResult: Boolean = userAge >= AGE_OF_MAJORITY

    println("User age verification result: $comparisonResult")

    println(0 < -1) // false
    println(1 == 1) // true
    println(2 == 3) // false
    println(7 != 8) // true

    //Логические операторы
    comparisonResult = userAge >= AGE_OF_MAJORITY && userAge <= RETIREMENT_AGE

    comparisonResult = (userAge >= AGE_OF_MAJORITY) and (userAge <= RETIREMENT_AGE)

    comparisonResult = (userAge >= AGE_OF_MAJORITY) || (userAge <= RETIREMENT_AGE)

    val a = true
    val b = !a
    println(b)

    comparisonResult = (userAge >= AGE_OF_MAJORITY) && !(userAge >= RETIREMENT_AGE)

    comparisonResult = userAge in AGE_OF_MAJORITY..RETIREMENT_AGE

    comparisonResult = userAge !in AGE_OF_MAJORITY..RETIREMENT_AGE

    println("User age verification result: $comparisonResult")
}