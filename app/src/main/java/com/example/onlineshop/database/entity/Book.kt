package com.example.onlineshop.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "books")
data class Book(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val name: String,
    val picture: Int,
    val description: String,
)