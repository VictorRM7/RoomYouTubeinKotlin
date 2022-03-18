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

    @Query("SELECT * FROM usuarios WHERE usuario LIKE :first LIMIT 1")
    fun findByName(first: String, last: String): Usuarios

    @Insert
    fun insertAll(vararg users: Usuarios)
    abstract fun insert(usuarios: Usuarios): Long


}