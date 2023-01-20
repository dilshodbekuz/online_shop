package com.dev.tex.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dev.tex.adapter.KitchenAdapter
import com.dev.tex.databinding.FragmentKitchenBinding


class KitchenFragment : Fragment() {
    lateinit var adapter: RecyclerView.Adapter<KitchenAdapter.ViewHolder>
    lateinit var binding: FragmentKitchenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKitchenBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter  = KitchenAdapter()
        binding.rvKitchen.adapter = adapter
        binding.kBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}