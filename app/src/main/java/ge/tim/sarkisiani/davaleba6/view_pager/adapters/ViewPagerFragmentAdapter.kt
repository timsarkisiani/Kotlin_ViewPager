package ge.tim.sarkisiani.davaleba6.view_pager.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import ge.tim.sarkisiani.davaleba6.view_pager.fragments.FragmentFirst
import ge.tim.sarkisiani.davaleba6.view_pager.fragments.FragmentSecond
import ge.tim.sarkisiani.davaleba6.view_pager.fragments.FragmentThird

class ViewPagerFragmentAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> FragmentFirst()
            1-> FragmentSecond()
            2-> FragmentThird()
            else->FragmentFirst()
        }
    }
}