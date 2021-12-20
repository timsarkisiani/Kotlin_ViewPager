package ge.tim.sarkisiani.davaleba6.view_pager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import ge.tim.sarkisiani.davaleba6.view_pager.adapters.ViewPagerFragmentAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var TabLayout: TabLayout
    private lateinit var ViewPager2: ViewPager2
    private lateinit var ViewPagerFragmentAdapter: ViewPagerFragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TabLayout = findViewById(R.id.TabLayout)
        ViewPager2 = findViewById(R.id.ViewPager)
        ViewPagerFragmentAdapter = ViewPagerFragmentAdapter(this)
        ViewPager2.adapter = ViewPagerFragmentAdapter
        TabLayoutMediator(TabLayout, ViewPager2) {tab, position ->
            tab.text = "tab ${position + 1}"
        }.attach()
    }
}