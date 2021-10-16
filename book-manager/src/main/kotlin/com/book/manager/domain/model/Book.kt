package com.book.manager.domain.model

import java.time.LocalDate

data class Book(
    var id: Long,
    var title: String,
    var author: String,
    val releaseDate: LocalDate
)