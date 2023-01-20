package com.dev.tex.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dev.tex.adapter.ShoesAdapter
import com.dev.tex.databinding.FragmentShoesBinding


class ShoesFragment : Fragment() {

    lateinit var adapter: RecyclerView.Adapter<ShoesAdapter.ViewHolder>
    lateinit var binding: FragmentShoesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentShoesBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter  = ShoesAdapter()
        binding.rvShoes.adapter = adapter
        binding.shBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}