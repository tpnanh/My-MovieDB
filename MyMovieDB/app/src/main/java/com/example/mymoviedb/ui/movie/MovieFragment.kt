package com.example.mymoviedb.ui.movie

import android.app.ProgressDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mymoviedb.adapter.ItemClick
import com.example.mymoviedb.adapter.MovieAdapter
import com.example.mymoviedb.R
import com.example.mymoviedb.ui.home.HomeFragmentDirections

class MovieFragment : Fragment() {
    lateinit var adapter: MovieAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View = inflater!!.inflate(R.layout.fragment_movie, container, false)
        super.onViewCreated(view, savedInstanceState)

        var viewModel = ViewModelProviders.of(this).get(MovieViewModel::class.java)

        var movieGridView = view.findViewById<RecyclerView>(R.id.recycler_movie)
        movieGridView.layoutManager = GridLayoutManager(activity,3,GridLayoutManager.VERTICAL,false)

        val progressDialog = ProgressDialog(context)
        progressDialog.setMessage("Loading, please wait...")
        progressDialog.setCancelable(false)
        progressDialog.setCanceledOnTouchOutside(true)
        progressDialog.setInverseBackgroundForced(false)
        progressDialog.show()

        adapter = MovieAdapter(ItemClick { itemImage ->
            viewModel.onClickItem(itemImage)
        })

        movieGridView.adapter = adapter

        viewModel.getPopular.observe(viewLifecycleOwner, Observer { it ->
            adapter.submitList(it)
            adapter.notifyDataSetChanged()
            progressDialog.dismiss()
        })

        viewModel.navigateToDetail.observe(this, Observer { it ->
            it?.let{
                this.findNavController().navigate(
                    HomeFragmentDirections.actionHomeFragmentToDetailMovieFragment(
                        it.id
                    )
                )
                viewModel.onDoneClickItem()
            }
        })

        movieGridView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

                if (!recyclerView!!.canScrollVertically(1)) {
                    viewModel.onReach()
                }
            }
        })

        return view
    }

    companion object {
        fun newInstance(): MovieFragment = MovieFragment()
    }
}