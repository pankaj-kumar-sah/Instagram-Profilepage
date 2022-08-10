package com.example.instagramprofilepage.fragmentAdapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramprofilepage.R
import com.example.instagramprofilepage.dataClass.PostData

class PostAdapter(var context: Context?) : RecyclerView.Adapter<PostAdapter.ViewHolder>() {

    var postList = emptyList<PostData>()

   internal fun setPostList(postList: List<PostData>){
       this.postList = postList
        notifyDataSetChanged()
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var postImage : ImageView
        init {
            postImage = itemView.findViewById(R.id.postImageID)
        }


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.post_row,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostAdapter.ViewHolder, position: Int) {
        var data = postList[position]

        holder.postImage.setImageResource(data.postImage)
    }

    override fun getItemCount(): Int {
        return postList.size
    }
}