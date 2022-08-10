package com.example.instagramprofilepage.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.instagramprofilepage.R
import com.example.instagramprofilepage.adapter.PostsAdapter
import com.example.instagramprofilepage.dataClass.PostItem

class Search1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_search1, container, false)


        val postsRecyclerView: RecyclerView = view.findViewById(R.id.postsRecyclerView)
        postsRecyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val postItems: MutableList<PostItem> = mutableListOf()

        postItems.add(PostItem(R.drawable.test_a))
        postItems.add(PostItem(R.drawable.scenary))
        postItems.add(PostItem(R.drawable.peacock))
        postItems.add(PostItem(R.drawable.profile9))
        postItems.add(PostItem(R.drawable.stunt))
        postItems.add(PostItem(R.drawable.bike))
        postItems.add(PostItem(R.drawable.sizuka))
        postItems.add(PostItem(R.drawable.profile4))


        postsRecyclerView.adapter = activity?.let { PostsAdapter(it.applicationContext,postItems) }


        return view
    }
}
