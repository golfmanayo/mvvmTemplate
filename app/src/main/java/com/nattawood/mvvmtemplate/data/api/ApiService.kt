package com.nattawood.mvvmtemplate.data.api


import com.nattawood.mvvmtemplate.constant.ApiConstant
import com.nattawood.mvvmtemplate.data.base.BaseResponse
import retrofit2.http.GET

interface ApiService {

    @GET(ApiConstant.EndPoint.API)
    suspend fun getSomeThing(): BaseResponse // change Base Response to model when use
}