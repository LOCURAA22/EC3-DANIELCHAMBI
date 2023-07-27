package com.daniel.ej2_chambidaniel.data.retrofit

import com.daniel.ej2_chambidaniel.data.response.ListSalvaResponse
import retrofit2.http.GET

interface SalvaService {
    @GET("modelos")
    suspend fun getAllSalvas(): ListSalvaResponse
}
//https://parallelum.com.br/fipe/api/v1/carros/marcas/59/modelos