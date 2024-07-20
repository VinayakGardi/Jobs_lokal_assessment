package com.vinayakgardi.lokal_assessment_jobs.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.vinayakgardi.lokal_assessment_jobs.R
import com.vinayakgardi.lokal_assessment_jobs.adapter.JobItemAdapter
import com.vinayakgardi.lokal_assessment_jobs.api.ApiInstance
import com.vinayakgardi.lokal_assessment_jobs.api.ApiInterface
import com.vinayakgardi.lokal_assessment_jobs.databinding.FragmentJobBinding
import com.vinayakgardi.lokal_assessment_jobs.model.Result
import com.vinayakgardi.lokal_assessment_jobs.utilites.Utilities
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class JobFragment : Fragment() {

    private lateinit var binding: FragmentJobBinding
    private lateinit var adapter: JobItemAdapter
    private var jobList = listOf<Result>()
    private lateinit var navController : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentJobBinding.inflate(inflater, container, false)

        setupRecyclerView()
        checkInternetAndFetchData()

        return binding.root
    }

    private fun checkInternetAndFetchData() {
        if (!Utilities.isInternetAvailable(requireContext())) {
            // Redirect to BookmarkFragment if there is no internet
            redirectToBookmarkFragment()
        } else {
            getApiData()
        }
    }

    private fun getApiData() {
        lifecycleScope.launch(Dispatchers.IO) {
            val response = ApiInstance.getInstance().create(ApiInterface::class.java).getData()
            if (response.isSuccessful && response.body() != null) {
                val data = response.body()
                withContext(Dispatchers.Main) {
                    if (data != null) {
                        jobList = data.results // Assuming `results` is the list in `Data`
                        adapter.updateData(jobList)
                    }
                }
            } else {
                Log.e("API_ERROR", "Failed to fetch data: ${response.errorBody()?.string()}")
            }
        }
    }

    private fun setupRecyclerView() {
        adapter = JobItemAdapter(requireContext(), jobList)
        binding.jobRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.jobRecyclerView.adapter = adapter
    }

    private fun redirectToBookmarkFragment() {
        // Replace with the actual implementation for navigating to BookmarkFragment
        navController = findNavController()
        navController.navigate(R.id.action_jobFragment_to_bookMarkFragment)

    }
}
