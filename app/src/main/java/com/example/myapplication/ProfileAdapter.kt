package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemRecyclerviewBinding

class ProfileAdapter(val profileList : ArrayList<Profiles>) : RecyclerView.Adapter<ProfileAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return Holder(binding)
    }

    override fun getItemCount() = profileList.size




    override fun onBindViewHolder(holder: Holder, position: Int) {
        //1. 사용할 데이터를 꺼내고
        val profiles = profileList.get(position)

        //2. 홀더에 데이터를 전달
        holder.setProfiles(profiles)
    }
    class Holder(private val binding:ItemRecyclerviewBinding): RecyclerView.ViewHolder(binding.root){
        fun setProfiles(profiles: Profiles) {
            with(binding){
                //diary.imageAlpha = "${profiles.profile}"
                diaryname.text = profiles.name
                diarycontents.text = profiles.content
            }
        }
        //3. 받은 데이터를 화면에 출력
    }
}