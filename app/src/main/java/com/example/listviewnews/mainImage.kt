package com.example.listviewnews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_image.*

class mainImage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_image)

        newButton.setOnClickListener(View.OnClickListener {

            val i = Intent(application,MainActivity::class.java)
            startActivity(i)
        })

        about_Pal.setOnClickListener(View.OnClickListener {

            val m = Intent(application,aboutPal::class.java)
            startActivity(m)
        })

        about_Qud.setOnClickListener(View.OnClickListener {

            val n = Intent(application,aboutQuds::class.java)
            startActivity(n)
        })

        about_shkh.setOnClickListener(View.OnClickListener {

            val v = Intent(application,aboutShkh::class.java)
            startActivity(v)
        })

       imageButton4.setOnClickListener(View.OnClickListener {

            val h = Intent(application,vedioAboutquds::class.java)
            startActivity(h)
        })
    }
    }
