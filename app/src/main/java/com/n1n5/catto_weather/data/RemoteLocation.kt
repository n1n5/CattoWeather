package com.n1n5.catto_weather.data

data class RemoteLocation(
    val name: String,
    val region: String,
    val country: String,
    val lat: Double,
    val lon: Double
)