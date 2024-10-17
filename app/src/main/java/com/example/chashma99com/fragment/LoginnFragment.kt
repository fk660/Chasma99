package com.example.chashma99com.fragment
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.chashma99com.R
import com.example.chashma99com.activities.MainScreen

class LoginnFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_loginn, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myButton = view?.findViewById<Button>(R.id.buttoNn)
        myButton?.setOnClickListener {
            val intent = Intent(requireContext(), MainScreen::class.java)
            intent.putExtra("message", "Hello from Fragment!")
            requireContext().startActivity(intent)


            Toast.makeText(requireContext(), "Log In Sucessfull", Toast.LENGTH_SHORT).show()
        }
    }


}

