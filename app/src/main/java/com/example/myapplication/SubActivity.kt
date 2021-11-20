package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySubBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //1.데이터 생성 OR 불러오기 - Profiles데이터를 담을 리스트 생성
        val list = ArrayList<Profiles>()
        list.add(Profiles(getDrawable(R.drawable.ic_white)!!, "1", "ah"))
        list.add(Profiles(getDrawable(R.drawable.ic_beige)!!, "2", "ah"))
        list.add(Profiles(getDrawable(R.drawable.ic_mint)!!, "3", "ah"))
        list.add(Profiles(getDrawable(R.drawable.ic_black)!!, "4", "ah"))

        //2. 어댑터 생성
        val adapter = ProfileAdapter(list)
        //3. 화면의 리사이클러뷰와 연결
        binding.recyclerView.adapter = adapter


    }
}

