package com.guessaname.marvelapp.ui.characters

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.guessaname.marvelapp.R
import kotlinx.android.synthetic.main.fragment_character.*

class CharacterFragment: Fragment () {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_character, container, false)
    }

     override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        character_recyclerview.apply{
            layoutManager = GridLayoutManager(context, 3)
            adapter = CharacterAdapter()
        }

    }

}