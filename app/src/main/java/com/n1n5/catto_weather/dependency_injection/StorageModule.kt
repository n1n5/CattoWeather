package com.n1n5.catto_weather.dependency_injection

import com.n1n5.catto_weather.storage.SharedPreferencesManager
import org.koin.dsl.module

val storageModule = module {
    single { SharedPreferencesManager(context = get(), gson = get()) }
}