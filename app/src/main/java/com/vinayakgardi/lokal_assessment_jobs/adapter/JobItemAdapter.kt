package com.vinayakgardi.lokal_assessment_jobs.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vinayakgardi.lokal_assessment_jobs.R
import com.vinayakgardi.lokal_assessment_jobs.model.Result

class JobItemAdapter(val context: Context, var jobList: List<Result>) :
    RecyclerView.Adapter<JobItemAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView = view.findViewById(R.id.job_title)
        var location: TextView = view.findViewById(R.id.job_location)
        var phone: TextView = view.findViewById(R.id.job_phone)
        var salary: TextView = view.findViewById(R.id.job_salary)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.job_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return jobList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentJob = jobList[position]

        holder.title.text = currentJob?.title
        holder.salary.text = currentJob?.primary_details?.Salary
        holder.location.text = currentJob?.primary_details?.Place
        holder.phone.text = currentJob?.custom_link?.substring(4)

        holder.itemView.setOnClickListener{

        }

    }

    fun updateData(newJobList: List<Result>) {
        jobList = newJobList
        notifyDataSetChanged()
    }
}