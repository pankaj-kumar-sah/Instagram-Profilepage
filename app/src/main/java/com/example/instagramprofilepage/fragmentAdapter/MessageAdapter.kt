package com.example.instagramprofilepage.fragmentAdapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramprofilepage.R
import com.example.instagramprofilepage.adapter.StoryAdapter
import com.example.instagramprofilepage.dataClass.MessageData
import com.example.instagramprofilepage.dataClass.StoryData
import de.hdodenhof.circleimageview.CircleImageView

class MessageAdapter(private val messageList : List<MessageData>) :
    RecyclerView.Adapter<MessageAdapter.MessageViewHolder>() {

    class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val recieverprofile1 : CircleImageView = itemView.findViewById(R.id.reciever_image)
        val recievername1  : TextView = itemView.findViewById(R.id.reciever_name)
        val recieverLseen1  : TextView = itemView.findViewById(R.id.reciever_last_seen)
        val photoclicker1  : ImageView = itemView.findViewById(R.id.photo_clicker)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.message_row,parent,false)
        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = messageList[position]
        holder.recieverprofile1.setImageResource(message.recieverImage)
        holder.recievername1.text = message.recievername
        holder.recieverLseen1.text = message.recieverLseen
        holder.photoclicker1.setImageResource(message.cameraImage)

    }

    override fun getItemCount(): Int {
        return messageList.size
    }
}
