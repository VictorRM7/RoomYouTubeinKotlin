package com.example.roomyoutubeinkotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room

class MainActivity : AppCompatActivity() {

    /*private val etNombre: EditText? = null
    private val etUsuario:EditText? = null
    private val etPassword:EditText? = null
    private val etConsulta:EditText? = null
    private val btnGuardar:Button? = null
    private val btmMostrar:Button? = null*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val etNombre:EditText = findViewById(R.id.etNombre)
        val etUsuario:EditText = findViewById(R.id.etUsuario)
        val etPassword:EditText = findViewById(R.id.etPassword)
        val etConsulta:EditText = findViewById(R.id.etConsulta)
        val btmMostrar:Button = findViewById(R.id.btnMostrar)
        val btnGuardar:Button = findViewById(R.id.btnGuardar)




        btnGuardar.setOnClickListener {
            val db = Room.databaseBuilder(
                this@MainActivity,
                AppDataBase::class.java, "BaseDeDatosI"
            ).fallbackToDestructiveMigration().allowMainThreadQueries()
                .build() // ese name --> es el nombre de la base de datos.
            val usuarios = Usuarios(
                0,
                etNombre.text.toString(),
                etUsuario.text.toString(),
                etPassword.text.toString()
            )
            val reg = db.usuariosDao().insert(usuarios)
            Toast.makeText(applicationContext, "reg", Toast.LENGTH_LONG).show()
        }


        /*btnGuardar.setOnClickListener(View.OnClickListener {
            val db = Room.databaseBuilder(
                applicationContext,
                AppDataBase::class.java, "BaseDeDatosI"
            ).build()
            val usuarios = Usuarios( etNombre.text.toString().toInt(),  etUsuario.text.toString(),  etPassword.text.toString() )
            val reg: Long = db.usuariosDao().insert(usuarios)
            Toast.makeText(applicationContext, "reg", Toast.LENGTH_LONG).show()
        })*/


        btmMostrar.setOnClickListener(View.OnClickListener {
            val db = Room.databaseBuilder(
                applicationContext,
                AppDataBase::class.java, "BaseDeDatosI"
            ).allowMainThreadQueries().build()
            val lista: List<Usuarios> = db.usuariosDao().getAll()
            var valores = ""
            for (i in lista.indices) {
                valores += """${lista[i].id}: ${lista[i].nombreUsuario.toString()} usuario: ${lista[i].usuario.toString()} pass: ${lista[i].password.toString()}"""
            }
            etConsulta.setText(valores)
        })


        /*btnGuardar.setOnClickListener {

            val db = Room.databaseBuilder(
                applicationContext,
                AppDatabase::class.java, "BaseDeDatosI"
            ).build()
            val usuarios = Usuarios(
                etNombre.getText().toString(),
                etUsuario.getText().toString(),
                etPassword.getText().toString()
            )
            val reg: Long = db.usuariosDao().insert(usuarios)
            Toast.makeText(applicationContext, "reg", Toast.LENGTH_LONG).show()

        }*/


    }



}

