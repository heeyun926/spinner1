package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemRecyclerviewBinding

class ProfileAdapter(val profileList : ArrayList<Profiles>) : RecyclerView.Adapter<ProfileAdapter.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding =
            ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding, parent.context)
    }


    override fun getItemCount() = profileList.size


    override fun onBindViewHolder(holder: Holder, position: Int) {
        //1. 사용할 데이터를 꺼내고
        val profiles = profileList.get(position)

        //2. 홀더에 데이터를 전달
        holder.setProfiles(profiles)
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            ContextCompat.startActivity(holder.itemView.context, intent, null)
        }

    }

    class Holder(private val binding: ItemRecyclerviewBinding, val context: Context) :
        RecyclerView.ViewHolder(binding.root) {
        fun setProfiles(profiles: Profiles) {
            with(binding) {
                diary.setImageDrawable(profiles.profile)
                //(context.getDrawable(R.drawable.ic_white))
                diaryname.text = profiles.name
                diarycontents.text = profiles.content

            }
            binding.root.setOnClickListener {
                Intent(context, DetailActivity::class.java).apply {

                }

            }

        }
        //3. 받은 데이터를 화면에 출력
        //클릭리스너 선언


        //클릭리스너 등록 매소드


    }
}