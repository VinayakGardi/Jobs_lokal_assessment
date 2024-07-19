package com.vinayakgardi.lokal_assessment_jobs.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vinayakgardi.lokal_assessment_jobs.R
import com.vinayakgardi.lokal_assessment_jobs.databinding.FragmentDetailedBinding


class DetailedFragment : Fragment() {

    private lateinit var binding : FragmentDetailedBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailedBinding.inflate(layoutInflater)




        return binding.root
    }


}