package com.example.instagramprofilepage.FragmentAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramprofilepage.DataClass.HomeData
import com.example.instagramprofilepage.R

class HomeAdapter(var context: Context?) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    var dataList = emptyList<HomeData>()

    internal fun setDataList(dataList: List<HomeData>){
        this.dataList = dataList
        notifyDataSetChanged()
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var imageMy : ImageView
        init {
            imageMy = itemView.findViewById(R.id.testImage)
        }


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.home_row,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeAdapter.ViewHolder, position: Int) {
        var data = dataList[position]

        holder.imageMy.setImageResource(data.imageMy)
    }

    override fun getItemCount(): Int {
        return dataList.size 
    }

}