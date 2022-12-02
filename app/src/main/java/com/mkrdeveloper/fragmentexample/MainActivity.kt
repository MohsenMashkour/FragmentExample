package com.mkrdeveloper.fragmentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        val txt1 = findViewById<TextView>(R.id.txt1)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)


        val edt1 = findViewById<EditText>(R.id.edt1)

        /*supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment)
            commit()

                //txt1.visibility = INVISIBLE
        }

         */


        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firstFragment)
                addToBackStack(null)
                commit()

                //txt1.visibility = INVISIBLE
            }
        }

        btn2.setOnClickListener {

            val bundle = Bundle()

            bundle.putString("String",edt1.text.toString())

            secondFragment.arguments = bundle



            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, secondFragment)
                addToBackStack(null)
                commit()

                //txt1.visibility = INVISIBLE
            }
        }

    }
}