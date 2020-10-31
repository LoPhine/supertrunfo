package com.wcc.supertrunfo.presenters

import com.wcc.supertrunfo.interactions.CardsInteractor
import kotlinx.android.synthetic.main.activity_choose_criteria.view.*

class CardsPresenter {
    private val interactor = CardsInteractor()
    val cardOne = interactor.cardOne
    val cardTwo = interactor.cardTwo

    fun getCardOneMAxVelocity(): Int {
        return cardOne.maxVelocity
    }

    fun getCardTwoMaxVelocity(): Int {
        return cardTwo.maxVelocity
    }

    fun getCardOneAccelerationTime(): Int {
        return cardOne.accelerationTime
    }

    fun getCardTwoAccelerationTime(): Int {
        return cardTwo.accelerationTime
    }

    fun getCardOnePassengers(): Int {
        return cardOne.passengers
    }
    fun getCardTwoPassengers(): Int {
        return cardTwo.passengers
    }

    fun getCardOneXp(): Int {
        return cardOne.xp
    }

    fun getCardTwoXp(): Int {
        return cardTwo.xp
    }
}