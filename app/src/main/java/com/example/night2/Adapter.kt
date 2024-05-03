package com.example.night2

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.night2.databinding.RowTakipBinding


class Adapter(val list:ArrayList<Info>):RecyclerView.Adapter<Adapter.MyView>() {

    inner class MyView(val itemBinding: RowTakipBinding):RecyclerView.ViewHolder(itemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyView {

        val binding = RowTakipBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyView(binding)
    }

    override fun getItemCount():Int{
        return list.size
    }



    override fun onBindViewHolder(holder: MyView, position: Int) {
        val cicekAdi = list[position]
        val cicekInfo = list[position]

        holder.itemBinding.textView.text=cicekAdi.isim


        holder.itemBinding.imageview.setImageResource(list[position].resim)

        holder.itemView.setOnClickListener(){

            val Intent= Intent(holder.itemView.context,tanitimActivity::class.java)
            Intent.putExtra("CICEK_ADI", cicekAdi.isim)
            Intent.putExtra("CICEK_INFO", cicekInfo.hakkinda)
            holder.itemView.context.startActivity(Intent)
        }



    }
}