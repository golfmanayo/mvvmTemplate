package com.nattawood.mvvmtemplate.util.intercepor

import com.nattawood.mvvmtemplate.util.exception.ResponseErrorException
import com.nattawood.mvvmtemplate.util.extension.isSuccess
import okhttp3.Interceptor
import okhttp3.Response

class ResponseConnectionInterceptor() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val response = chain.proceed(chain.request())
        if (!response.code.isSuccess()) {
            throw ResponseErrorException(response.message, response.code)
        }
        return response
    }
}