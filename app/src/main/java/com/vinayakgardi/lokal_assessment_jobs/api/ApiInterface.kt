package com.vinayakgardi.lokal_assessment_jobs.api

import com.vinayakgardi.lokal_assessment_jobs.model.Data
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("jobs?page=1")
    suspend fun getData() : Response<Data>

}