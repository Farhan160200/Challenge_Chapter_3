package com.farhanfarkaann.challengechapter3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.navigation.findNavController
import com.farhanfarkaann.challengechapter3.databinding.FragmentKetigaBinding


class FragmentKetiga : Fragment() {
    private lateinit var binding : FragmentKetigaBinding

    val args : FragmentKetigaArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKetigaBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myName = args.myName
        binding.tvName.text = myName

    }

}