package com.pereyrarg11.cryptocurrencyapp.presentation.coin_detail

import com.pereyrarg11.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = "",
)
