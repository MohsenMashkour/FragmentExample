package com.mkrdeveloper.fragmentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)


        val btnFr1 = view.findViewById<Button>(R.id.btnFr1)
        val txtFr1 = view.findViewById<TextView>(R.id.txtFr1)


        btnFr1.setOnClickListener {
            txtFr1.text = "MkrDeveloper"
        }

        return view
    }

}