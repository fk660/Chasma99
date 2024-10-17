package com.example.chashma99com.onBoarding.screen

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.chashma99com.R
import kotlinx.android.synthetic.main.fragment_first_screen.view.*
import kotlinx.android.synthetic.main.fragment_second_screen.view.*
import kotlinx.android.synthetic.main.fragment_third_screen.view.*


class ThirdScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view = inflater.inflate(R.layout.fragment_third_screen, container, false)
        val viewPager =  activity?.findViewById<ViewPager2>(R.id.viewPager)

        view.finish.setOnClickListener {
         findNavController().navigate(R.id.action_viewPagerFragment_to_loginActivity)
            onBoardingFinished()
        }
        return view
    }

    private fun onBoardingFinished(){
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished", true)
        editor.apply()
    }
}

