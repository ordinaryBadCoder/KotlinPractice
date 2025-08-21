package org.example.inheritance
//Основной класс космических кораблей
open class Spaceship (
    val name: String,
    val speed: Int,
    val unmanned: Boolean = false
){
    //Фукнция перехода в варп-режим
    fun switchToWarpMode(){
        println("Переход в варп-режим")
    }

    //Основная функция диагностики
    open fun runDiagnostics(){
        println("Запущена диагностика системы корабля")
    }
}