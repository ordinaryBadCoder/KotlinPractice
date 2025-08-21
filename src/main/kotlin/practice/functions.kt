package org.example.practice

fun main() {
    printNameAndAge(userAge = getAge(), userName = getName())
}

//Функции без параметров
fun getName(): String? {
    println("Введите имя:")
    return readLine()
}

fun getAge(): Int? {
    println("Введите возраст:")
    return readLine()?.toInt()
}

//Функции бкз аврвметров в упрощенном виде
//fun getName() = readLine()
//fun getAge() = readLine()?.toInt()

//Функции с параметрами
fun printNameAndAge(userName: String?, userAge: Int?) {
    println("Данные пользователя: $userName, $userAge лет")
}


