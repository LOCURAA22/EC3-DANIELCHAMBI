package com.daniel.ej2_chambidaniel.ui.fragments

import android.content.res.ColorStateList
import android.provider.ContactsContract.CommonDataKinds.Note
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.daniel.ej2_chambidaniel.databinding.ItemSalvaBinding
import com.daniel.ej2_chambidaniel.model.Salva

class RVSalvaListAdapter(var salvas:List<Salva>): RecyclerView.Adapter<SalvaVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SalvaVH {
        val binding=ItemSalvaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SalvaVH(binding)
    }

    override fun getItemCount(): Int = salvas.size

    override fun onBindViewHolder(holder: SalvaVH, position: Int) {
        holder.bind(salvas[position])
    }
}

class SalvaVH(private val binding:ItemSalvaBinding): ViewHolder(binding.root){
    fun bind(note: Salva) {
        binding.txtSalvaTitle.text = note.title
        binding.txtContentSalva.text = note.content
        val labelString  = note.labels?.joinToString(" | ")
        binding.txtLabelsSalva.text =labelString
        binding.txtCreatedonSalva.text = note.createdOn
        //binding.cvItemSalva.setCardBackgroundColor(ColorStateList.valueOf(note.getColor()))

    }

}