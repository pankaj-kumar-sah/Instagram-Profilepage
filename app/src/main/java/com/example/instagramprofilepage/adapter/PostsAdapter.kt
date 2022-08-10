package com.example.instagramprofilepage.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramprofilepage.R
import com.example.instagramprofilepage.dataClass.PostItem

class PostsAdapter internal constructor(
    private val context: Context,
    private val postItems: MutableList<PostItem>
) :
    RecyclerView.Adapter<PostsAdapter.ListViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val postImageView: ImageView = itemView.findViewById(R.id.imagePost)

        fun setPostImage(postItem: PostItem) {
            postImageView.setImageResource(postItem.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val itemView = inflater.inflate(R.layout.search_row, parent, false)
        return ListViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.setPostImage(postItems[position])
    }

    override fun getItemCount(): Int {
        return postItems.size
    }


}