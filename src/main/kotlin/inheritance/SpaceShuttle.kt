package org.example.inheritance

abstract class SpaceShuttle() : Movable, Shootable {
    abstract val tankSize: Int
    abstract fun runDiagnostics()
}

class Upsilon(override val tankSize: Int) : SpaceShuttle(){
    override fun runDiagnostics() {
        println("Диагностика запущена")
    }

    override fun prepareForTakeoff() {
        println("Развернуть крылья")
    }

    override fun prepareForLanding() {
        println("Свернуть крылья")
    }

    override fun startShooting() {
        TODO("Not yet implemented")
    }

    override fun reloadGuns() {
        TODO("Not yet implemented")
    }

}