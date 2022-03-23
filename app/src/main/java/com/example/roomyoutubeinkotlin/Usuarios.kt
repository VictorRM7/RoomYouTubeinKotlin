package com.example.roomyoutubeinkotlin

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Usuarios(
    @PrimaryKey (autoGenerate = true)
    var id: Int,

    @ColumnInfo(name = "nombreUsuario")
    var nombreUsuario: String? = null,

    @ColumnInfo(name = "usuario")
    var usuario: String? = null,

    @ColumnInfo(name = "password")
    var password: String? = null,

    )








