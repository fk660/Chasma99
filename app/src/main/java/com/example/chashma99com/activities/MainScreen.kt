package com.example.chashma99com.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.chashma99com.fragment.HomieFragment
import com.example.chashma99com.fragment.ProfileFragment
import com.example.chashma99com.R
import com.example.chashma99com.fragment.WishlistrFragment
import com.example.chashma99com.categories.CategoriesFragment
import com.example.chashma99com.databinding.ActivityMainScreenBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main_screen.*

class MainScreen : AppCompatActivity() {

    private lateinit var binding: ActivityMainScreenBinding

    private fun replaceFragment(fragment:Fragment){

        val fragmentManager= supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
    }

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomieFragment())


        val drawerLayout : DrawerLayout = findViewById(R.id.drawer_layout)
        val navyView: NavigationView = findViewById(R.id.nav_view)

        binding.menuBar.setOnClickListener {
            if (drawerLayout.isDrawerVisible(GravityCompat.START)){
                drawerLayout.closeDrawer(GravityCompat.START)
            }else drawerLayout.openDrawer(GravityCompat.START)
        }
        toggle = ActionBarDrawerToggle(this,drawerLayout, R.string.open, R.string.close)

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navyView.setNavigationItemSelectedListener {

            when(it.itemId){
                R.id.nav_home -> Toast.makeText(applicationContext,"Clicked Home", Toast.LENGTH_SHORT).show()
            }
            true
        }

       fun onBackPressed() {

            if (drawerLayout.isDrawerVisible(GravityCompat.START))
               drawerLayout.closeDrawer(GravityCompat.START)
            else super.onBackPressed()
        }
        binding.bttmNav.setOnItemSelectedListener {

            when(it.itemId){
                R.id.homee -> replaceFragment(HomieFragment())
                R.id.categories -> replaceFragment(CategoriesFragment())
                R.id.wishlist -> replaceFragment(WishlistrFragment())
                R.id.profile -> replaceFragment(ProfileFragment())

                else ->{

                }
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}