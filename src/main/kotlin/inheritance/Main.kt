package org.example.inheritance

fun main() {

    val ship1 = Spaceship("ship1", 500)
    ship1.runDiagnostics()
    ship1.switchToWarpMode()
    println()

    val scout1 = Scout("scout1", 750, 100, 1000)
    scout1.runDiagnostics()
    scout1.switchToWarpMode()
    scout1.runAfterburner()
    scout1.handleDataFromRadar()
    println(scout1.unmanned)
    println()

    val industrial1 = Industrial("industrial1", 250, 8)
    industrial1.runDiagnostics()
    industrial1.switchToWarpMode()
    industrial1.launchScanningDrones()
    println(industrial1.unmanned)

    val spaceShuttleUpsilon = Upsilon(500)
    spaceShuttleUpsilon.runDiagnostics()
    spaceShuttleUpsilon.startEngine()
    spaceShuttleUpsilon.prepareForLanding()
    spaceShuttleUpsilon.prepareForTakeoff()

}