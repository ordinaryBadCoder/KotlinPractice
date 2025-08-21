package org.example.inheritance

//Индустриальные корабли
class Industrial (
    name: String,
    speed: Int,
    val numberOfMiners: Int,
): Spaceship (name,speed,unmanned = true){

    //Запуск сканирующих дронов
    fun launchScanningDrones(){
        println("$name: запуск сканирующих дронов")
    }

    //Наследованная функция диагностики
    override fun runDiagnostics() {
        super.runDiagnostics()
        println("$name: Запущена диагностика дронов и майнеров"
        )
    }
}