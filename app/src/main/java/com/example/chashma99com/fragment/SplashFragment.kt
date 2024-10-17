package com.example.chashma99com.fragment

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.chashma99com.R


class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        Handler().postDelayed({
            findNavController().navigate(R.id.action_splashFragment_to_viewPagerFragment)
//            if (onBoardingFinished()) {
//                findNavController().navigate(R.id.action_viewPagerFragment_to_loginActivity)
//                // findNavController().navigate(R.id.action_splashFragment_to_new_nav)
//            } else {
//
//            }
        }, 1000)
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    private fun onBoardingFinished(): Boolean {
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finished", false)
    }

}