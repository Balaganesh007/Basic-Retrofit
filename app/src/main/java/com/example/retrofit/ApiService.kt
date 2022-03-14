package com.example.retrofit

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://restcountries.com/v3.1/"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()
interface ApiService {
    @GET("all")
    fun getProperties():
            Call<String>
}

object CountryApi {
    val retrofitService : ApiService by lazy {
        retrofit.create( ApiService::class.java)
    }
}