package org.example.enum_classes

fun main() {

    //Получить названия статусов
    println(Status.NEW.name)
    //Получить порядковый номер константы
    println(Status.COOKING.ordinal)
    //Вывести массив всех enum
    for (i in Status.values()) println(i)


    println(Status.NEW.getStatusDescription())
    println(Status.COOKING.getStatusDescription())
    println(Status.COMPLETED.getStatusDescription())

    TODO("oops! :)")

}