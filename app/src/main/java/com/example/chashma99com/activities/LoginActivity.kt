package com.example.chashma99com.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.chashma99com.R
import com.example.chashma99com.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class LoginActivity : AppCompatActivity() {

    private lateinit var viewpager: ViewPager2
    private lateinit var adapter: ViewPagerAdapter
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tabLayout = findViewById(R.id.tabyy)
        viewpager = findViewById(R.id.viewpagy)

        adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)

        tabLayout.addTab(tabLayout.newTab().setText("Login"))
        tabLayout.addTab(tabLayout.newTab().setText("SignUp"))

        viewpager.adapter = adapter
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {

                if (tab != null) {
                    viewpager.currentItem = tab.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        })

        viewpager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.selectTab(tabLayout.getTabAt(position))
            }
        })

    }
}