package com.nattawood.mvvmtemplate.util

data class ResultResponse<out T>(val isSuccess: Boolean, val exception: Exception?, val data: T?) {
    companion object {
        fun <T> success(data: T): ResultResponse<T> =
            ResultResponse(isSuccess = true, exception = null, data = data)

        fun <T> error(exception: Exception?): ResultResponse<T> =
            ResultResponse(isSuccess = false, exception = exception, data = null)
    }
}

enum class StatusResult {
    SUCCESS,
    ERROR,
    LOADING
}