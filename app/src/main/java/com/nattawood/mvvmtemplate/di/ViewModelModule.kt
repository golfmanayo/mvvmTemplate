package com.nattawood.mvvmtemplate.di

import com.nattawood.mvvmtemplate.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel(get()) }
}