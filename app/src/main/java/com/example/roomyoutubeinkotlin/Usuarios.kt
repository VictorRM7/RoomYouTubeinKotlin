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

    ) {

    fun Usuarios(nombreUsuario: String?, usuario: String?, password: String?) {
        this.nombreUsuario = nombreUsuario
        this.usuario = usuario
        this.password = password
    }

    @JvmName("getId1")
    fun getId(): Int {
        return id
    }

    @JvmName("setId1")
    fun setId(id: Int) {
        this.id = id
    }

    @JvmName("getNombreUsuario1")
    fun getNombreUsuario(): String? {
        return nombreUsuario
    }

    @JvmName("setNombreUsuario1")
    fun setNombreUsuario(nombreUsuario: String?) {
        this.nombreUsuario = nombreUsuario
    }

    @JvmName("getUsuario1")
    fun getUsuario(): String? {
        return usuario
    }

    @JvmName("setUsuario1")
    fun setUsuario(usuario: String?) {
        this.usuario = usuario
    }

    @JvmName("getPassword1")
    fun getPassword(): String? {
        return password
    }

    @JvmName("setPassword1")
    fun setPassword(password: String?) {
        this.password = password
    }


}





