package com.example.pizzaorder.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pizzaorder.R

class PizzaStoreListFragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        인플레이터는 xml을 객체화 시켜주는 기능능
       return inflater.inflate(R.layout.fragment_pizza_store_list,container,false)
        
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        
//        동작 관련 코드
    }

}