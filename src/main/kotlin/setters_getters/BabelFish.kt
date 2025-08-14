package org.example.setters_getters

class BabelFish (
    private val coefficient: Int?
){
    var isTranslated: Boolean = false

    var nerveSignalLevel: Int = 200
        get() = if (coefficient != null) field * coefficient else field
        set(value: Int) {
            field = value
            if (value > 300) {
                isTranslated = true
                println("isTranslated = true")
            }
        }
}