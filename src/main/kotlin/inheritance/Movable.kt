package org.example.inheritance

interface Movable {

    fun startEngine(){
        println("Двигатель запущен")
    }

    fun prepareForTakeoff()
    fun prepareForLanding()
}