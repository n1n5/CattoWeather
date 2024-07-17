package com.n1n5.catto_weather.utils

import android.app.Application
import com.n1n5.catto_weather.dependency_injection.networkModule
import com.n1n5.catto_weather.dependency_injection.repositoryModule
import com.n1n5.catto_weather.dependency_injection.serializerModule
import com.n1n5.catto_weather.dependency_injection.storageModule
import com.n1n5.catto_weather.dependency_injection.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AppConfig : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AppConfig)
            modules(
                listOf(
                    repositoryModule,
                    viewModelModule,
                    serializerModule,
                    storageModule,
                    networkModule
                )
            )
        }
    }
}