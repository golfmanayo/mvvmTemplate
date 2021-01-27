package com.nattawood.mvvmtemplate.di

import com.nattawood.mvvmtemplate.domain.SimpleUseCase
import com.nattawood.mvvmtemplate.domain.SimpleUseCaseImp
import org.koin.dsl.module

val useCaseModule = module {
    single<SimpleUseCase> { SimpleUseCaseImp(get()) }
}