package com.example.chashma99com.fragment

import android.graphics.Paint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.chashma99com.R
import kotlinx.android.synthetic.main.fragment_product.*

class ProductFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product, container, false)

        strikeThrough.paintFlags = strikeThrough.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG

    }
}