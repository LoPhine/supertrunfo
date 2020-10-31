package com.wcc.supertrunfo.interactions

import com.wcc.supertrunfo.data.SuperTrunfoDatabase


class CardsInteractor {
    private val database = SuperTrunfoDatabase()
        val cardOne: Card = generateCard()
        val cardTwo: Card =  generateCard()

     private fun generateCard(): Card {
        val driver = database.getAllDrivers().random()
        val vehicle = database.getAllVehicles().random()

        return Card(vehicle, driver)

    }
}