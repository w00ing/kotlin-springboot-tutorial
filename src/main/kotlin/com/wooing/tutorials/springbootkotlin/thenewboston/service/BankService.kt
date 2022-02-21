package com.wooing.tutorials.springbootkotlin.thenewboston.service

import com.wooing.tutorials.springbootkotlin.thenewboston.datasource.BankDataSource
import com.wooing.tutorials.springbootkotlin.thenewboston.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()

    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)
    fun createBank(bank: Bank): Bank = dataSource.createBank(bank)
    fun updateBank(bank: Bank): Bank = dataSource.updateBank(bank)
    fun deleteBank(accountNumber: String): Unit = dataSource.deleteBank(accountNumber)


}