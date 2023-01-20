package com.dev.tex.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import com.dev.tex.R
import com.dev.tex.databinding.ActivityProductDetailsBinding
import com.dev.tex.model.ProductModel
import com.dev.tex.util.Constant
import com.dev.tex.util.PrefUtils


class ProductDetailsActivity : AppCompatActivity() {
    lateinit var item: ProductModel
    lateinit var binding: ActivityProductDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView2.setOnClickListener {
            finish()
        }
        item = intent.getSerializableExtra("extra_data") as ProductModel

        binding.textView2.text = item.name
        binding.textView11.text = item.price

        Glide.with(this).load(Constant.IMAGE + item.image).into(binding.imageView)

        binding.favoritee.setOnClickListener {
            PrefUtils.setFavorite(item)
            if (PrefUtils.checkFavorite(item)){
                binding.favoritee.setImageResource(R.drawable.favorite)
            }else{
                binding.favoritee.setImageResource(R.drawable.ic_baseline_favorite_border_24)
            }
        }


        if (PrefUtils.getCartCount(item) > 0) {
            binding.cart.visibility = View.GONE
        }


        if (PrefUtils.checkFavorite(item)){
            binding.favoritee.setImageResource(R.drawable.favorite)
        }else{
            binding.favoritee.setImageResource(R.drawable.ic_baseline_favorite_border_24)
        }


        binding.cart.setOnClickListener {
            item.cartCount = 1
            PrefUtils.setCart(item)
            Toast.makeText(this, "Product added to cart", Toast.LENGTH_SHORT).show()
            finish()
        }


    }
}

