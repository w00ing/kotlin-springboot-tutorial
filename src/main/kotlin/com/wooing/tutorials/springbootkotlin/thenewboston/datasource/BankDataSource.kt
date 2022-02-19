package com.wooing.tutorials.springbootkotlin.thenewboston.datasource

import com.wooing.tutorials.springbootkotlin.thenewboston.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
}