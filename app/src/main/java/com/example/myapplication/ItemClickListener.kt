package com.example.myapplication

import android.view.View

interface ItemClickListener{
    //클릭 인터페이스 정의
        fun onClick(view: View, position: Int)

}
