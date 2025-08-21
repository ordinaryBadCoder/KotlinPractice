package org.example.polymorphism

import java.util.Date

class NotesAppItem {

        fun addItemToCell(
            title: String,
            creationDate: Date,
            type: String,
            data: String
        ) {

            println("Item \"$title\" added to cell – $creationDate\nType: $type\nData: $data\n")
        }

        fun addItemToCell(
            title: String,
            creationDate: Date,
            type: String,
            data: Long,
        ) {
            println("Item \"$title\" added to cell – $creationDate\nType: $type\nData: $data\n")
        }

        fun addItemToCell(
            title: String,
            creationDate: Date,
            type: String,
            data: List<String>,
        ) {
            println("Item \"$title\" added to cell – $creationDate\nType: $type\nData: $data\n")
        }
    }

