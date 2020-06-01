package com.example.mymoviedb.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.mymoviedb.fragment.MovieFragment
import com.example.mymoviedb.fragment.PeopleFragment
import com.example.mymoviedb.fragment.SavedFragment
import com.example.mymoviedb.fragment.SeriesFragment

class PagerAdapter(fragmentManager: FragmentManager): FragmentStatePagerAdapter(fragmentManager){
    override fun getItem(position: Int): Fragment = when (position) {
        0 -> MovieFragment.newInstance()
        1 -> SeriesFragment.newInstance()
        2 -> SavedFragment.newInstance()
        3 -> PeopleFragment.newInstance()
        else -> null
    }!!

    override fun getPageTitle(position: Int): CharSequence = when (position) {
        0 -> "MOVIES"
        1 -> "SERIES"
        2 -> "SAVED"
        3 -> "PEOPLE"
        else -> ""
    }

    override fun getCount(): Int {
        return 4
    }


}