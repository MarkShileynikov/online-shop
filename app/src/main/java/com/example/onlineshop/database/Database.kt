package com.example.onlineshop.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.onlineshop.App
import com.example.onlineshop.database.dao.BookDao
import com.example.onlineshop.database.dao.UserDao
import com.example.onlineshop.database.entity.Book
import com.example.onlineshop.database.entity.User

@Database(entities = [User::class, Book::class], version = 1)
abstract class MainDatabase : RoomDatabase() {
    abstract fun getUserDao() : UserDao
    abstract fun getBookDao() : BookDao

    companion object {
        @Volatile
        private var INSTANCE: MainDatabase? = null

        fun getInstance() : MainDatabase {
            val tempInstance =  INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance =  Room.databaseBuilder(
                    App.instance,
                    MainDatabase::class.java,
                    "database"
                ).allowMainThreadQueries()
                    .build()
                INSTANCE = instance
                return instance
            }

        }
    }
}