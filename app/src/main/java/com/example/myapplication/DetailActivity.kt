package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity(){

    private lateinit var binding: ActivityDetailBinding


    override fun onCreate(savedInstanceState: Bundle?) {
            lateinit var datas : Profiles
            binding= ActivityDetailBinding.inflate(layoutInflater)
            super.onCreate(savedInstanceState)
            setContentView(binding.root)

        //datas =intent.getSerializableExtra("name") as Profiles
        //Glide.with(this).load(datas.name).into(binding.scroll2)

       /** if (intent.hasExtra("name")) {
            //textView.dairyname =intent.getStringExtra("name")
        } else {
            Toast.makeText(this,"no",Toast.LENGTH_SHORT).show()
        }**/

    }

}