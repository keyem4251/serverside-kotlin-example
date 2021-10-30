package com.book.manager.domain.model

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.time.LocalDate
import java.time.LocalDateTime

internal class BookWithRentalTest {
    @Test
    fun `isRental when rental is null then return false`() {
        val book = Book(1, "Kotlin入門", "Kotlin", LocalDate.now())
        val bookWIthRental = BookWithRental(book, null)
        Assertions.assertThat(bookWIthRental.isRental).isEqualTo(false)
    }

    @Test
    fun `is Rental when rental is not null then return true`() {
        val book = Book(1, "Kotlin入門", "Kotlin", LocalDate.now())
        val rental = Rental(1, 100, LocalDateTime.now(), LocalDateTime.MAX)
        val bookWIthRental = BookWithRental(book, rental)
        Assertions.assertThat(bookWIthRental.isRental).isEqualTo(true)
    }
}