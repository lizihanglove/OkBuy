package lizihang.website.base.data.net

import lizihang.website.base.common.NetConstant
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * @author lizihanglove
 * @date  2018/1/1
 * @email one_mighty@163.com
 * @desc
 */
class RetrofitFactory private constructor() {
    companion object {
        val instance: RetrofitFactory by lazy { RetrofitFactory() }
    }

    private val retrofit: Retrofit
    private val interceptor: Interceptor

    init {
        retrofit = Retrofit.Builder()
                .baseUrl(NetConstant.SERVER_ADDRESS)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(getClient())
                .build()
        interceptor = Interceptor { chain ->
            val request = chain.request()
                    .newBuilder()
                    .addHeader("Content-Type", "application/json")
                    .addHeader("charset", "utf-8")
                    .build()
            chain.proceed(request)
        }
    }

    private fun getClient(): OkHttpClient {
        return OkHttpClient.Builder()
                .addInterceptor(getLoggingInterceptor())
                .addInterceptor(interceptor)
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .build()
    }

    private fun getLoggingInterceptor(): Interceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }

    fun <T> create(api: Class<T>): T {
        return retrofit.create(api)
    }
}