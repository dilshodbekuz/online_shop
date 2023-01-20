package com.dev.tex.model.base

data class BaseResponce <T>(
    var success : Boolean,
    val data : T,
    val message : String,
    var error_code : Int
)