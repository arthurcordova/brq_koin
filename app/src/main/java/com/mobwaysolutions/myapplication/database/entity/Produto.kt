package com.mobwaysolutions.myapplication.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Produto(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String?,
    val price: Double?
)
