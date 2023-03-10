package com.dev.tex.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dev.tex.api.repository.ShopRepository
import com.dev.tex.model.CategoryModel
import com.dev.tex.model.OffersModel
import com.dev.tex.model.ProductModel

class MainViewModel : ViewModel() {

    val repository  = ShopRepository()

    val error = MutableLiveData<String>()
    val progress = MutableLiveData<Boolean>()

    val offersData = MutableLiveData<List<OffersModel>>()
    val categoryData= MutableLiveData<List<CategoryModel>>()
    val productData= MutableLiveData<List<ProductModel>>()



    fun getOffers(){
        repository.getOffers(error,progress,offersData)
    }
    fun getCategory(){
        repository.getCategories(error,progress,categoryData)
    }
    fun getProduct(){
        repository.getProduct(error,progress,productData)
    }
    fun getCategoryById(id:Int){
        repository.getCategoryById(id,error,progress,productData)
    }
    fun getProductsByIds(ids: List<Int>){
        repository.getProductsByIds(ids,error,progress,productData)
    }
}