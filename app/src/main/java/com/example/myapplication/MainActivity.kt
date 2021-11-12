package com.example.myapplication

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var data = resources.getStringArray(R.array.Color)
        // val imagedata = resources.obtainTypedArray(R.array.image_diary)
        var list = mutableListOf<Int>()

        list.add(R.drawable.ic_beige)
        list.add(R.drawable.ic_mint)

        var adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data)
        with(binding) {
            spinner.adapter = adapter

            spinner.setSelection(1) //시작 위치 지
            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {

                     val selected = data.get(position)
                     result.text = selected
                    if(position!=0){
                        imageView.setImageResource(list[position-1])
                    }


                    when(position){
                        0 -> {

                        }

                    }

                }


                override fun onNothingSelected(parent: AdapterView<*>?) {

                }

            }
        }


    }


}