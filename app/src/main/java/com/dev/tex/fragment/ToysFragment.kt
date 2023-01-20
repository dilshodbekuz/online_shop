package com.dev.tex.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dev.tex.adapter.ToysAdapter
import com.dev.tex.databinding.FragmentToysBinding


class ToysFragment : Fragment() {
    lateinit var adapter: RecyclerView.Adapter<ToysAdapter.ViewHolder>
    lateinit var binding: FragmentToysBinding
   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentToysBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter  = ToysAdapter()
        binding.rvToys.adapter = adapter
        binding.tBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}