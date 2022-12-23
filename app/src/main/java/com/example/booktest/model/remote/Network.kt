package com.example.booktest.model.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Network {

    val api: BookService by lazy {
        initRetrofit().create(BookService::class.java)
    }

    private fun initRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_BOOKS_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}