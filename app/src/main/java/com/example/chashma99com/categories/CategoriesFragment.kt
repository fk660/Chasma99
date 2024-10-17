package com.example.chashma99com.categories

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.chashma99com.R
import kotlinx.android.synthetic.main.fragment_categories.*

class CategoriesFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_categories, container, false)
        val compterFragment = view.findViewById<ImageView>(R.id.computerFragmentt)


            compterFragment.setOnClickListener {
            findNavController().navigate(R.id.action_categoriesFragment_to_computerFragment)
        }
        return view
    }

}