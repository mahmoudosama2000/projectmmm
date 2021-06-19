package com.example.listviewnews

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_deteils_.*

class deteils_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deteils_)

        if (intent.hasExtra("desc")&& intent.hasExtra("link")){

            val desc = intent.getStringExtra("desc")
            val link = intent.getStringExtra("link")
            descTV.setText(desc)
            linkBut.setOnClickListener(object :View.OnClickListener{
                override fun onClick(v: View?) {

                    val i = Intent(Intent.ACTION_VIEW)
                    i.setData(Uri.parse(link))
                    startActivity(i)

                }
                })

        }
    }
}
