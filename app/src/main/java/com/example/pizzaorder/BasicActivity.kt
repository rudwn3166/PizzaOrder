package com.example.pizzaorder

import androidx.appcompat.app.AppCompatActivity

//추상 클래스 abstract
abstract class BasicActivity :AppCompatActivity() {

    abstract val permissionlistener: PermissionListener?

    //    디스를 미리 받아두기
     val mContext =this


//    존재는 하지만 명시만 하는 함수,이벤트 처리만을 위한 함수
    abstract fun setupEvents()
    abstract fun setValuse()
}