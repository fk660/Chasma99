package com.example.chashma99com.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.chashma99com.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.fragment_sign_up.*

@Suppress("UNREACHABLE_CODE")
class SignUpFragment : Fragment() {

    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_up, container, false)

        firebaseAuth = FirebaseAuth.getInstance()

        buttoNn.setOnClickListener {
            val email = editText.text.toString()
            val pass = editText2.text.toString()
            val reEnterpass = editText3.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty() && reEnterpass.isNotEmpty()) {
                if (pass == reEnterpass) {
                    firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                        if (it.isSuccessful) {
                            //  findNavController().navigate(R.id.action_signUpFragment_to_loginFragment)
                        } else {
                            Toast.makeText(
                                requireContext(),
                                it.exception.toString(),
                                Toast.LENGTH_SHORT
                            )
                                .show()
                        }
                    }
                } else {
                    Toast.makeText(requireContext(), "Password is not matching", Toast.LENGTH_SHORT)
                        .show()
                }
            } else {
                Toast.makeText(
                    requireContext(),
                    "Empty Fields Are Not Allowed !!",
                    Toast.LENGTH_SHORT
                )
                    .show()
            }
        }
    }

}
