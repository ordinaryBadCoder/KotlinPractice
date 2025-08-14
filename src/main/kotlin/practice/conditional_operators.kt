package org.example.practice

fun main() {

    val userAge = readln().toInt()

    val resultText = if (userAge >= AGE_OF_MAJORITY) {
        "Show special content"
    } else if (userAge == 16 || userAge == 17){
        "Show limited content"
    } else {
        "Back"
    }
     println(resultText)

    val consoleNumber = when (userAge) {
        10 -> {
            println("Additional action")
            "Your number 10"
        }
        20 -> "Your number 20"
        42 -> "Your number 42"
        else -> "Another number"
    }
    println(consoleNumber)

}