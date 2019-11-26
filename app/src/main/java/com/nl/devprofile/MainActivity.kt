package com.nl.devprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun main(args: Array<String>) {

        val str  = "Six big devils from Japan quickly forgot how to waltz"
        val alphabet = "abcdefghijklmnopqrstuvwxyz"

        if (str >= alphabet) {
            println("The sentence is pangram")
        } else {
            println("The sentence is not a pangram")
        }

    }
}
