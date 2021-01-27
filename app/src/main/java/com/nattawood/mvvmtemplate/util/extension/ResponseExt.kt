package com.nattawood.mvvmtemplate.util.extension

fun Int.isSuccess(): Boolean {
    return this == 200
}