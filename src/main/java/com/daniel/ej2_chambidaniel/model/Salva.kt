package com.daniel.ej2_chambidaniel.model

import android.graphics.Color
import com.google.gson.annotations.SerializedName

data class Salva(
    @SerializedName("nome")
    val title:String,
    val content:String,
    val labels:List<String>,
    val color:String="#03A9F4",
    @SerializedName("codigo")
    val createdOn:String
){
    //fun getColor():Int = Color.parseColor(color)
}

fun getData(): List<Salva>{
    return listOf(
        Salva("Animal 1","Descripcion del animal", listOf("gatuno","Space"),"#03A9F4","28/07/2023"),
        Salva("Animal 1","Descripcion del animal", listOf("gatuno","Space"),"#7B1FA2","28/07/2023"),
        Salva("Animal 1","Descripcion del animal", listOf("gatuno","Space"),"#FF03DAC5","28/07/2023"),
        Salva("Animal 1","Descripcion del animal", listOf("gatuno","Space"),"#FFBB86FC","28/07/2023"),
        Salva("Animal 1","Descripcion del animal", listOf("gatuno","Space"),"#03A9F4","28/07/2023"),
        Salva("Animal 1","Descripcion del animal", listOf("gatuno","Space"),"#03A9F4","28/07/2023"),
        Salva("Animal 1","Descripcion del animal", listOf("gatuno","Space"),"#FF03DAC5","28/07/2023"),
        Salva("Animal 1","Descripcion del animal", listOf("gatuno","Space"),"#FFBB86FC","28/07/2023"),
        Salva("Animal 1","Descripcion del animal", listOf("gatuno","Space"),"#03A9F4","28/07/2023"),

    )
}
