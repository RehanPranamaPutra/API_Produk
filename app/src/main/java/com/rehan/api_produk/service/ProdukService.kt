package com.rehan.api_produk.service


import retrofit2.http.GET
import retrofit2.Call
import com.rehan.api_produk.model.ResponseProduk

interface ProdukService {
    @GET("products") //end point
    fun getAllProduk() : Call<ResponseProduk>
}