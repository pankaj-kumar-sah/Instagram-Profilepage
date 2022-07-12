package com.example.instagramprofilepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramprofilepage.Adapter.StoryAdapter
import com.example.instagramprofilepage.DataClass.StoryData
import com.example.instagramprofilepage.Fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView1: RecyclerView
    private lateinit var storyList: ArrayList<StoryData>
    private lateinit var storyAdapter : StoryAdapter

    lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        loadFragment(HomeFragment())


        bottomNav = findViewById(R.id.bottomNav) as BottomNavigationView
        bottomNav.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.menu_home -> {
                    loadFragment(HomeFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.menu_search -> {
                    loadFragment(SearchFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.menu_add -> {
                    loadFragment(AddFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.menu_message -> {
                    loadFragment(MessageFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.menu_profile -> {
                    loadFragment(ProfileFragment())
                    return@setOnNavigationItemReselectedListener
                }
            }
        }
    }
    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun init()
    {
        recyclerView1 = findViewById(R.id.recyclerView1)
        recyclerView1.setHasFixedSize(true)
        recyclerView1.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        storyList = ArrayList()

        addDataToList()

        storyAdapter= StoryAdapter(storyList)
        recyclerView1.adapter = storyAdapter

    }
    private fun addDataToList(){
        storyList.add(StoryData(R.drawable.panku,"My vlog"))
        storyList.add(StoryData(R.drawable.panku,"My vlog"))
        storyList.add(StoryData(R.drawable.panku,"My vlog"))
        storyList.add(StoryData(R.drawable.panku,"My vlog"))
        storyList.add(StoryData(R.drawable.panku,"My vlog"))


    }
}