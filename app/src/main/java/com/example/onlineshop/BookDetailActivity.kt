package com.example.onlineshop

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class BookDetailActivity : AppCompatActivity() {

    private lateinit var bookPictureView: ImageView
    private lateinit var bookNameView : TextView
    private lateinit var bookDescriptionView: TextView
    private lateinit var orderButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_detail)

        bindViews()
    }

    private fun bindViews() {
        val bookPicture = intent.getIntExtra("BOOK_PICTURE", 0)
        val bookName = intent.getStringExtra("BOOK_NAME") ?: ""
        val bookDescription = intent.getStringExtra("BOOK_DESCRIPTION") ?: ""

        bookPictureView = findViewById(R.id.picture)
        bookNameView = findViewById(R.id.bookName)
        bookDescriptionView = findViewById(R.id.description)
        orderButton = findViewById(R.id.order)

        bookPictureView.setImageResource(bookPicture)
        bookNameView.text = bookName
        bookDescriptionView.text = bookDescription

        orderButton.setOnClickListener {
            Toast.makeText(this, "Заказ оформлен!" , Toast.LENGTH_SHORT).show()
            finish()
        }

    }
}