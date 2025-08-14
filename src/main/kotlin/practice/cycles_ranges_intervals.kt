package org.example.practice

fun main() {

    //Диапазоны, интервалы
    val range1: IntRange = 42..442 // С помощью 2 точек
    val range2: IntRange = 42 until 442 // С помощью ключевого слова until

    val range3: LongRange = 42L..442L
    val range4: CharRange = 'a'..'z'
    val range5: ClosedRange<Double> = 42.1..442.1
    val range6: ClosedRange<Float> = 42.1f..442.1f

    val range7: IntProgression = 42..442 step 2

    val range8: IntProgression = 442 downTo 42 step 2


    //in, !in
    val a = 52 in range1
    val b = 52 !in range1
    println(a)
    println(b)

    //Цикл for
    for(i in 5 downTo 1){
        println("Advertising will end in $i")
        Thread.sleep(1000)
    }

    // Цикл for из диапазона
    for (i in range2 step 8){
        println(i)
    }

    // Имитация кнопки "Пропустить", break
    for (i in 5 downTo 1){
        if (i == 3) {
            println("Skip")
            break
        }
        println("Advertising will end in $i")
        Thread.sleep(1000)
    }
    println("message out cycles")

    // continue
    for (i in 5 downTo 1){
        if (i == 3) {
            println("i == 3, i not print")
            continue
        }
        println("Advertising will end in $i")
        Thread.sleep(1000)
    }
    println("message out cycles")

    // return
    for (i in 5 downTo 1){
        if (i == 3) {
            return
        }
        println("Advertising will end in $i")
        Thread.sleep(1000)
    }
    println("message out cycles")

}