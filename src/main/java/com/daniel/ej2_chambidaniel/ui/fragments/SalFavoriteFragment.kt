package com.daniel.ej2_chambidaniel.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.daniel.ej2_chambidaniel.R
import com.daniel.ej2_chambidaniel.databinding.FragmentSalFavoriteBinding

class SalFavoriteFragment : Fragment() {

    private lateinit var binding : FragmentSalFavoriteBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding   = FragmentSalFavoriteBinding.inflate(inflater,container,false)
        return binding.root
    }
}