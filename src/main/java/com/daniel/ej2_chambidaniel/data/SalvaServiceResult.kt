package com.daniel.ej2_chambidaniel.data

import com.daniel.ej2_chambidaniel.data.response.ListSalvaResponse

sealed class SalvaServiceResult<T>(data: T?=null,error:Exception? = null){
    data class Success<T>(val data: T): SalvaServiceResult<T>(data,null)
    data class Error<T>(val error:Exception): SalvaServiceResult<T>(null,error)
}
