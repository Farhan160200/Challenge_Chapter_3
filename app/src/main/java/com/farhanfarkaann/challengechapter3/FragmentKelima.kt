package com.farhanfarkaann.challengechapter3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.farhanfarkaann.challengechapter3.databinding.FragmentKelimaBinding
import com.farhanfarkaann.challengechapter3.databinding.FragmentKetigaBinding

class FragmentKelima : Fragment() {
    private lateinit var binding: FragmentKelimaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentKelimaBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = this.arguments

        val nama  = bundle?.getString(FragmentKeempat.NAMA)
        val usia = bundle?.getInt(FragmentKeempat.USIA)
        val alamat = bundle?.getString(FragmentKeempat.ALAMAT)
        val pekerjaan = bundle?.getString(FragmentKeempat.PEKERJAAN)

        binding.tvName.text = nama.toString()
        binding.tvUsia.text  = usia.toString()
        binding.tvAlamat.text = alamat.toString()
        binding.tvPekerjaan.text = pekerjaan.toString()


        binding.btnGtsEnd.setOnClickListener {
            it.findNavController().navigate(R.id.action_fragmentKelima_to_fragmentKesatu)
        }
    }
}
