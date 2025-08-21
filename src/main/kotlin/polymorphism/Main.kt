package org.example.polymorphism

import java.util.Date

fun main() {

    //ad hoc - полиморфизм по случаю

    val creationDate = Date()
    val notes = NotesAppItem()

    //Заметка № 1
    notes.addItemToCell(
        "call sister",
        creationDate,
        "message",
        "call sister to congratulate"
    )
    println()

    //Заметка № 2, добавляем новый номер телефона
    notes.addItemToCell(
        "phone number my sister",
        creationDate,
        "phone",
        89085634511
    )
    println()

    //Заметка № 3, список дел
    notes.addItemToCell(
        "my todo list",
        creationDate,
        "todo",
        listOf("wash dog", "clean the room", "buy new shoes")
    )
}