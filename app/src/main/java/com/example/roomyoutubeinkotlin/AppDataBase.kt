package com.example.roomyoutubeinkotlin

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [Usuarios::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun usuariosDao(): UsuariosDao
}