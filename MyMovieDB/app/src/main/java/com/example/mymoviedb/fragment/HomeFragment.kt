package com.example.mymoviedb.fragment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toolbar
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.ViewPager
import com.example.mymoviedb.adapter.PagerAdapter
import com.example.mymoviedb.R
import com.example.mymoviedb.viewModel.HomeViewModel
import com.google.android.material.tabs.TabLayout

class HomeFragment : Fragment() {
    private lateinit var viewPager: ViewPager
    private lateinit var tabs: TabLayout

    private lateinit var movieFilter: ImageButton

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        var view : View = inflater.inflate(R.layout.home_fragment, container, false)
        movieFilter = view.findViewById(R.id.movie_filter)

        viewPager = view.findViewById(R.id.viewpager)
        tabs = view.findViewById(R.id.tabs)

        setupViewPager()
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)

        movieFilter.setOnClickListener(View.OnClickListener {
            this.findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToFilterFragment())
        })
    }

    private fun setupViewPager() {

        val adapter = PagerAdapter(childFragmentManager!!)

        viewPager.adapter = adapter

        viewPager.setOffscreenPageLimit(4)

        tabs.setupWithViewPager(viewPager)

    }

    companion object {
        fun newInstance() = HomeFragment()
    }


}
