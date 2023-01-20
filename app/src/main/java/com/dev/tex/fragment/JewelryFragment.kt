package com.dev.tex.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dev.tex.adapter.JeweleryAdapter
import com.dev.tex.databinding.FragmentJewelryBinding


class JewelryFragment : Fragment() {
    lateinit var adapter: RecyclerView.Adapter<JeweleryAdapter.ViewHolder>
    lateinit var binding: FragmentJewelryBinding
     override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding = FragmentJewelryBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = JeweleryAdapter()
        binding.rvJewelery.adapter = adapter
        binding.jBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }

}