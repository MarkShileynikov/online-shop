package com.example.onlineshop

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.onlineshop.database.entity.Book


class BookAdapter(private val books: List<Book>, private val onClick: (Book) -> Unit) : RecyclerView.Adapter<BookAdapter.BookViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_item, parent, false)
        return BookViewHolder(view, onClick)
    }

    override fun getItemCount(): Int {
        return books.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.bind(books[position])
    }

    class BookViewHolder(itemView: View, private val onClick: (Book) -> Unit) : RecyclerView.ViewHolder(itemView) {

        private val picture: ImageView = itemView.findViewById(R.id.bookPicture)
        private val name: TextView = itemView.findViewById(R.id.bookName)

        fun bind(book: Book) {
            this.picture.setImageResource(book.picture)
            this.name.text = book.name

            itemView.setOnClickListener {
                onClick(book)
            }
        }
    }
}