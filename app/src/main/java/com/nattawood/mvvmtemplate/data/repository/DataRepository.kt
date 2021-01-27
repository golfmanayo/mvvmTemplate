package com.nattawood.mvvmtemplate.data.repository

import com.nattawood.mvvmtemplate.util.ResultResponse

interface DataRepository {
    suspend fun getSomeThing(): ResultResponse<Any>
}

class DataRepositoryImp(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
) : DataRepository {

    override suspend fun getSomeThing(): ResultResponse<Any> =
        remoteDataSource.getSomeThing()

}