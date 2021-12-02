package com.example.pizzaorder.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.pizzaorder.R
import com.example.pizzaorder.datas.Store

class PizzaStoreAdapter(val mContext :Context,
                        val resId : Int,
                        val mList : List<Store>) : ArrayAdapter<Store>(mContext,resId,mList) {

                            val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if(tempRow == null){
            tempRow = inf.inflate(R.layout.pizza_store_listitem,null)

        }

        val row = tempRow!!
        val data = mList[position]
        val storeNametxt = row.findViewById<TextView>(R.id.storeNametxt)
        val logoImg=row.findViewById<ImageView>(R.id.logoImg)

        Glide.with(mContext).load(data.logoURL).into(logoImg)
        storeNametxt.text=data.name


        return row
    }
}