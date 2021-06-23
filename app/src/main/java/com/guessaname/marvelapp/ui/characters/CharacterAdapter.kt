package com.guessaname.marvelapp.ui.characters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.guessaname.marvelapp.R

class CharacterAdapter : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder> () {

    // esempi manca collegamento dB
    private val names = arrayOf("Thor", "SpiderMan",
        "BatMan", "Captain America")

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): CharacterViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.character_card_small, viewGroup, false)
        return CharacterViewHolder(view)
    }
    override fun onBindViewHolder(viewHolder: CharacterViewHolder, i: Int) {

       // viewHolder.itemNames.text = names[i]

    }

    // numero di oggetti
    override fun getItemCount(): Int {
        return 19
    }


    inner class  CharacterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemNames: TextView

        init {
            itemNames = itemView.findViewById(R.id.tv_character_name)
        }

    }
}