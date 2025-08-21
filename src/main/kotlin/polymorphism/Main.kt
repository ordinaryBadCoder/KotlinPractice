package org.example.polymorphism

import java.util.Date
import kotlin.math.round

fun main() {

    val creationDate = Date()

    //Заметка № 1
    val messageItem: NotesAppItem= NotesAppItem.MessageItem(
        "call sister",
        creationDate,
        "message",
        "call sister to congratulate",
    )

    //Заметка № 2 - добавляем номер телефона
    val phoneItem: NotesAppItem = NotesAppItem.PhoneItem(
        "sister's number",
        creationDate,
        "phone",
        89914424242,
    )

    //Заметка № 3 - список дел
    val toDoListItem: NotesAppItem = NotesAppItem.ToDoListItem(
        "todolist",
        creationDate,
        "list",
        listOf("wash dog", "do the cleaning", "buy new shoes"),
    )

//    //Вызываем методы
//    println(messageItem.getItemData())
//    println(phoneItem.getItemData())
//    println(toDoListItem.getItemData())

    val list = arrayOf<NotesAppItem>(messageItem, phoneItem, toDoListItem)

    fun showAllNotes(notes: Array<NotesAppItem>){
        notes.forEach {
            println(it.getItemData())
        }
    }

    showAllNotes(list)
}