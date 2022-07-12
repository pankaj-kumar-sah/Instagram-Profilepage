package com.example.instagramprofilepage.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramprofilepage.DataClass.HomeData
import com.example.instagramprofilepage.FragmentAdapter.HomeAdapter
import com.example.instagramprofilepage.R


class HomeFragment : Fragment() {
    private lateinit var recyclerView2 : RecyclerView
    private lateinit var homeAdapter: HomeAdapter
    private var dataList = mutableListOf<HomeData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        recyclerView2 = view.findViewById(R.id.recyclerView2)
        recyclerView2.layoutManager = GridLayoutManager(context, 1)
        homeAdapter = HomeAdapter(context)




        recyclerView2.adapter = homeAdapter

        dataList.add(HomeData(R.drawable.panku))
        dataList.add(HomeData(R.drawable.panku))
        dataList.add(HomeData(R.drawable.panku))
        dataList.add(HomeData(R.drawable.panku))
        dataList.add(HomeData(R.drawable.panku))
        dataList.add(HomeData(R.drawable.panku))
        dataList.add(HomeData(R.drawable.panku))
        dataList.add(HomeData(R.drawable.panku))
        dataList.add(HomeData(R.drawable.panku))

        homeAdapter.setDataList(dataList)


        return view

    }


}

