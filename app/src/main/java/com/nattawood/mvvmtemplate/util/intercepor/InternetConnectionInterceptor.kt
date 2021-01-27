package com.nattawood.mvvmtemplate.util.intercepor

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import com.nattawood.mvvmtemplate.util.exception.NoInternetException
import okhttp3.Interceptor
import okhttp3.Response

class InternetConnectionInterceptor(private val context: Context) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        if (!isConnected()) {
            throw NoInternetException(context)
        }
        return chain.proceed(chain.request().newBuilder().build())
    }

    private fun isConnected(): Boolean {
        return (context.getSystemService(Context.CONNECTIVITY_SERVICE) as?
                ConnectivityManager)?.let { connectivityManager ->
            val capabilities = connectivityManager
                .getNetworkCapabilities(connectivityManager.activeNetwork)
            return (capabilities?.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) == true) or
                    (capabilities?.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) == true) or
                    (capabilities?.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) == true)
        } ?: false
    }
}
