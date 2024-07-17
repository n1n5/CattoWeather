package com.n1n5.catto_weather.dependency_injection

import com.n1n5.catto_weather.fragments.home.HomeViewModel
import com.n1n5.catto_weather.fragments.location.LocationViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(weatherDataRepository = get()) }
    viewModel { LocationViewModel(weatherDataRepository = get()) }
}