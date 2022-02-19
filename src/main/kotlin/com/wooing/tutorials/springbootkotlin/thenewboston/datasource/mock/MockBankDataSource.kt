package com.wooing.tutorials.springbootkotlin.thenewboston.datasource.mock

import com.wooing.tutorials.springbootkotlin.thenewboston.datasource.BankDataSource
import com.wooing.tutorials.springbootkotlin.thenewboston.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(
        Bank("1234", 3.14, 17),
        Bank("1010", 17.0, 0),
        Bank("4444", 0.0, 100)
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}