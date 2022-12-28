package com.example.booktest

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.booktest.databinding.DisplayFragmentBinding
import com.example.booktest.model.BookResponse
import com.example.booktest.model.remote.Network
import com.example.booktest.view.Communicator
import com.example.booktest.view.DisplayFragment
import com.example.booktest.view.SearchFragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.search_fragment, SearchFragment())
            .commit()
      //  getBookData("Bool of elves", "ebooks", "books")
    }

//    private fun getBookData(bookTile: String, bookFilter: String, bookPrintType: String) {
//        Network().api.getNextBookPage(
//            bookTile, bookPrintType, bookFilter, 0
//        ).enqueue(
//            object : Callback<BookResponse> {
//                override fun onResponse(
//                    call: Call<BookResponse>,
//                    response: Response<BookResponse>
//                ) {
//                    //You have a bookResponse
//                    //You have a Empty Response.
//                    if (response.isSuccessful) {
//                        response.body()?.let {
//                            Toast.makeText(this@MainActivity, "$it", Toast.LENGTH_SHORT).show()
//                        }
//                    } else {
//                        Log.d(TAG, "onResponse: ${response.message()}")
//                    }
//
//                }
//
//                override fun onFailure(call: Call<BookResponse>, t: Throwable) {
//                    Log.d(TAG, "onFailure: ${t.message}")
//                    t.printStackTrace()
//                }
//            }
//        )
//
//    }

    override fun sendDataToSearch(bookTitle: String, bookFilter: String, bookType: String) {
        supportFragmentManager.beginTransaction().replace(
            R.id.display_fragment, DisplayFragment.newInstance(
                bookTitle, bookFilter, bookType
            )
        )
            .addToBackStack(null)
            .commit()

    }
}