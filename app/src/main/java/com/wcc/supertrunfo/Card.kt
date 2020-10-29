package com.wcc.supertrunfo

data class Card2 (
        val vehicle: Vehicle,
        val driver: Driver,
        val player: Player
) {
    val label: String = "Card ${player.name}"
    val maxVelocity = setMaxVelocity()
    val accelerationTime = setAccelerationTime()
    val passengers = serPassengers()

    //(currentVehiclePlayerOne["passengers"]?.toInt()
    //?: 0) * (1 + (currentDriverPlayerOne["defensiveDriving"]?.toInt() ?: 0))

    private fun serPassengers(): Int {
        return vehicle.passengers * (1 + driver.defensiveDriving)
    }

    private fun setAccelerationTime(): Int {
        TODO( "Not yet implemented")
    }

    private fun setMaxVelocity(): Int {
        return 0
    }
}