package com.guessaname.marvelapp.ui.characters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.guessaname.marvelapp.R
import com.guessaname.marvelapp.ScrollingActivity

class CharacterAdapter : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder> () {

    // esempi manca collegamento dB
    private val names = arrayOf("Thor", "IronMan", "SpiderMan", "BatMan", "Captain America", "Moretti", "Leoni", "Di Lorenzo")

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): CharacterViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.character_card_small, viewGroup, false)
        return CharacterViewHolder(view)
    }
    override fun onBindViewHolder(viewHolder: CharacterViewHolder, i: Int) {

       viewHolder.itemNames.text = names[i]

    }

    //
    override fun getItemCount(): Int { // # of items
        return names.size
    }


    inner class  CharacterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemNames: TextView

        init {
            itemNames = itemView.findViewById(R.id.tv_character_name)

            itemView.setOnClickListener {
                val context = itemView.context
                val intent = Intent(context, ScrollingActivity::class.java).apply{
                    // send data to next activity
                    putExtra("characterName",  itemNames.text)
                }
                context.startActivity(intent)
            }
        }

    }
}