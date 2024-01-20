package com.example.ev3prog2xml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity

class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val tvGoSolicitar = findViewById<Button>(R.id.tv_go_to_Solicitar)
        tvGoSolicitar.setOnClickListener{
            goToSolicitar()

            val tvGoToCamara = findViewById<Button>(R.id.tv_go_to_camara)
            tvGoToCamara.setOnClickListener{
                goToCamara()
            }

        }
    }
    private fun goToSolicitar(){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }

    private fun goToCamara(){
    val i = Intent(this, CamaraActivity::class.java)
    startActivity(i)
    }
}