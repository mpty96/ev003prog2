package com.example.ev3prog2xml.data

import android.icu.text.DateFormatSymbols
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.DateFormat

@Entity
data class Cuenta (
    @PrimaryKey(autoGenerate = true)
    var id: Long? = null,
    var usuario:String,
    var contrasena:String,
    var nombrecompleto:String,
    var rut: Long,
    var fechanacimiento: String,
    var email:String,
    var telefono:Long,
    var latitud:Double,
    var longitud:Double,
    var imagenfrontal: String,
    var imagentrasera: String,
    var fechacreacion: String
)