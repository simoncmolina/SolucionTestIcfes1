package com.co.proyecto3.proyecto

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class RegistroActivity : AppCompatActivity(){
    private var editNombre : EditText? = null
    private var editApellido: EditText? = null
    private var editEmail : EditText? = null
    private var editContraseña: EditText? = null
    private var editTelefono: EditText? = null
    var  check1 : CheckBox? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        editNombre = findViewById(R.id.editNombre)
        editApellido = findViewById(R.id.editApellido)
        editEmail = findViewById(R.id.editEmail)
        editContraseña = findViewById(R.id.editContraseña)
        editTelefono = findViewById(R.id.editTelefono)
        check1 = findViewById(R.id.checkBox2)
        }

    fun onEnviar(view: android.view.View) {
        var nombre: String = editNombre!!.text.toString()
        var apellido: String = editApellido!!.text.toString()
        var correo: String = editEmail!!.text.toString()
        var contra: String = editContraseña!!.text.toString()
        var telefono: String = editTelefono!!.text.toString()
        val opcion1 = check1?.isChecked

        if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || correo.isEmpty() || contra.isEmpty() || telefono.isEmpty() && opcion1==false) {

            val positiveButton = {dialog:DialogInterface, which:Int-> }

            val dialog = AlertDialog.Builder(this)
                .setTitle("ERROR!!")
                .setMessage("Los campos no pueden estar vacios")
                .setPositiveButton("OK", positiveButton)
                dialog.create()
                    dialog.show()

        }
            else {
                val intento = Intent(this, PreguntasActivity::class.java)
                startActivity(intento)

            }

        }

    fun onTerminos(view: android.view.View) {
        val positiveButton = {dialog:DialogInterface, which:Int-> }


        val dialog = AlertDialog.Builder(this)
            .setTitle("Terminos y Condiciones")
            .setMessage("El usuario de la aplicación entiende y acepta que, no obstante, es operada por nosotros, la información contenida en la misma será la referente a su vínculo comercial o contractual con la compañía, por tanto, las funcionalidades ofrecidas por la aplicación serán entregadas por cada compañía de acuerdo con su vinculación. En la aplicación se pondrá a disposición del CLIENTE información y/o permitirá la realización de las transacciones determinadas o habilitadas para cada producto en particular. Nosotros podremos adicionar, modificar o eliminar las funcionalidades en cualquier momento, lo cual acepta el usuario mediante la instalación de la aplicación. En todo caso, al momento de realizar dichas modificaciones se notificarán al usuario a través de la misma aplicación móvil una vez inicie sesión. Los tiempos de respuesta, tramites y demás solicitudes efectuadas por el usuario mediante la aplicación serán procesadas de conformidad con las especificaciones de cada producto activo.                    El usuario acepta y autoriza que los registros electrónicos de las actividades mencionadas, que realice en la aplicación constituyen plena prueba de los mismos." )
            .setPositiveButton("OK", positiveButton)
            dialog.create()
            dialog.show()
    }

}









