package com.pedromassango.crypto.data

import com.google.gson.annotations.SerializedName

data class BlockchainStats(
    @SerializedName("timestamp") val timestamp: Double,
    @SerializedName("market_price_usd") val marketPriceUsd: Double,
    @SerializedName("hash_rate") val hashRate: Double,
    @SerializedName("total_fees_btc") val totalFeesBtc: Double,
    @SerializedName("n_btc_mined") val nBtcMined: Double,
    @SerializedName("n_tx") val nTx: Double,
    @SerializedName("n_blocks_mined") val nBlocksMined: Double,
    @SerializedName("minutes_between_blocks") val minutesBetweenBlocks: Double,
    @SerializedName("totalbc") val totalbc: Double,
    @SerializedName("n_blocks_total") val nBlocksTotal: Double,
    @SerializedName("estimated_transaction_volume_usd") val estimatedTransactionVolumeUsd: Long,
    @SerializedName("blocks_size") val blocksSize: Double,
    @SerializedName("miners_revenue_usd") val minersRevenueUsd: Double,
    @SerializedName("nextretarget") val nextretarget: Double,
    @SerializedName("difficulty") val difficulty: Double,
    @SerializedName("estimated_btc_sent") val estimatedBtcSent: Double,
    @SerializedName("miners_revenue_btc") val minersRevenueBtc: Double,
    @SerializedName("total_btc_sent") val totalBtcSent: Double,
    @SerializedName("trade_volume_btc") val tradeVolumeBtc: Double,
    @SerializedName("trade_volume_usd") val tradeVolumeUsd: Double
)