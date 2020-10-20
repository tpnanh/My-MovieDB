package com.example.mymoviedb.ui.saved

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
import com.example.mymoviedb.R
import com.example.mymoviedb.adapter.*
import com.example.mymoviedb.ui.home.HomeFragmentDirections

class SavedFragment : Fragment() {
    private lateinit var viewModel: SavedViewModel
    lateinit var adapter: SavedMovieAdapter
    private lateinit var savedMovie: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view : View = inflater.inflate(R.layout.fragment_saved, container, false)

        savedMovie = view.findViewById(R.id.recycler_saved)
        savedMovie.layoutManager = GridLayoutManager(activity,3,GridLayoutManager.VERTICAL,false)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(SavedViewModel::class.java)

        adapter = SavedMovieAdapter(MovieClick { idMovie ->
            viewModel.onClickSavedMovie(idMovie)

        })

        savedMovie.adapter = adapter

        viewModel.allSavedMovie.observe(viewLifecycleOwner, Observer { it ->
            if (it!=null) {
                adapter.submitList(it)
                adapter.notifyDataSetChanged()
            }
        })

        viewModel.savedMovie.observe(viewLifecycleOwner, Observer { it->
            it?.let {
                this.findNavController().navigate(
                    HomeFragmentDirections.actionHomeFragmentToSavedMovieDetailFragment(
                        it.movieId
                    )
                )
                viewModel.onDoneSavedMovie()
            }
        })

    }

    companion object {
        fun newInstance(): SavedFragment = SavedFragment()
    }
}