package com.daniel.ej2_chambidaniel.data.repository

import com.daniel.ej2_chambidaniel.data.SalvaServiceResult
import com.daniel.ej2_chambidaniel.data.response.ListSalvaResponse
import com.daniel.ej2_chambidaniel.data.retrofit.RetrofitHelper
import com.daniel.ej2_chambidaniel.data.retrofit.SalvaService
import com.daniel.ej2_chambidaniel.model.Salva
import okhttp3.Response

class SalvaRepository {

    suspend fun getSalvas():SalvaServiceResult<ListSalvaResponse>{
        return try {
            val response  = RetrofitHelper.salvaService.getAllSalvas()
            SalvaServiceResult.Success(response)
        }catch (e:Exception){
            SalvaServiceResult.Error(e)
        }


    }
}