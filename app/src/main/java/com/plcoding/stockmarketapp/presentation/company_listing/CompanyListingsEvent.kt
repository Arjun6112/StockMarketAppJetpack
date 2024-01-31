package com.plcoding.stockmarketapp.presentation.company_listing

import androidx.room.Query

sealed class CompanyListingsEvent {
    object Refresh:CompanyListingsEvent()
    data class onSearchQueryChange(val query: String):CompanyListingsEvent()

}