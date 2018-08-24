package com.example.samerjameel95.tictactoy

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buSelect(view: View){
        val buChoice = view as Button
        var CellID = 0
        when(buChoice.id){
            R.id.bu1-> CellID=1
            R.id.bu2-> CellID=2
            R.id.bu3-> CellID=3
            R.id.bu4-> CellID=4
            R.id.bu5-> CellID=5
            R.id.bu6-> CellID=6
            R.id.bu7-> CellID=7
            R.id.bu8-> CellID=8
            R.id.bu9-> CellID=9
        }
        Log.d("CellID: ",CellID.toString())
        PlayGame(CellID,buChoice)
    }

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var activePlayer = 1

    fun PlayGame(CellID:Int,buChoice:Button){
        if (activePlayer==1){
            buChoice.text="X"
            buChoice.setTextSize(40F)
            player1.add(CellID)
            activePlayer=2
        }else{
            buChoice.text="O"
            buChoice.setTextSize(40F)
            player2.add(CellID)
            activePlayer=1
        }
        buChoice.isEnabled = false
        winnerCheck()
    }

    fun winnerCheck(){
        var winner=-1
        if(player1.contains(1) && player1.contains(2) && player1.contains(3)){
            winner=1
        }
        if(player2.contains(1) && player2.contains(2) && player2.contains(3)){
            winner=2
        }
        if(player1.contains(4) && player1.contains(5) && player1.contains(6)){
            winner=1
        }
        if(player2.contains(4) && player2.contains(5) && player2.contains(6)){
            winner=2
        }
        if(player1.contains(7) && player1.contains(8) && player1.contains(9)){
            winner=1
        }
        if(player2.contains(7) && player2.contains(8) && player2.contains(9)){
            winner=2
        }
        if(player1.contains(1) && player1.contains(4) && player1.contains(7)){
            winner=1
        }
        if(player2.contains(1) && player2.contains(4) && player2.contains(7)){
            winner=2
        }
        if(player1.contains(2) && player1.contains(5) && player1.contains(8)){
            winner=1
        }
        if(player2.contains(2) && player2.contains(5) && player2.contains(8)){
            winner=2
        }
        if(player1.contains(3) && player1.contains(6) && player1.contains(9)){
            winner=1
        }
        if(player2.contains(3) && player2.contains(6) && player2.contains(9)){
            winner=2
        }
        if(winner!=-1){
           if(winner==1){
               Toast.makeText(this,"Player 'X' Win the game",Toast.LENGTH_LONG).show()
           }
           else{
               Toast.makeText(this,"Player 'O' Win the game",Toast.LENGTH_LONG).show()
           }
           }

    }
}
