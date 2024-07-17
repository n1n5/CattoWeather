package com.n1n5.catto_weather.dependency_injection

import com.google.gson.Gson
import org.koin.dsl.module

val serializerModule = module {
    single { Gson() }
}