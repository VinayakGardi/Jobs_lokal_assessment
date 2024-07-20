package com.vinayakgardi.lokal_assessment_jobs.utilites

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.vinayakgardi.lokal_assessment_jobs.R
import com.vinayakgardi.lokal_assessment_jobs.api.ApiInstance
import com.vinayakgardi.lokal_assessment_jobs.api.ApiInterface
import com.vinayakgardi.lokal_assessment_jobs.model.Data

import retrofit2.Response


object Utilities {

    suspend fun getApiData() : Response<Data> {
        val response = ApiInstance.getInstance().create(ApiInterface::class.java).getData()
        return response
    }

     fun loadImage(context : Context, View : ImageView, source : String){
        Glide.with(context).load(source)
            .into(View)
    }
}