package org.example.polymorphism

import java.util.Date
//В общем и целом, полиморфизм - это когда у тебя есть большая коробочка (родительский класс)
// а в нем куча одинаковых коробочек (дочерних классов), но у них
// крышечки, например, разного цвета. По сути они одинаковые, эти коробочки,
// и цель у них одна - что-то хранить, но вот цвет крышечек различается.

open class NotesAppItem {

    open fun getItemData() = ""

    class MessageItem (
        private val title: String,
        private val creationDate: Date,
        private val type: String,
        private val data: String,
    ): NotesAppItem() {
        override fun getItemData(): String {
            return "Item \"$title\" added to cell – $creationDate\nType: $type\nData: $data\n"
        }
    }

    class PhoneItem(
        private val title: String,
        private val creationDate: Date,
        private val type: String,
        private val data: Long,
    ): NotesAppItem() {

        override fun getItemData(): String {
            return "Item \"$title\" added to cell – $creationDate\nType: $type\nData: $data\n"
        }
    }

    class ToDoListItem(
        private val title: String,
        private val creationDate: Date,
        private val type: String,
        private val data: List<String>,
    ): NotesAppItem() {
        override fun getItemData(): String{
            return "Item \"$title\" added to cell – $creationDate\nType: $type\nData: $data\n"
        }
    }
}

