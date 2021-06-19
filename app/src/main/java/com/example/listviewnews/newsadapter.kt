package com.example.listviewnews

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import java.security.AccessControlContext
import java.util.*

class newsadapter : BaseAdapter{

    var layoutId :Int =0
    lateinit var datalist: ArrayList<news>
    lateinit var context: Context

    constructor(layoutId: Int, datalist: ArrayList<news>, context: Context) {
        this.layoutId = layoutId
        this.datalist = datalist
        this.context = context
    }

    override fun getCount(): Int {
        return datalist.size
    }

    override fun getItem(position: Int): Any {
        return datalist.get(position)
    }

    override fun getItemId(position: Int): Long {

        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        if (convertView==null) {

            val infalter = LayoutInflater.from(context)
            val v = infalter.inflate(layoutId, null)

            val newsimageView =v.findViewById<ImageView>(R.id.newsimageView)
            val titletextView =v.findViewById<TextView>(R.id.titletextView)
            val dateTextView =v.findViewById<TextView>(R.id.datetextView2)
            val deleteBtu = v.findViewById<ImageButton>(R.id.deleteimageButton)

            val holder = ListViewHolder()
            holder.newsimageView=newsimageView
            holder.titletextView=titletextView
            holder.dateTextView=dateTextView
            holder.deleteBtu=deleteBtu

            v.setTag(holder)

            populateDataForView(v,position)
            return v

        }else{
            //val holder =convertView.getTag()as ListViewHolder
            populateDataForView(convertView,position)
            return convertView

        }

    }

    fun populateDataForView(v:View,position: Int):Unit{
        val holder =v.getTag()as ListViewHolder
       holder.deleteBtu.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {

                val dialogBuilder =  AlertDialog.Builder(context)
                dialogBuilder.setTitle("confirmation Doalog")
                dialogBuilder.setMessage("Are you sure you want to delete")
                dialogBuilder.setIcon(R.drawable.delete)
                dialogBuilder.setPositiveButton("Ok",object:DialogInterface.OnClickListener{
                    override fun onClick(dialog: DialogInterface?, which: Int) {
                        datalist.removeAt(position)
                        notifyDataSetChanged()

                    }
                })

                dialogBuilder.setNegativeButton("Cancel",object :DialogInterface.OnClickListener{
                    override fun onClick(dialog: DialogInterface?, which: Int) {

                        dialog?.dismiss()
                    }
                })

                dialogBuilder.setNeutralButton("Do Nothing",object :DialogInterface.OnClickListener{
                    override fun onClick(dialog: DialogInterface?, which: Int) {

                    }
                })

                val dialog=   dialogBuilder.create()
                dialog.show()
                dialog.setCanceledOnTouchOutside(false)
            }
        })


        val news =datalist.get(position)
       holder.newsimageView.setImageResource(news.photo)
       holder.titletextView.setText(news.title)
       holder.dateTextView.setText(news.publishDate)

    }

     class ListViewHolder{
         lateinit var newsimageView:ImageView
         lateinit var titletextView:TextView
         lateinit var dateTextView:TextView
         lateinit var deleteBtu:ImageButton


     }
}