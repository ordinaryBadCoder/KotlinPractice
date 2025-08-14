package org.example.practice

fun main() {

    val a = 5
    val b = 7
    val c1 = 999
    val c2: Int

    val sum = a + b

    //println(sum)
    //println(10 / 3)

    // При делении целых чисел получаем целое число
    val intNum1: Int = 10
    val intNum2: Int = 3
    println(intNum1 / intNum2) // 3 - целое число

    // При инициализации дробного числа типа Float добавляем f в конце значения
    val floatNum1: Float = 10.0f
    val floatNum2: Float = 3.0f
    println(floatNum1 / floatNum2) // 3.3333333

    // При инициализации дробного числа типа Double делаем его дробным, добавив точку
    val doubleNum1: Double = 10.0
    val doubleNum2: Double = 3.0
    println(doubleNum1 / doubleNum2) // 3.3333333333333335

    // Несколько операций с разными приоритетами
    val complexExpression = (a + b) * 2 - 4 / 2
    println (complexExpression)

    // Для нахождения остатка от деления используется знак %
    println(10 % 3)

    // Конечный тип переменной при использовании двух разных типов
    //Одновременно целочисленный и дробный типы - результат вычислений будет всегда дробным
    val f = intNum1 + floatNum1
    println(f) // 20.0

    //Одновременно типы Float и Double, результат будет иметь тип Double
    val f1 = intNum1 + floatNum1 + doubleNum1
    println(f1::class.simpleName) // double

    //Инкремент, декремент
    var counter = 0

    counter = counter + 1

    counter += 1

    counter++

    counter -= 1
    counter--

    ++counter
    --counter

    //Сравнение
    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)
    println(a == b)
    println(a != b)

}