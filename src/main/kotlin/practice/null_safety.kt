package org.example.practice

fun main() {

    val nullableString: String? = null
    val nonNullableString: String = "some string"

    println(nullableString?.length)
    println(nonNullableString.length)


    if (nullableString != null) {
        println(nullableString.length)
    } else {
        println("Переменная хранит null")
    }

    //val length: Int = nullableString?.length ?: 0

    val someString: String = readLine() ?: ""


    val length: Int = nullableString!!.length
}