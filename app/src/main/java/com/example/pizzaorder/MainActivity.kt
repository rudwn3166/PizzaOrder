package com.example.pizzaorder

import android.os.BaseBundle
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : BasicActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValuse()
    }
    override fun setupEvents() {
//        버튼 클릭등의 이벤트 관련 코드 모음
    }

    override fun setValuse() {
//        화면에 데이터를 표시하기 위한 코드 모음
        
    }

  
}