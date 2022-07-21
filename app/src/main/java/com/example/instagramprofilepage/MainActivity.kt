package com.example.instagramprofilepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramprofilepage.adapter.StoryAdapter
import com.example.instagramprofilepage.dataClass.StoryData
import com.example.instagramprofilepage.fragment.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {



    lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(HomeFragment())


        bottomNav = findViewById(R.id.bottomNav) as BottomNavigationView
        bottomNav.setOnNavigationItemReselectedListener {

            when (it.itemId) {

                R.id.menu_home -> {
                    loadFragment(HomeFragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.menu_search -> {
                    loadFragment(Search1Fragment())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.menu_add -> {
                    loadFragment(PostFragment())
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
       // transaction.addToBackStack(null)
        transaction.commit()
    }


}