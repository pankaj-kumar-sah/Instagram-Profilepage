package com.example.instagramhomepage.fragments.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramhomepage.ProfileData
import com.example.instagramhomepage.ReelData
import com.example.instagramprofilepage.R

class ReelAdapter (var context: Context?) : RecyclerView.Adapter<ReelAdapter.ViewHolder>() {

    var dataList1 = emptyList<ReelData>()

    internal fun setDataList(dataList1: List<ReelData>){
        this.dataList1 = dataList1
        notifyDataSetChanged()
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var imageMy1 : ImageView
        init {
            imageMy1 = itemView.findViewById(R.id.testImage1)
        }


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReelAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.reel_row,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReelAdapter.ViewHolder, position: Int) {
        var data = dataList1[position]

        holder.imageMy1.setImageResource(data.imageMy1)
    }

    override fun getItemCount(): Int {
        return dataList1.size
    }

}