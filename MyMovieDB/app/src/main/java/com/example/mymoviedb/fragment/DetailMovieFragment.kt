package com.example.mymoviedb.fragment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.mymoviedb.R
import com.example.mymoviedb.adapter.*
import com.example.mymoviedb.apiModels.MovieById
import com.example.mymoviedb.viewModel.DetailMovieViewModel
import com.squareup.picasso.Picasso

class DetailMovieFragment : Fragment() {
    lateinit var adapter: MovieCreditAdapter

    companion object {
        fun newInstance() = DetailMovieFragment()
    }

    private lateinit var viewModel: DetailMovieViewModel
    private lateinit var movieSave: ImageButton
    private lateinit var movieBackground: ImageView
    private lateinit var movieImage : ImageView
    private lateinit var movieName: TextView
    private lateinit var movieGenre: TextView
    private lateinit var movieRate: ImageView
    private lateinit var backButton: ImageButton
    private lateinit var movieDescription: TextView
    private lateinit var movieActor: RecyclerView
    var check: Boolean = true

    lateinit var data: MovieById

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view : View = inflater.inflate(R.layout.fragment_movie_detail, container, false)

        movieSave = view.findViewById(R.id.star)
        movieBackground = view.findViewById(R.id.movie_background)
        movieImage = view.findViewById(R.id.movie_detail_image)
        movieName = view.findViewById(R.id.movie_name)
        movieGenre = view.findViewById(R.id.movie_genre)
        //movieRate = view.findViewById<ImageView>(R.id.vote_star)
        backButton = view.findViewById(R.id.button_back_movie)
        movieDescription = view.findViewById(R.id.movie_description)
        movieActor = view.findViewById(R.id.rv_movie_cast)
        movieActor.layoutManager = GridLayoutManager(activity,1, GridLayoutManager.HORIZONTAL,false)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DetailMovieViewModel::class.java)

        val idItem = DetailMovieFragmentArgs.fromBundle(arguments!!).idMovie
        viewModel._idMovie.value = idItem

        adapter = MovieCreditAdapter(PeopleClick { idPeople ->
            viewModel.onClickPeople(idPeople)
        })

        movieActor.adapter = adapter

        viewModel.getMovieCredit.observe(viewLifecycleOwner, Observer { item ->
            if (item!=null){
                adapter.submitList(item)
                adapter.notifyDataSetChanged()
                viewModel.onDoneUpdateCast()
            }
        })

        viewModel.itemMovie.observe(viewLifecycleOwner, Observer { it ->
            if (it!=null){
                if (it.id == idItem){
                    data = it
                    updateDetail(it)
                    viewModel.onDoneUpdatedMovie()
                }
            }
        })

        viewModel.navigateToDetailPeople.observe(viewLifecycleOwner, Observer { it ->
            it?.let{
                this.findNavController().navigate(DetailMovieFragmentDirections.actionDetailMovieFragmentToDetailPeopleFragment(it.id))
                viewModel.onDoneClickPeople()
            }
        })
        backButton.setOnClickListener(View.OnClickListener {
            this.findNavController().popBackStack()
        })
    }

    private fun updateDetail(item: MovieById){
        var temp :String = ""
        Picasso.get().load("https://image.tmdb.org/t/p/w500"+item.backdrop_path)
            .into(movieBackground)
        Picasso.get().load("https://image.tmdb.org/t/p/w500"+item.poster_path)
            .into(movieImage)
        movieName.text = item.title
        movieDescription.text = item.overview
        for (i in 0..item.genres.size-1){
            temp = temp + item.genres[i].name+", "
            movieGenre.text = temp
        }
        movieGenre.text = movieGenre.text.subSequence(0,movieGenre.length()-2)
        movieSave.bringToFront()
        viewModel.checkSaved.observe(viewLifecycleOwner, Observer { it->
            if (it){
                movieSave.setImageResource(R.drawable.ic_star_yellow)
            }
            else{
                movieSave.setImageResource(R.drawable.ic_star_white)
            }
        })
        movieSave.setOnClickListener(View.OnClickListener {
            //white star
            if (check){
                movieSave.setImageResource(R.drawable.ic_star_yellow)
                check = false
            }
            //yellow star
            else{
                movieSave.setImageResource(R.drawable.ic_star_white)
                check = true
            }
        })
    }

    override fun onPause() {
        super.onPause()
        //yellow star
        if (check==false){
            viewModel.saveData(data)
        }
    }


}
