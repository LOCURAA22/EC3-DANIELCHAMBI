package com.daniel.ej2_chambidaniel.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.daniel.ej2_chambidaniel.databinding.FragmentSalListBinding
import com.daniel.ej2_chambidaniel.ui.viewmodels.SalvaListViewModel


class SalListFragment : Fragment() {

    private lateinit var binding:FragmentSalListBinding

    private lateinit var viewModel: SalvaListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[SalvaListViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding  = FragmentSalListBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter  = RVSalvaListAdapter(listOf())
        binding.rvSalvaList.adapter  = adapter
        viewModel.salvas.observe(requireActivity()){
            adapter.salvas  = it
            adapter.notifyDataSetChanged()
        }
        viewModel.getSalvasFromService()
    }

}