package com.example.pizzaorder.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pizzaorder.R
import com.example.pizzaorder.adapters.PizzaStoreAdapter
import com.example.pizzaorder.datas.Store
import kotlinx.android.synthetic.main.fragment_pizza_store_list.*

class PizzaStoreListFragment:Fragment() {

    val mPizzaStoreDataList = ArrayList<Store>()
    lateinit var mPizzaStoreAdapter : PizzaStoreAdapter

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

        mPizzaStoreDataList.add(Store("B파스타","0504-829-0724","https://cdn3.iconfinder.com/data/icons/street-food-and-food-trucker-1/64/pizza-fast-food-bake-bread-128.png"))
        mPizzaStoreDataList.add(Store("59쌀피자","0504-820-7285","https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png"))
        mPizzaStoreDataList.add(Store("반올림피자샵","032-566-3334","https://cdn3.iconfinder.com/data/icons/food-set-3/91/Food_C219-128.png"))
        mPizzaStoreDataList.add(Store("달콤팩토리","0504-920-3960","https://cdn0.iconfinder.com/data/icons/fastfood-31/64/pizza-italian-food-fast-fastfood-cheese-piece-128.png"))

        mPizzaStoreAdapter=PizzaStoreAdapter(requireContext(),R.layout.pizza_store_listitem,mPizzaStoreDataList)
        pizzaStoreListView.adapter=mPizzaStoreAdapter

    }

}