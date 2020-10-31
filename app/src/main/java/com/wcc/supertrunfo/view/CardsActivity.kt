package com.wcc.supertrunfo.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wcc.supertrunfo.ChooseCriteriaActivity
import com.wcc.supertrunfo.R
import com.wcc.supertrunfo.entities.Player
import com.wcc.supertrunfo.presenters.CardsPresenter
import kotlinx.android.synthetic.main.activity_cards.*

class CardsActivity : AppCompatActivity() {
    private val presenter = CardsPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cards)

        val playerOneName = intent.getStringExtra("player_one") ?: "Player One"
        val playerTwoName = intent.getStringExtra("player_two") ?: "Player Two"
        val newPlayerOne = Player("Louise")
        newPlayerOne.isWinner = true


        cardPlayerOneLabel.text = "Card $playerOneName"
        cardPlayerTwoLabel.text = "Card $playerTwoName"

        cardPlayerOneVelocity.text = "Máx velocity: $cardOneMaxVelocity"
        cardPlayerTwoVelocity.text = "Máx velocity: $cardTwoMaxVelocity"

        cardPlayerOneAccelerationTime.text = "Acceleration time: $accelerationTimeCardOne"
        cardPlayerTwoAccelerationTime.text = "Acceleration time: $accelerationTimeCardTwo"

        cardPlayerOnePassengers.text = "Passengers: $passengersCardOne"
        cardPlayerTwoPassengers.text = "Passengers: $passengersCardTwo"

        cardPlayerOneXP.text = "XP: $xPCardOne"
        cardPlayerTwoXP.text = "XP: $xPCardTwo"

        chooseCriteriaButton.setOnClickListener {
            val intent = Intent(this, ChooseCriteriaActivity::class.java)
            intent.putExtra("player_one", playerOneName)
            intent.putExtra("player_two", playerTwoName)
            startActivity(intent)
        }
    }
}