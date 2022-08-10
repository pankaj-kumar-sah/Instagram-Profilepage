package com.example.instagramprofilepage.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.bumptech.glide.Glide.init
import com.example.instagramhomepage.fragments.PlayFragment
import com.example.instagramhomepage.fragments.ReelFragment
import com.example.instagramhomepage.fragments.TaggedFragment
import com.example.instagramhomepage.fragments.adapters.ViewPagerAdapter
import com.example.instagramprofilepage.R
import com.example.instagramprofilepage.adapter.ProfileStoryAdapter
import com.example.instagramprofilepage.adapter.StoryAdapter
import com.example.instagramprofilepage.dataClass.ProfileStoryData
import com.example.instagramprofilepage.dataClass.StoryData
import com.google.android.material.tabs.TabLayout

class ProfileFragment : Fragment() {

    private lateinit var recyclerView1: RecyclerView
    private lateinit var profileStoryList: ArrayList<ProfileStoryData>
    private lateinit var profileStoryAdapter: ProfileStoryAdapter
    private lateinit var viewPager: ViewPager
    private lateinit var tabs: TabLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        recyclerView1 = view.findViewById(R.id.recyclerView1)

        viewPager = view.findViewById(R.id.viewPager)
        tabs = view.findViewById<TabLayout>(R.id.tabs)

        init()
        setUpTabs()

        return view
    }
    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(parentFragmentManager)
        adapter.addFragment(ProfileHomeFragment(),"")
        adapter.addFragment(PlayFragment(),"")
        adapter.addFragment(ReelFragment(),"")
        adapter.addFragment(TaggedFragment(),"")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_tab)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_play)
        tabs.getTabAt(2)!!.setIcon(R.drawable.ic_play_arrow)
        tabs.getTabAt(3)!!.setIcon(R.drawable.ic_person)
    }

    private fun init()
    {
       // recyclerView1 = view.findViewById(R.id.recyclerView1)
        recyclerView1.setHasFixedSize(true)
        recyclerView1.layoutManager = LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
        profileStoryList = ArrayList()

        addDataToList()

        profileStoryAdapter= ProfileStoryAdapter(profileStoryList)
        recyclerView1.adapter = profileStoryAdapter

    }
    private fun addDataToList(){
        profileStoryList.add(ProfileStoryData(R.drawable.profile9,"My vlog"))
        profileStoryList.add(ProfileStoryData(R.drawable.profile5,"My stories"))
        profileStoryList.add(ProfileStoryData(R.drawable.profile7,"My activities"))
        profileStoryList.add(ProfileStoryData(R.drawable.profile6,"My food"))
        profileStoryList.add(ProfileStoryData(R.drawable.profile3,"My vlog"))
        profileStoryList.add(ProfileStoryData(R.drawable.profile7,"My activities"))
        profileStoryList.add(ProfileStoryData(R.drawable.profile6,"My food"))
        profileStoryList.add(ProfileStoryData(R.drawable.profile3,"My vlog"))



    }

}