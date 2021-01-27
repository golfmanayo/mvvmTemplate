package com.nattawood.mvvmtemplate.di

import com.nattawood.mvvmtemplate.data.repository.*
import org.koin.dsl.module

val repositoryModule = module {
    single<RemoteDataSource> { RemoteDataSourceImp(get()) }
    single<LocalDataSource> { LocalDataSourceImp() }
    single<DataRepository> { DataRepositoryImp(get(), get()) }
}