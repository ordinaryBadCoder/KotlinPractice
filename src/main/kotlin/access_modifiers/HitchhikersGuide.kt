package org.example.access_modifiers

class HitchhikersGuide() {

    var title = "Don't panic"
    private var numberOfPages = 9999

    fun getNumberOfPages() = numberOfPages

    fun setNumberOfPages(number: Int) {
        numberOfPages = number
    }

    private fun chooseArticle(){
        println("Открыть каталог")
     }
}

