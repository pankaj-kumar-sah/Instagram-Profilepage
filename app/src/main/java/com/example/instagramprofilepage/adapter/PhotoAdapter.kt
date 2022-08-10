package com.example.instagramhomepage.fragments.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramhomepage.ProfileData
import com.example.instagramprofilepage.R

class PhotoAdapter(var context: Context?) : RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {

    var dataList = emptyList<ProfileData>()

    internal fun setDataList(dataList: List<ProfileData>){
        this.dataList = dataList
        notifyDataSetChanged()
    }

    class ViewHolder(itemView :View) : RecyclerView.ViewHolder(itemView){
        var imageMy : ImageView
        init {
            imageMy = itemView.findViewById(R.id.testImage)
        }


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoAdapter.ViewHolder {
      var view = LayoutInflater.from(parent.context).inflate(R.layout.photo_rows,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: PhotoAdapter.ViewHolder, position: Int) {
      var data = dataList[position]

        holder.imageMy.setImageResource(data.imageMy)
    }

    override fun getItemCount(): Int {
       return dataList.size
    }
}