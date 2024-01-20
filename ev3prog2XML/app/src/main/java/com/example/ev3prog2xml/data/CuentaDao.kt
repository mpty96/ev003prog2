package com.example.ev3prog2xml.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface CuentaDao {

    @Query("SELECT * FROM Cuenta ORDER BY FechaCreacion DESC ")
    suspend fun obtenerTodas(): List<Cuenta>

    @Query("SELECT * FROM Cuenta WHERE id = :id")
    suspend fun obtenerPorId(id:Long): Cuenta

    @Insert
    suspend fun insertar(cuenta:Cuenta)

    @Update
    suspend fun actualizar(cuenta:Cuenta)

    @Delete
    suspend fun eliminar(cuenta:Cuenta)
}