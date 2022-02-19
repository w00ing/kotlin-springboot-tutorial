package com.wooing.tutorials.springbootkotlin.thenewboston.service

import com.wooing.tutorials.springbootkotlin.thenewboston.datasource.BankDataSource
import com.wooing.tutorials.springbootkotlin.thenewboston.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()

}