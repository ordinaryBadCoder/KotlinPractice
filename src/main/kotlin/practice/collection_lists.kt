package org.example.practice

fun main() {

    //Целочисленный список
    val list = listOf(4, 4, 2)

    val list1: List<Int> = listOf(4, 4, 2)

    //Лист с возможностью добавления и удаления элементов
    val list3: MutableList<Int> = mutableListOf(1, 2, 3)

    val mutableList = mutableListOf(11, 15, 20, 12, 9, 14)
    println(mutableList)

    //Функция add с одним параметром
    mutableList.add(42)
    //println(mutableList)

    //Функция add с двумя параметрами, указание места
    mutableList.add(0,45)
    println(mutableList)

    //Наличие элемента в списке
    println(mutableList.contains(42))

    //Проверка списка: пустой или нет
    println(mutableList.isEmpty())
    println(mutableList.isNotEmpty())

    //Узнать индекс элемента
    println(mutableList.indexOf(45))

    //Последний индекс встречающегося элемента
    println(mutableList.lastIndexOf(45))

   //Сортировка по возрастанию
    mutableList.sort()
    println(mutableList)

    //Сортировка по убыванию
    mutableList.sortDescending()
    println(mutableList)

    //Изменение порядка элементов на обратный
    mutableList.reverse()
    println(mutableList)

   // Вывод каждого элемента по отдельности
    mutableList.forEach {
        println(it)
    }

    //Фильтрация списка
    val mutableList2 = mutableList.filter{
        it == 42
    }
    mutableList2.forEach{
        println(it)
    }

    //Функция map() для работы со всеми элементами сразу
    val mutableList3 = mutableList2.map{
        it * 2
    }
    println(mutableList3)

}
