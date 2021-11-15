package com.co.proyecto3.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PreguntasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preguntas)
    }

    fun volver(view: android.view.View) {
        val intento = Intent(this, MainActivity::class.java)
        startActivity(intento)

    }
}