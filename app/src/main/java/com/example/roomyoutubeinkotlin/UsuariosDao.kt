package com.example.roomyoutubeinkotlin

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UsuariosDao {

    @Query("SELECT * FROM usuarios")
    fun getAll(): List<Usuarios>

    @Query("SELECT * FROM usuarios WHERE id IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Usuarios>

    @Insert
    fun insertAll(vararg users: Usuarios)

    @Insert
    fun insert(usuarios: Usuarios): Long


}