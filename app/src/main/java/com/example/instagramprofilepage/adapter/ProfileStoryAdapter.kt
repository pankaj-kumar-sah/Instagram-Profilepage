package com.example.instagramprofilepage.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramprofilepage.R
import com.example.instagramprofilepage.dataClass.ProfileStoryData
import com.example.instagramprofilepage.dataClass.StoryData
import de.hdodenhof.circleimageview.CircleImageView

class ProfileStoryAdapter(private val storyList : List<ProfileStoryData>) :
    RecyclerView.Adapter<ProfileStoryAdapter.StoryViewHolder>() {

    class StoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val storyImage1 : CircleImageView = itemView.findViewById(R.id.circle_image)
        val storyName1  : TextView  = itemView.findViewById(R.id.textview_1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
     val view = LayoutInflater.from(parent.context).inflate(R.layout.story_row,parent,false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
    val story = storyList[position]
        holder.storyImage1.setImageResource(story.storyImage)
        holder.storyName1.text = story.storyName
    }

    override fun getItemCount(): Int {
    return storyList.size
    }
}