package com.example.instagram.utils.network

interface NetworkHelper {

    fun isNetworkConnected(): Boolean

    fun castToNetworkError(throwable: Throwable): NetworkError

}