package org.example.access_modifiers

fun main() {

    val guide = HitchhikersGuide()

    println(guide.getNumberOfPages())
    guide.getNumberOfPages()
    guide.setNumberOfPages(4200)
    println(guide.getNumberOfPages())
}