package com.nattawood.mvvmtemplate.data.repository

import com.nattawood.mvvmtemplate.util.ResultResponse

interface LocalDataSource {
    fun getSomeThing(): ResultResponse<Any>
}

class LocalDataSourceImp() : LocalDataSource {

    override fun getSomeThing(): ResultResponse<Any> {
        return ResultResponse.success(Any())
    }

}