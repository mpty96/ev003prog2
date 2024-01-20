package com.example.ev3prog2xml.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database (entities = [Cuenta:: class], version = 1)
abstract class BaseDatos : RoomDatabase() {
    abstract fun CuentaDao(): CuentaDao
}