package com.n1n5.catto_weather.dependency_injection

import com.n1n5.catto_weather.network.repository.WeatherDataRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { WeatherDataRepository(weatherAPI = get()) }
}