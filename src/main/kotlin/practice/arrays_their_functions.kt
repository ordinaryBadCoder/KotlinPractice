package org.example.practice

fun main() {

    val arrayOfIngredients: Array<String> = arrayOf("egg", "tomato", "green", "salt", "pepper")

    val intArray: Array<Int> = arrayOf(4, 4, 2)
    val charArray: Array<Char> = arrayOf('4', '4', '2')

    val intArray1: IntArray = intArrayOf(4, 4, 2)
    val charArray1: CharArray = charArrayOf('4', '4', '2')

   //Вызовет ошибку -  val intArray2 = arrayOf()

    //Нельзя перезаписать - val intArray3 = intArrayOf(1, 2, 3, 4, 5)

    var intArray3 = intArrayOf(1, 2, 3)
    intArray3 = intArrayOf(1, 2, 3, 4, 5)


    println("Size array Of Ingredients : ${arrayOfIngredients.size}")

    println(arrayOfIngredients.indexOf("tomato"))

    println(arrayOfIngredients[1])
    println(arrayOfIngredients[2])

    arrayOfIngredients[4] = "paprika"
    println(arrayOfIngredients[4])

    arrayOfIngredients.set(1, "капуста")
    arrayOfIngredients.get(1)

    for (i in arrayOfIngredients) {
        println(i)
    }

    for (i in arrayOfIngredients) {
        println("Ingredient ${arrayOfIngredients.indexOf(i) + 1}: $i")

    }


}
