package com.guessaname.marvelapp.ui.comics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.guessaname.marvelapp.R
import com.guessaname.marvelapp.ui.bookmarks.BookMarkAdapter
import kotlinx.android.synthetic.main.content_scrolling.*

class ComicFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.content_scrolling, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        comics_recyclerview.apply{
            layoutManager = LinearLayoutManager(activity)
            adapter = comicAdapter()
        }
    }
}