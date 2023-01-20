package com.dev.tex.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.dev.tex.fragment.CompletedFragment2
import com.dev.tex.fragment.OngoingFragment

class ViewPagerAdapter(fragmentManager: FragmentManager,lifecycle:Lifecycle):FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
     return  when(position){
            0 ->{
                OngoingFragment()
            }
            1->{
                CompletedFragment2()
            }
            else->{
                Fragment()
            }
        }
    }
}