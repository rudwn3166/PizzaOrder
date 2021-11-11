package com.example.pizzaorder.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.pizzaorder.fragments.ChickenStoreListFragment
import com.example.pizzaorder.fragments.PizzaStoreListFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0->"피자 가게"
            else ->"치킨 가게"
        }
    }
//       탭의 갯수가 몇개인지지
    override fun getCount(): Int {

        return 2


//    포지션 마다 어떤 탭이 나와야하는지

    }
    override fun getItem(position: Int): Fragment {
        return when(position) {

            0->PizzaStoreListFragment()
            else->ChickenStoreListFragment()

        }
    }

}