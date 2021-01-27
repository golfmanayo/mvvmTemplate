package com.nattawood.mvvmtemplate.data.repository

import com.nattawood.mvvmtemplate.data.api.ApiService
import com.nattawood.mvvmtemplate.util.ResultResponse

interface RemoteDataSource {
    suspend fun getSomeThing(): ResultResponse<Any>
}

class RemoteDataSourceImp(
    private val api: ApiService
) : RemoteDataSource {

    override suspend fun getSomeThing(): ResultResponse<Any> =
        try {
            ResultResponse.success(api.getSomeThing())
        } catch (e: Exception) {
            ResultResponse.error(e)
        }

}