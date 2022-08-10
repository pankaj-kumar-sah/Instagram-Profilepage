package com.example.instagramprofilepage.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramhomepage.ProfileData
import com.example.instagramhomepage.fragments.adapters.PhotoAdapter
import com.example.instagramprofilepage.R

class ProfileHomeFragment : Fragment() {

   private lateinit var recyclerView2 : RecyclerView
   private lateinit var photoAdapter: PhotoAdapter
   private var dataList = mutableListOf<ProfileData>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_profile_home, container, false)

        recyclerView2 = view.findViewById(R.id.recyclerView2)
        recyclerView2.layoutManager = GridLayoutManager(context, 3)
        photoAdapter = PhotoAdapter(context)




        recyclerView2.adapter = photoAdapter

        dataList.add(ProfileData(R.drawable.profile6))
        dataList.add(ProfileData(R.drawable.profile9))
        dataList.add(ProfileData(R.drawable.profile3))
        dataList.add(ProfileData(R.drawable.profile4))
        dataList.add(ProfileData(R.drawable.profile6))
        dataList.add(ProfileData(R.drawable.profile7))
        dataList.add(ProfileData(R.drawable.profile4))
        dataList.add(ProfileData(R.drawable.test_a))
        dataList.add(ProfileData(R.drawable.test_c))

        photoAdapter.setDataList(dataList)


        return view

    }


}