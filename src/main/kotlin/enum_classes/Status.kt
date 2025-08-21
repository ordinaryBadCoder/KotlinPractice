package org.example.enum_classes

enum class Status (val ID: Int){
    NEW(101) {
        override fun getStatusDescription(): String {
            return "Заказ создан и ожидает оплаты"
        }
    },
    COOKING(102) {
        override fun getStatusDescription(): String {
            return "Заказ оплачен и начал готовиться"
        }
    },
    COMPLETED(103) {
        override fun getStatusDescription(): String {
            return "Заказ готов, можете забирать"
        }
    },
    ERROR(0) {
        override fun getStatusDescription(): String {
            return "Что-то пошло не так, мы уже разбираемся"
        }
    };

    abstract fun getStatusDescription(): String
}
