package com.guessaname.marvelapp.ui.comics

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.guessaname.marvelapp.R
import com.guessaname.marvelapp.ScrollingActivity


class ComicAdapter : RecyclerView.Adapter<ComicAdapter.ComicViewHolder> () {

    // examples, we need to attach DB
    private val names = arrayOf("Thor abd the storm", "Poisoned Net sppiderman", "BatMan in black", "IronMan man of steel")

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ComicViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.character_card_small, viewGroup, false)
        return ComicViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ComicViewHolder, position: Int) {
        viewHolder.itemNames.text = names[position]
    }

    override fun getItemCount(): Int { // # of items
        return names.size
    }

    inner class ComicViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

        var itemNames: TextView

        init {
            itemNames = itemView.findViewById(R.id.tv_character_name)

            itemView.setOnClickListener {
                val context = itemView.context
                val intent = Intent(context, ScrollingActivity::class.java).apply {
                    // send data to next activity
                    putExtra("characterName", itemNames.text)
                }
                context.startActivity(intent)
            }
        }

    }
}