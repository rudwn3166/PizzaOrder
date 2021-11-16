package com.example.pizzaorder.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
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
        return row
    }
}