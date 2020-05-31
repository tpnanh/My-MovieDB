package com.example.mymoviedb.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mymoviedb.viewModel.SeriesViewModel
import com.example.mymoviedb.adapter.ItemClickSeries
import com.example.mymoviedb.adapter.SeriesAdapter
import com.example.mymoviedb.R

class SeriesFragment : Fragment() {
    lateinit var adapterSeries: SeriesAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?  {
        var view: View = inflater!!.inflate(R.layout.fragment_series, container, false)

        var viewModelSeries = ViewModelProviders.of(this).get(SeriesViewModel::class.java)

        adapterSeries = SeriesAdapter(ItemClickSeries { itemImage ->
            viewModelSeries.onClickItem(itemImage)
        })

        var seriesGridView = view.findViewById<RecyclerView>(R.id.recycler_series)
        seriesGridView.layoutManager = GridLayoutManager(activity, 3, GridLayoutManager.VERTICAL, false)
        seriesGridView.adapter = adapterSeries

        viewModelSeries.getPopularSeries.observe(viewLifecycleOwner, Observer { it ->
            adapterSeries.submitList(it)
            adapterSeries.notifyDataSetChanged()
        })

        viewModelSeries.navigateToDetailSeries.observe(this, Observer { it ->
            it?.let{
                Toast.makeText(context,it.name, Toast.LENGTH_LONG).show()
                viewModelSeries.onDoneClickItem()
            }

        })

        seriesGridView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

                if (!recyclerView!!.canScrollVertically(1)) {
                    viewModelSeries.onReachBottomSeries()
                }
            }
        })
        return view
    }
    companion object {
        fun newInstance(): SeriesFragment = SeriesFragment()
    }

}