package com.example.instagramprofilepage.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramprofilepage.dataClass.HomeData
import com.example.instagramprofilepage.fragmentAdapter.HomeAdapter
import com.example.instagramprofilepage.R
import com.example.instagramprofilepage.adapter.ProfileStoryAdapter
import com.example.instagramprofilepage.adapter.StoryAdapter
import com.example.instagramprofilepage.dataClass.ProfileStoryData
import com.example.instagramprofilepage.dataClass.StoryData


class HomeFragment : Fragment() {

    private lateinit var recyclerView_home_story: RecyclerView
    private lateinit var profilestoryList: ArrayList<ProfileStoryData>
    private lateinit var profilestoryAdapter : ProfileStoryAdapter


    private lateinit var recyclerView_home_pic : RecyclerView
    private lateinit var homeAdapter: HomeAdapter
    private var dataList = mutableListOf<HomeData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        // recyclerview 2
        recyclerView_home_pic = view.findViewById(R.id.recyclerView_home_pic)
        recyclerView_home_pic.layoutManager = GridLayoutManager(context, 1)
        homeAdapter = HomeAdapter(context)

        recyclerView_home_pic.adapter = homeAdapter

        dataList.add(HomeData(R.drawable.profile3,"89 Likes"))
        dataList.add(HomeData(R.drawable.profile4,"350 Likes"))
        dataList.add(HomeData(R.drawable.profile5,"18.4k Likes"))
        dataList.add(HomeData(R.drawable.profile6,"35 Likes"))
        dataList.add(HomeData(R.drawable.profile7,"90 Likes"))
        dataList.add(HomeData(R.drawable.profile3,"50 Likes"))
        dataList.add(HomeData(R.drawable.profile4,"3890 Likes"))


        homeAdapter.setDataList(dataList)
     // recyclerview1

        recyclerView_home_story = view.findViewById(R.id.recyclerView_home_story)
        recyclerView_home_story.setHasFixedSize(true)
        recyclerView_home_story.layoutManager = LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
        profilestoryList = ArrayList()

        addDataToList()

        profilestoryAdapter= ProfileStoryAdapter(profilestoryList)
        recyclerView_home_story.adapter = profilestoryAdapter


        return view

    }


    private fun addDataToList(){
        profilestoryList.add(ProfileStoryData(R.drawable.profile9,"subh_82"))
        profilestoryList.add(ProfileStoryData(R.drawable.profile5,"anu_pam"))
        profilestoryList.add(ProfileStoryData(R.drawable.profile4,"ram_krishna"))
        profilestoryList.add(ProfileStoryData(R.drawable.profile7,"buccha_01"))
        profilestoryList.add(ProfileStoryData(R.drawable.profile3,"honey01"))
        profilestoryList.add(ProfileStoryData(R.drawable.profile6,"subh_82"))
        profilestoryList.add(ProfileStoryData(R.drawable.panku,"anu_pam"))
        profilestoryList.add(ProfileStoryData(R.drawable.test_a,"ram_krishna"))
        profilestoryList.add(ProfileStoryData(R.drawable.test_c,"buccha_01"))
        profilestoryList.add(ProfileStoryData(R.drawable.test_d,"honey01"))



    }


}

