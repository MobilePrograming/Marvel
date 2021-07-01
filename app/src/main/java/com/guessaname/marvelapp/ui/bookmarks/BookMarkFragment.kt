package com.guessaname.marvelapp.ui.bookmarks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.guessaname.marvelapp.R
import kotlinx.android.synthetic.main.fragment_bookmark.*
import okhttp3.internal.notify


class BookMarkFragment : Fragment(), AdapterView.OnItemClickListener {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<BookMarkAdapter.BookMarkViewHolder>? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bookmark, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        bookmarks_recyclerview.apply{
            layoutManager = LinearLayoutManager(activity)
            adapter = BookMarkAdapter(this)
        }
    }


    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        //Toast.makeText(this, "Item $position clicked",Toast.LENGTH_SHORT).show()
    }
}