package com.example.instagramhomepage.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramhomepage.ProfileData
import com.example.instagramhomepage.ReelData
import com.example.instagramhomepage.fragments.adapters.PhotoAdapter
import com.example.instagramhomepage.fragments.adapters.ReelAdapter
import com.example.instagramprofilepage.R


class ReelFragment : Fragment() {
    private lateinit var recyclerView3 : RecyclerView
    private lateinit var reelAdapter: ReelAdapter
    private var dataList1 = mutableListOf<ReelData>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_reel, container, false)


        recyclerView3 = view.findViewById(R.id.recyclerView3)
        recyclerView3.layoutManager = GridLayoutManager(context, 3)
        reelAdapter = ReelAdapter(context)




        recyclerView3.adapter = reelAdapter

        dataList1.add(ReelData(R.drawable.profile4))
        dataList1.add(ReelData(R.drawable.profile7))
        dataList1.add(ReelData(R.drawable.profile9))
        dataList1.add(ReelData(R.drawable.profile5))
        dataList1.add(ReelData(R.drawable.test_a))
        dataList1.add(ReelData(R.drawable.test_c))
        dataList1.add(ReelData(R.drawable.test_d))
        dataList1.add(ReelData(R.drawable.profile6))
        dataList1.add(ReelData(R.drawable.profile3))

        reelAdapter.setDataList(dataList1)

        return view

    }

}