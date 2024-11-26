package com.example.onlineshop.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.onlineshop.database.entity.Book


@Dao
interface BookDao {
    @Query("SELECT * FROM books")
    fun getBooks() : List<Book>

    @Insert
    fun insertBook(book: Book)
}