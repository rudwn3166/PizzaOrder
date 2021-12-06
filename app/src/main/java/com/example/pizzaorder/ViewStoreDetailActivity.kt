package com.example.pizzaorder

import android.content.Intent
import android.net.Uri
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

//        여기 전화걸기 버튼이 눌리면 작동하게 되는 이벤트 작업함
        callPhoneBtn.setOnClickListener {

            val myUri = Uri.parse("tel:${mStoreData.phoneNum}")
            val myIntent =Intent(Intent.ACTION_CALL,myUri)
            startActivity(myIntent)

        }

    }

    override fun setValuse() {

        mStoreData = intent.getSerializableExtra("storeData") as Store
        Glide.with(mContext).load(mStoreData.logoURL).into(storeLogoImg)

        storePhoneNumTxt.text = mStoreData.phoneNum
        storeNametxt.text=mStoreData.name

    }


}