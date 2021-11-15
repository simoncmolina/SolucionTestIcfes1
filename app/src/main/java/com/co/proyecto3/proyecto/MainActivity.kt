package com.co.proyecto3.proyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    private var edtUserName : EditText? = null
    private var edtPassword : EditText? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtUserName = findViewById(R.id.edtUserName)
        edtPassword = findViewById(R.id.edtPassword)
    }

    fun onLogin(view: android.view.View) {var username: String = edtUserName!!.text.toString()
        var password: String = edtPassword!!.text.toString()
        if(username == "correo@correo" && password == "123"){
            val intento = Intent(this, PreguntasActivity::class.java)
            startActivity(intento)
        }

        else {
            val dialog = AlertDialog.Builder(this)
                .setTitle("ERROR!!")
                .setMessage("Invalid User Name or Password")
                .create()
                .show()

        }
    }

    fun onRegistro(view: android.view.View) {
        val intento = Intent(this, RegistroActivity::class.java)
        startActivity(intento)


    }
}