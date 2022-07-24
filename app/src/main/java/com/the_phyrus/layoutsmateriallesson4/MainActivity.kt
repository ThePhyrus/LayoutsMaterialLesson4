package com.the_phyrus.layoutsmateriallesson4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.the_phyrus.layoutsmateriallesson4.databinding.ActivityMainBinding
import com.the_phyrus.layoutsmateriallesson4.fragments.ConstraintFragment
import com.the_phyrus.layoutsmateriallesson4.fragments.CoordinatorFragment
import com.the_phyrus.layoutsmateriallesson4.fragments.MotionFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initBottomNavigationView()
    }

    private fun initBottomNavigationView() = with(binding) {
        bottomNaVi.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.constraint -> {
                    navigateTo(ConstraintFragment.newInstance())
                    true
                }
                R.id.coordinator -> {
                    navigateTo(CoordinatorFragment.newInstance())
                    true
                }
                R.id.motion -> {
                    navigateTo(MotionFragment.newInstance())
                    true
                }
                else -> true
            }
        }
        bottomNaVi.selectedItemId = R.id.constraint
    }

    private fun navigateTo(frag: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.container, frag).commit()
    }

}