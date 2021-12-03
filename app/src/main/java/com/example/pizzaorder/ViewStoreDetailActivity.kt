package com.example.pizzaorder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.pizzaorder.datas.Store
import kotlinx.android.synthetic.main.activity_view_store_detail.*

class ViewStoreDetailActivity : BasicActivity() {

    lateinit var mStoreData : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)

        setupEvents()
        setValuse()
    }

    override fun setupEvents() {

    }

    override fun setValuse() {

        mStoreData = intent.getSerializableExtra("storeData") as Store
        Glide.with(mContext).load(mStoreData.logoURL).into(storeLogoImg)

        storePhoneNumTxt.text = mStoreData.phoneNum
        storeNametxt.text=mStoreData.name

    }


}