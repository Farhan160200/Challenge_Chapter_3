package com.farhanfarkaann.challengechapter3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.farhanfarkaann.challengechapter3.activitydestination.*
import com.farhanfarkaann.challengechapter3.databinding.FragmentKeempatBinding



class FragmentKeempat : Fragment() {
    private lateinit var binding: FragmentKeempatBinding

    companion object {
        const val USIA = "USIA"
        const val ALAMAT = "ALAMAT"
        const val PEKERJAAN = "PEKERJAAN"
        const val BUNDLE = "BUNDLE"
        val NAMA  = "NAMA"
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKeempatBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnGts5.setOnClickListener {

            val bundlesebelah = this.arguments
            val nama  = bundlesebelah?.getString("nameNama")
            val usia = binding.etUsia.text.toString().toInt()
            val alamat = binding.etAlamat.text.toString()
            val pekerjaan = binding.etPekerjaan.text.toString()
            val bundle = bundleOf()
            bundle.putString(NAMA,nama)
            bundle.putInt(USIA,usia)
            bundle.putString(ALAMAT,alamat)
            bundle.putString(PEKERJAAN,pekerjaan)

            it.findNavController().navigate(R.id.action_fragmentKeempat_to_fragmentKelima, bundle)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
    }
