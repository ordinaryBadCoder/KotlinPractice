package org.example.data_class

fun main() {
    val word = Word("Red","Красный")
    val word1 = Word("White","Белый")
    val word2 = Word("Red","Красный")
    val word3 = Word("Green", "Зеленый")

    //equals заменяется на ==
    println(word3 == word1)
    println(word == word2)

    //copy доступна только для дата классов
    val word4 = word3.copy(translate="Правильный перевод: Зеленый")
    println(word4)

    //hashCode работает быстрее чем equals
    println(word.hashCode())
    println(word2.hashCode())
}