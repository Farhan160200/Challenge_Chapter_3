package com.farhanfarkaann.challengechapter3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.navArgs
import androidx.navigation.findNavController
import com.farhanfarkaann.challengechapter3.databinding.FragmentKetigaBinding


class FragmentKetiga : Fragment() {
    private lateinit var binding: FragmentKetigaBinding

    val args: FragmentKetigaArgs by navArgs()

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
        val nameNama = args.myName
        val nameOne = Bundle()
        nameOne.putString("nameNama", args.myName)
        binding.tvName.text = nameNama


        val bundle = this.arguments
        val nama = bundle?.getString(FragmentKeempat.NAMA)
        val usia = bundle?.getInt(FragmentKeempat.USIA)
        val alamat = bundle?.getString(FragmentKeempat.ALAMAT)
        val pekerjaan = bundle?.getString(FragmentKeempat.PEKERJAAN)

        if (bundle != null) {
            run {
            binding.tvName.text = nama.toString()
            binding.tvUsia.text = usia.toString()
            binding.tvAlamat.text = alamat.toString()
            binding.tvPekerjaan.text = pekerjaan.toString()
        }
            binding.tvName.text = args.myName

    }else {
            run {
                binding.tvName.text = args.myName
            }
        }


        binding.btnGts4.setOnClickListener {
//                it.findNavController().navigate(R.id.action_fragmentKetiga_to_fragmentKeempat)

            it.findNavController().navigate(R.id.action_fragmentKetiga_to_fragmentKeempat,  nameOne )

            }

        }

    }
