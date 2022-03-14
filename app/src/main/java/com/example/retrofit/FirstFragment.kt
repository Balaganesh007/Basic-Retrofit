package com.example.retrofit

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.retrofit.databinding.FirstFragmentBinding

class FirstFragment : Fragment() {

    private lateinit var binding:FirstFragmentBinding

    private lateinit var viewModel: FirstViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.first_fragment,
            container,
            false
        )

        viewModel = ViewModelProvider(this).get(FirstViewModel::class.java)
        binding.first = viewModel
        binding.lifecycleOwner = this

        return binding.root
    }


}