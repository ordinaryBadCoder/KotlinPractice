package org.example.classes_entity_objects

class Ingredient (var name: String, var weight: Int, var count: Int) {

    var isNeedToPrepare = false

    constructor(
        name: String,
        weight: Int,
        count: Int,
        _isNeedToPrepare: Boolean
    ) : this(name, weight, count) {

        isNeedToPrepare = _isNeedToPrepare

    }
    init {
        println("Ингредиент создан")
    }

}