package com.guessaname.marvelapp.ui.bookmarks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.guessaname.marvelapp.R

class BookMarkAdapter: RecyclerView.Adapter<BookMarkAdapter.BookMarkViewHolder> (){

    // esempi manca collegamento dB
    private val names = arrayOf("Thor", "SpiderMan",
        "BatMan", "IronMan")

    private val description = arrayOf("Dio dei fulmini",
        "si arrampica", "è ricco", "è ricco e intelligente")



    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): BookMarkViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.character_card_large, viewGroup, false)
        return BookMarkViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: BookMarkViewHolder, i: Int) {

        viewHolder.itemNames.text = names[i]
        viewHolder.itemDescription.text = description[i]

    }

    // numero di oggetti
    override fun getItemCount(): Int {
        return names.size
    }


    inner class  BookMarkViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemNames: TextView
        var itemDescription: TextView

        init {
            itemNames = itemView.findViewById(R.id.tv_character_name)
            itemDescription = itemView.findViewById(R.id.tv_character_short_bio)
        }

    }

}
