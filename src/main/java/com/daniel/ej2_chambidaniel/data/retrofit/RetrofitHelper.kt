package com.daniel.ej2_chambidaniel.data.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    private  val retrofit:Retrofit  = Retrofit.Builder()
        .baseUrl("https://parallelum.com.br/fipe/api/v1/carros/marcas/59/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val salvaService:SalvaService = retrofit.create(SalvaService::class.java)
}