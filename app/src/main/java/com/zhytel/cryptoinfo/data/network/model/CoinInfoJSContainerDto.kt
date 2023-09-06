package com.zhytel.cryptoinfo.data.network.model

import com.google.gson.JsonObject
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinInfoJSContainerDto (
    @SerializedName("RAW")
    @Expose
    val coinInfoJSContainer: JsonObject? = null
)
