package com.dev.tex.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dev.tex.R
import com.dev.tex.databinding.RvHomeVerticalBinding
import com.dev.tex.model.ProductModel
import com.dev.tex.util.Constant

class PraductAdapter(val item: List<ProductModel>) : RecyclerView.Adapter<PraductAdapter.ItemHolders>() {
    class ItemHolders(val binding: RvHomeVerticalBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolders {
        return ItemHolders(RvHomeVerticalBinding.inflate(LayoutInflater.from(parent.context),
            parent,
            false))
    }

    override fun onBindViewHolder(holder: ItemHolders, position: Int) {
        val items = item[position]

        holder.binding.tvSnake.text = items.name
        holder.binding.price.text = "${items.price} so'm"

        Glide.with(holder.itemView.context).load(Constant.IMAGE+items.image).placeholder(R.drawable.girls).into(holder.binding.imgGirl)

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, com.dev.tex.activity.ProductDetailsActivity::class.java)
            intent.putExtra("extra_data",items)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return item.size
    }
}