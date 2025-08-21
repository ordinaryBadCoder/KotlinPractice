package org.example.practice

import java.util.Calendar

fun main() {
    //Анонимные функции
    val calendar: Calendar = Calendar.getInstance()

    val getDaysToEndYear: () -> Int =
        fun() = 365 - calendar[Calendar.DAY_OF_YEAR]

    println(getDaysToEndYear.invoke())

    val convertEndDaysToMills: (Int) -> Unit =
    fun(endDays: Int) = println(1000 * 60 * 60 * 24 * endDays)
    convertEndDaysToMills(getDaysToEndYear())

//лямбда
    val printStringWithLambda: (Int) -> String

    printStringWithLambda = { it: Int ->
        "print string with lambda $it"
    }

    println(printStringWithLambda(42));

// короткая запись
    println({ it: Int->"print string with lambda $it" }.invoke(442))

// конвертация дней в миллисекунды
    val convertLambda = { endDays: Int ->
        println("Convert from lambda: ${1000 * 60 * 60 * 24 * endDays}")
    }

    convertLambda(getDaysToEndYear())

}