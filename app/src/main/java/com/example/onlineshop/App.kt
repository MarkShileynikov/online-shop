package com.example.onlineshop

import android.app.Application
import com.example.onlineshop.database.MainDatabase
import com.example.onlineshop.database.util.provideBookList

class App : Application() {
    companion object {
        lateinit var instance : App
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        val db = MainDatabase.getInstance()
        val bookDao = db.getBookDao()

        if (bookDao.getBooks().isEmpty()) {
            provideBookList().forEach { restaurant ->
                bookDao.insertBook(restaurant)
            }
        }
    }
}