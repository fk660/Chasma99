package com.example.chashma99com.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.navigateUp
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.chashma99com.R
import com.example.chashma99com.databinding.FragmentHomieBinding

class HomieFragment : Fragment() {
    private lateinit var binding: FragmentHomieBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomieBinding.inflate(inflater, container, false)
        return binding.root
    }


        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            binding.cartyFragment.setOnClickListener {

              findNavController().navigate(R.id.action_homie_to_cartFragment)
       }
//
//            binding.prodclick.setOnClickListener {
//                findNavController().navigate(R.id.action_homie_to_productFragment)
//            }

            //Image Slider
            val imageSlider = binding.imageSliderr
            val imageList = ArrayList<SlideModel>()

            imageList.add(SlideModel("https://chasma.nextindiainitiative.com/wp-content/uploads/2022/12/banner1-scaled.jpg"))
            imageList.add(SlideModel("https://chasma.nextindiainitiative.com/wp-content/uploads/2022/12/banner2-scaled.jpg"))
            imageList.add(SlideModel("https://chasma.nextindiainitiative.com/wp-content/uploads/2022/12/banner3-scaled.jpg"))
            imageList.add(SlideModel("https://chasma.nextindiainitiative.com/wp-content/uploads/2022/12/banner4-scaled.jpg"))

            imageSlider.setImageList(imageList, ScaleTypes.FIT)

        }
}



