package com.example.pizzaorder

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.pizzaorder.datas.Store
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.normal.TedPermission
import kotlinx.android.synthetic.main.activity_view_store_detail.*
import java.util.jar.Manifest

class ViewStoreDetailActivity(override val permissionlistener: PermissionListener?) : BasicActivity() {

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

         val PermissionListener  = object  : PermissionListener{
             override fun onPermissionGranted() {
                 val myUri = Uri.parse("tel:${mStoreData.phoneNum}")
                 val myIntent =Intent(Intent.ACTION_CALL,myUri)
                 startActivity(myIntent)


             }

             override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
                 Toast.makeText(mContext, "전화 연결 권한이 없습니다", Toast.LENGTH_SHORT).show()
             }

         }

//            TedPermission.with(mContext)
//                .setPermissionListener(권한변수이름)
//                .setDeniedMessage("설정 창으로 유도하는 안내문")
//                .setPermissions(Manifest.permission.CALL_PHONE)
//            .check()

        }

    }

    override fun setValuse() {

        mStoreData = intent.getSerializableExtra("storeData") as Store
        Glide.with(mContext).load(mStoreData.logoURL).into(storeLogoImg)

        storePhoneNumTxt.text = mStoreData.phoneNum
        storeNametxt.text=mStoreData.name

    }


}