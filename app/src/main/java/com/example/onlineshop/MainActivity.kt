package com.example.onlineshop

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.onlineshop.database.MainDatabase
import com.example.onlineshop.database.entity.Book

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: BookAdapter
    private lateinit var db: MainDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        db = MainDatabase.getInstance()

        bindViews()
    }

    private fun bindViews() {
        val bookDao = db.getBookDao()

        val bookList = bookDao.getBooks()

        val recyclerView: RecyclerView = findViewById(R.id.bookList)
        adapter = BookAdapter(bookList) { book ->
            moveToBookDetailsScreen(book)
        }
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter
    }

    private fun moveToBookDetailsScreen(book: Book) {
        val intent = Intent(this, BookDetailActivity::class.java)
        intent.putExtra("BOOK_NAME", book.name)
        intent.putExtra("BOOK_PICTURE", book.picture)
        intent.putExtra("BOOK_DESCRIPTION", book.description)
        startActivity(intent)
    }
}