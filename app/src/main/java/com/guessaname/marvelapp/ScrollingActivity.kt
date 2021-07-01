package com.guessaname.marvelapp

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.guessaname.marvelapp.databinding.ActivityScrollingBinding
import com.squareup.picasso.Picasso

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))
        binding.toolbarLayout.title = title

        // TEST
        //Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(app_bar.background);
    }
}

