package org.example.setters_getters

fun main() {

    val fish = BabelFish(null)

    println("old value: ${fish.nerveSignalLevel}")

    val fish2 = BabelFish(2)
    println("old value: ${fish2.nerveSignalLevel}")

    val fish3 = BabelFish(21)
    println("old value: ${fish3.nerveSignalLevel}")

}