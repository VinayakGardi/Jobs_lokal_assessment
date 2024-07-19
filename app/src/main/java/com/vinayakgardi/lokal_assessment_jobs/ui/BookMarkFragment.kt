package com.vinayakgardi.lokal_assessment_jobs.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.vinayakgardi.lokal_assessment_jobs.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class BookMarkFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment



        return inflater.inflate(R.layout.fragment_book_mark, container, false)
    }

}