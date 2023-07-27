package com.daniel.ej2_chambidaniel.ui.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.daniel.ej2_chambidaniel.data.SalvaServiceResult
import com.daniel.ej2_chambidaniel.data.repository.SalvaRepository
import com.daniel.ej2_chambidaniel.model.Salva
import com.daniel.ej2_chambidaniel.model.getData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SalvaListViewModel : ViewModel(){
    val salvas:MutableLiveData<List<Salva>> = MutableLiveData<List<Salva>>()

    val repository  = SalvaRepository()

    fun getAllSalvas(){
        val salvaList= getData()
        salvas.value = salvaList
    }

    fun getSalvasFromService(){

        viewModelScope.launch(Dispatchers.IO){
            val response = repository.getSalvas()
            when(response){
                is SalvaServiceResult.Success ->{
                    salvas.postValue(response.data.modelos)
                }
                is SalvaServiceResult.Error ->{
                    //
                }
            }

        }
    }
}