package com.zhytel.cryptoinfo.domain

class GetCoinInfoUseCase(private val repository:CoinRepository){

    operator fun invoke(fromSymbol: String) = repository.getCoinInfo(fromSymbol)
}