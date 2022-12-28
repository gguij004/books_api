package com.example.booktest.view

interface Communicator {
    fun sendDataToSearch(bookTitle: String, bookFilter: String, bookType: String)

}