package org.example.classes_entity_objects
//класс Блюда
class Dish (
    //Свойства для объекта класса
    val id: Int,
    val name: String,
    var category: String,
    val ingredients: List<String>,
    var inFavorites: Boolean = false

) {
    //функция добавления в избранное
    fun addToFavorites(){
        println("Блюдо $name добавлено в избранное")
        inFavorites = true
    }

    //Функция удаления из избранного
    fun removeFromFavorites(){
        println("Блюдо $name удалено из избранного")
        inFavorites = false
    }

    //Функция начала готовки
    fun startCooking(){
        println("Пользователь перешел на экран начала приготовления блюда $name")
    }

    //Функция скачивания ингридиентов, формирование списка покупок
    fun downloadIngredients(): List<String>{
        return ingredients
    }

}