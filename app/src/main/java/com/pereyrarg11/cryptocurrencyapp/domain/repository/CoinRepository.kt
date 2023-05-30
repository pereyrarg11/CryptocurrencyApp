package com.pereyrarg11.cryptocurrencyapp.domain.repository

import com.pereyrarg11.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.pereyrarg11.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}