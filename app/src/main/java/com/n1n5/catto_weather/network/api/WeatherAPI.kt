package com.n1n5.catto_weather.network.api

import com.n1n5.catto_weather.data.RemoteLocation
import com.n1n5.catto_weather.data.RemoteWeatherData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {
    companion object {
        const val BASE_URL = "https://api.weatherapi.com/v1/"
        const val API_KEY = "6f7effba0c304ec0bfc122130240107"
    }

    @GET("search.json")
    suspend fun searchLocation(
        @Query("key") key: String = API_KEY,
        @Query("q") query: String
    ): Response<List<RemoteLocation>>

    @GET("forecast.json")
    suspend fun getWeatherData(
        @Query("key") key: String = API_KEY,
        @Query("q") query: String
    ): Response<RemoteWeatherData>
}