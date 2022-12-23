package com.example.booktest.model

data class BookResponse(
    val totalItems: Int,
    val items: List<Books>
)

data class Books(

    val volumeInfo: BooksVolumeInfo,
    val kind: String,
    val id: String,


    )

data class BooksVolumeInfo(

    val title: String,
    val printType: String,
    val imageLinks: BooksImageLinks,
    val previewLink: String,
    val subtitle: String?,
    val authors: List<String>?


)

data class BooksImageLinks(

    val smallThumbnail: String,
    val thumbnail: String
)