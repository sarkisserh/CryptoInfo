package com.zhytel.cryptoinfo.domain

import androidx.lifecycle.LiveData
import com.zhytel.cryptoinfo.domain.entity.CoinInfo

interface CoinRepository {

    fun getCoinInfo(fSym: String): LiveData<CoinInfo>

    fun getCoinInfoList(): LiveData<List<CoinInfo>>

    suspend fun loadData()
}