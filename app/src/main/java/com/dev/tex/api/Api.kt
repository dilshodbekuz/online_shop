package com.dev.tex.api

import com.dev.tex.model.CategoryModel
import com.dev.tex.model.GetProductByIdsRequest
import com.dev.tex.model.OffersModel
import com.dev.tex.model.ProductModel
import com.dev.tex.model.base.BaseResponce
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface Api {

    @GET("api/get_offers")
    fun getOffers(): Observable<BaseResponce<List<OffersModel>>>

    @GET("api/get_categories")
    fun get_categories(): Observable<BaseResponce<List<CategoryModel>>>

    @GET("api/get_top_products")
    fun get_product(): Observable<BaseResponce<List<ProductModel>>>

    @GET("api/get_products/{category_id}")
    fun getCategoryById(@Path("category_id") category_id: Int): Observable<BaseResponce<List<ProductModel>>>


      @POST("api/get_products_by_ids")
      fun getCart(@Body request: GetProductByIdsRequest):Observable<BaseResponce<List<ProductModel>>>

}
