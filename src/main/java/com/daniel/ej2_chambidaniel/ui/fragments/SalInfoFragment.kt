package com.daniel.ej2_chambidaniel.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.daniel.ej2_chambidaniel.R
import com.daniel.ej2_chambidaniel.databinding.FragmentSalInfoBinding

class SalInfoFragment : Fragment() {

    private lateinit var binding : FragmentSalInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSalInfoBinding.inflate(inflater,container,false)
        return binding.root
    }


}