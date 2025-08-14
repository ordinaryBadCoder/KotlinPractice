package org.example.practice

fun main() {

    var counter = 5

    //Цикл while
    while (counter > 0) {
        println("Advertising will end in ${counter--}")
        Thread.sleep(1000)
    }

    //Цикл do-while
    do {
        println("Advertising will end in ${counter--}")
        Thread.sleep(1000)
    } while (counter > 0)

}