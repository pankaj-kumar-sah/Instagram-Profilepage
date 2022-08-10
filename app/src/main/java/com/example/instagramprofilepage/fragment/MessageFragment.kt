package com.example.instagramprofilepage.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramprofilepage.R
import com.example.instagramprofilepage.adapter.StoryAdapter
import com.example.instagramprofilepage.dataClass.MessageData
import com.example.instagramprofilepage.dataClass.StoryData
import com.example.instagramprofilepage.fragmentAdapter.MessageAdapter

class MessageFragment : Fragment() {

    private lateinit var recyclerView_message: RecyclerView
    private lateinit var messageList: ArrayList<MessageData>
    private lateinit var messageAdapter : MessageAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_message, container, false)
        recyclerView_message = view.findViewById(R.id.recyclerView_message)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()

    }

    private fun init()
    {
        recyclerView_message.setHasFixedSize(true)
        recyclerView_message.layoutManager = LinearLayoutManager(context,RecyclerView.VERTICAL,false)
        messageList = ArrayList()

        addDataToList()

        messageAdapter= MessageAdapter(messageList)
        recyclerView_message.adapter = messageAdapter

    }

    private fun addDataToList() {
        messageList.add(MessageData(R.drawable.profile3,"govinda","seen 4hr",R.drawable.ic_photo_camera))
        messageList.add(MessageData(R.drawable.test_a,"salman","1 hr ago",R.drawable.ic_photo_camera))
        messageList.add(MessageData(R.drawable.test_d,"giraffe","seen 2hr",R.drawable.ic_photo_camera))
        messageList.add(MessageData(R.drawable.profile9,"Lionking","sent 2 hr ago",R.drawable.ic_photo_camera))
        messageList.add(MessageData(R.drawable.panku,"hanuman","seen 1hr",R.drawable.ic_photo_camera))
        messageList.add(MessageData(R.drawable.profile5,"bhaiyaji","seen 1hr",R.drawable.ic_photo_camera))
        messageList.add(MessageData(R.drawable.profile6,"Abhishek","seen 4hr",R.drawable.ic_photo_camera))
        messageList.add(MessageData(R.drawable.profile7,"Dhiraj","4 hr ago",R.drawable.ic_photo_camera))
        messageList.add(MessageData(R.drawable.profile3,"Rounak","2 hr ago",R.drawable.ic_photo_camera))
        messageList.add(MessageData(R.drawable.profile6,"Buccha","seen 1hr",R.drawable.ic_photo_camera))
        messageList.add(MessageData(R.drawable.test_c,"Raju","seen 1hr",R.drawable.ic_photo_camera))
        messageList.add(MessageData(R.drawable.test_d,"Hangama","seen 1hr",R.drawable.ic_photo_camera))

    }


}