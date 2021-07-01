package com.guessaname.marvelapp.ui.bookmarks

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.guessaname.marvelapp.R
import com.guessaname.marvelapp.ScrollingActivity


class BookMarkAdapter(private val listener: RecyclerView): RecyclerView.Adapter<BookMarkAdapter.BookMarkViewHolder> () {

    // examples, we need to attach DB
    private val names = arrayOf("Thor", "SpiderMan", "BatMan", "IronMan")
    private val description = arrayOf("Dio dei fulmini", "si arrampica", "è ricco", "è ricco e intelligente")

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): BookMarkViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.character_card_large, viewGroup, false)
        return BookMarkViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: BookMarkViewHolder, position: Int) {
        viewHolder.itemNames.text = names[position]
        viewHolder.itemDescription.text = description[position]
    }

    override fun getItemCount(): Int { // # of items
        return names.size
    }

    inner class BookMarkViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

        var itemNames: TextView = itemView.findViewById(R.id.tv_character_name)
        var itemDescription: TextView = itemView.findViewById(R.id.tv_character_short_bio)

        init { itemView.setOnClickListener {
            val context = itemView.context
            val intent = Intent(context, ScrollingActivity::class.java).apply{}
            context.startActivity(intent)
            }
        }
    }
}
