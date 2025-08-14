package org.example.practice

fun main() {

    val greeting = "Hello"
    val space = ' '
    val userName = "Alina"

    // Конкатенация - сложение нескольких строк
    println(greeting + ", " + userName + "!" + space + "What is your main question?")

    //Интерполяция - использование строковых шаблонов
    println("$greeting, $userName! What is your main question?")

    //Строковый шаблон с выражением
    println("To which you can respond ${40 + 2}")

    //Многострочный текст
    val multiString =  """
                    ewuriw
          rewrqwe
              jkj ;lk
        """.trimIndent()
    println(multiString)

    //Многострочный текст, выравнивание по левому краю
    val multiStringMargin =  """
                    |ewuriw
          |rewrqwe
              |jkj ;lk
        """.trimMargin()
    println(multiStringMargin)

    //Экранирование
    val phrase = "And he said - \"it is magnificent!\""
    println(phrase)

}