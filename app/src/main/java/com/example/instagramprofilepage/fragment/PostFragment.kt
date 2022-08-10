package com.example.instagramprofilepage.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramprofilepage.R
import com.example.instagramprofilepage.dataClass.PostData
import com.example.instagramprofilepage.fragmentAdapter.PostAdapter


class PostFragment : Fragment() {

    private lateinit var recyclerView_post : RecyclerView
    private lateinit var postAdapter: PostAdapter
    private var postList = mutableListOf<PostData>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_post, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView_post = view.findViewById(R.id.recyclerView_post)
        recyclerView_post.layoutManager = GridLayoutManager(context, 4)
        postAdapter = PostAdapter(context)




        recyclerView_post.adapter = postAdapter

        postList.add(PostData(R.drawable.profile6))
        postList.add(PostData(R.drawable.profile7))
        postList.add(PostData(R.drawable.peacock))
        postList.add(PostData(R.drawable.test_c))
        postList.add(PostData(R.drawable.test_d))
        postList.add(PostData(R.drawable.test_a))
        postList.add(PostData(R.drawable.profile3))
        postList.add(PostData(R.drawable.profile9))
        postList.add(PostData(R.drawable.profile5))


        postAdapter.setPostList(postList)

    }

   }