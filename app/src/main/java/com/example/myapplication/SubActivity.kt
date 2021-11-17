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
        //1.데이터 생성 OR 불러오
        val list = ArrayList<Profiles>()
        list.add(Profiles(getDrawable(R.drawable.ic_white)!!, "1", "ah"))
        list.add(Profiles(getDrawable(R.drawable.ic_beige)!!, "1", "ah"))
        list.add(Profiles(getDrawable(R.drawable.ic_mint)!!, "1", "ah"))
        list.add(Profiles(getDrawable(R.drawable.ic_black)!!, "1", "ah"))

        //2. 어댑터 생
        val adapter = ProfileAdapter(list)
        //3. 화면의 리사이클러뷰와 연
        binding.recyclerView.adapter = adapter



        fun loadData() {
            val profilesList = mutableListOf<Profiles>()
        }
    }
}

