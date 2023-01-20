package com.dev.tex.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dev.tex.adapter.ElectronicalAdapter
import com.dev.tex.databinding.FragmentElectronicBinding


class ElectronicFragment : Fragment() {
    lateinit var adapter: RecyclerView.Adapter<ElectronicalAdapter.ViewHolder>
    lateinit var binding: FragmentElectronicBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentElectronicBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter  = ElectronicalAdapter()
        binding.rvElectronical.adapter = adapter
        binding.eBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}