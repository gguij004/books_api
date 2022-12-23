package com.example.booktest.model.remote

import com.example.booktest.model.BookResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BookService {
    @GET(BASE_BOOKS_ENDPOINT)
    fun getNextBookPage(
        @Query(PARAM_Q) bookTitle: String,
        @Query(PARAM_PRINT_TYPE) bookType: String,
        @Query(PARAM_FILTER) bookFilter: String,
        @Query(PARAM_START_INDEX) pageIndex: Int
    ): Call<BookResponse>

}

/**
 *  Implementing Retrofit
 * 1 add the library dependency
 * 2 create service interface
 * 3 define the http verbs in the interface
 * 4  create the retrofit object
 * 5  invoke either enqueue or execute.
 */