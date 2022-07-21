package com.example.instagramprofilepage.fragmentAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramprofilepage.dataClass.HomeData
import com.example.instagramprofilepage.R

class HomeAdapter(var context: Context?) : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    var dataList = emptyList<HomeData>()

    internal fun setDataList(dataList: List<HomeData>){
        this.dataList = dataList
        notifyDataSetChanged()
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var imageMy : ImageView
        var imageMy2 : ImageView
        var imageMy3 : ImageView
        var imageMy4 : ImageView
        var imageMy5 : ImageView
        var textMy : TextView


        init {
            imageMy = itemView.findViewById(R.id.testImage)
            imageMy2 = itemView.findViewById(R.id.testImage2)
            imageMy3 = itemView.findViewById(R.id.testImage3)
            imageMy4 = itemView.findViewById(R.id.testImage4)
            imageMy5 = itemView.findViewById(R.id.testImage5)
            textMy = itemView.findViewById(R.id.testText)


        }


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.home_row,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeAdapter.ViewHolder, position: Int) {
        var data = dataList[position]

        holder.imageMy.setImageResource(data.imageMy)

        holder.textMy.text = data.textMy

    }

    override fun getItemCount(): Int {
        return dataList.size
    }

}