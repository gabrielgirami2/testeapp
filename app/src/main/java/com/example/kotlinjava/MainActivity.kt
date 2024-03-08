package com.example.kotlinjava


import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button

import android.view.View

import com.example.kotlinjava.databinding.ActivityMainBinding



class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var buttonChange = findViewById<Button>(R.id.button_teste)
        var result = "teste"
        buttonChange.setOnClickListener{ view : View? ->

            var navegar = Intent( this, ResultadoActivity::class.java)
            startActivity(navegar)

        }
    }
}


