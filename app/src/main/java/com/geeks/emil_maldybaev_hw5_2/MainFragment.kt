package com.geeks.emil_maldybaev_hw5_2

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.geeks.emil_maldybaev_hw5_2.data.local.Pref
import com.geeks.emil_maldybaev_hw5_2.databinding.FragmentMainBinding
import com.geeks.emil_maldybaev_hw5_2.databinding.ItemOnboardingBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnGet.setOnClickListener {
            sendData()
        }
    }

    private fun sendData() {
     /*   val bundle = Bundle()
        bundle.putString("name", binding.etFirstName.text.toString())
        bundle.putString("surname", binding.etSecondName.text.toString())*/
         val intent = Intent(requireContext(), SecondActivity::class.java)
            intent.putExtra("name", binding.etFirstName.text.toString())
            intent.putExtra("surname", binding.etSecondName.text.toString())
            startActivity(intent)
        /*
            if (pref.isShow()){
                findNavController().navigate(R.layout.fragment_main)*/
            }



}