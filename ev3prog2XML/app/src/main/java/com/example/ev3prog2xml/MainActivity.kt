package com.example.ev3prog2xml

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity



class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvGoRegistro = findViewById<Button>(R.id.tv_go_to_registro)
        tvGoRegistro.setOnClickListener{
            goToRegistro()

        }
    }
    private fun goToRegistro (){
        val  i = Intent(this, RegistroActivity::class.java)
        startActivity(i)
    }

}
