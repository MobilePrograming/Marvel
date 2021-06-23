package com.guessaname.marvelapp.dao
/*
import okhttp3.*
import java.io.IOException

class Query {

    fun fetchJson() {
        println("attempting to fetch JSON")

        val url = "http://gateway.marvel.com/v1/public/creators/32"
        val client = OkHttpClient()
        val request = Request.Builder().url(url).build()

        client.newCall(request).enqueue(object: Callback {
            override fun onResponse(call: Call, response: Response) {
                if (!response.isSuccessful) throw IOException("UNEXPECTED CODE $response")

                for ((name, value) in response.headers) {
                    println("$name: $value")
                }

                println(response.body!!.string())
            }

            override fun onFailure(call: Call, e: IOException) {
                println("FAILED TO EXECUTE REQUEST")
            }
        })
    }
}*/