package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemRecyclerviewBinding

class ProfileAdapter(private val profileList : ArrayList<Profiles>) : RecyclerView.Adapter<ProfileAdapter.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding, parent.context)
    }


    override fun getItemCount() = profileList.size


    override fun onBindViewHolder(holder: Holder, position: Int) {
        //1. 사용할 데이터를 꺼내고
        val profiles = profileList[position]

        //2. 홀더에 데이터를 전달
        holder.setProfiles(profiles)
        holder.itemView.setOnClickListener {

            /**Intent(context, DetailActivity::class.java).apply {
                //intent.putExtra("content", profileList.get(position).getItem_name.toString())
                putExtra("name", profileList)
                putExtra("no", 111)
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }.run{context.startActivity(this)
            }**/

            //ContextCompat.startActivity(holder.itemView.context, intent, null)
        }

    }


    inner class Holder(private val binding: ItemRecyclerviewBinding,private val context: Context) :
        RecyclerView.ViewHolder(binding.root) {
        fun setProfiles(profiles: Profiles) {
            with(binding) {
                diary.setImageDrawable(profiles.profile)
                //(context.getDrawable(R.drawable.ic_white))
                diaryname.text = profiles.name
                diarycontents.text = profiles.content

            }
            //binding.root.setOnClickListener {
                val intent = Intent(context, DetailActivity::class.java)

                    //putExtra("content",content.text.toString())
                    intent.putExtra("name",binding.diaryname.text.toString())
                    //putExtra("no", 111)
                    context.startActivity(intent)
        }




    }
        //3. 받은 데이터를 화면에 출력
        //클릭리스너 선언

        //클릭리스너 등록 매소드


    }





