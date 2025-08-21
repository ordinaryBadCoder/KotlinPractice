package org.example.inheritance

//Корабли класса Скаут
class Scout(
    name: String,
    speed: Int,
    val radarRange: Int,
    val afterburnerSpeed: Int
): Spaceship(name,speed){

    //Функция обработки данных с радара
    fun handleDataFromRadar(){
        println("$name: обработка данных с радара")
    }

    //Функция запуска форсажа
    fun runAfterburner(){
        println("$name: Форсаж запущен")
    }
}