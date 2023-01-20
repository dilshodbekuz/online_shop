package com.dev.tex.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dev.tex.adapter.ClothesAdapter
import com.dev.tex.databinding.FragmentClothesBinding


class ClothesFragment : Fragment() {

    lateinit var adapter: RecyclerView.Adapter<ClothesAdapter.ViewHolder>
    lateinit var binding: FragmentClothesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        binding = FragmentClothesBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter  = ClothesAdapter()
        binding.rvClothes.adapter = adapter

        binding.back.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ClothesFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}