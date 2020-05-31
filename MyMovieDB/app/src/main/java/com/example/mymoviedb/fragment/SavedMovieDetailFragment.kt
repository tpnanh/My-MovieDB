package com.example.mymoviedb.fragment

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.mymoviedb.R
import com.example.mymoviedb.adapter.*
import com.example.mymoviedb.apiModels.MovieById
import com.example.mymoviedb.apiModels.ResultPropertyPopularMovie
import com.example.mymoviedb.apiRepository.MovieRepository
import com.example.mymoviedb.database.SavedMovieData
import com.example.mymoviedb.viewModel.DetailMovieViewModel
import com.example.mymoviedb.viewModel.SavedMovieDetailViewModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.movie_cart.*

class SavedMovieDetailFragment : Fragment() {

    companion object {
        fun newInstance() = SavedMovieDetailFragment()
    }

    private lateinit var viewModel: SavedMovieDetailViewModel
    private lateinit var movieStar: ImageButton
    private lateinit var movieBackground: ImageView
    private lateinit var movieImage : ImageView
    private lateinit var movieName: TextView
    private lateinit var movieGenre: TextView
    private lateinit var movieRate: ImageView
    private lateinit var backButton: ImageButton
    private lateinit var movieDescription: TextView

    private lateinit var movieRemove : SavedMovieData
    var checkLike: Boolean = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view : View = inflater.inflate(R.layout.fragment_saved_movie_detail, container, false)

        movieStar = view.findViewById(R.id.save_star)
        movieBackground = view.findViewById(R.id.save_movie_background)
        movieImage = view.findViewById(R.id.save_movie_detail_image)
        movieName = view.findViewById(R.id.save_movie_name)
        movieGenre = view.findViewById(R.id.save_movie_genre)
        //movieRate = view.findViewById<ImageView>(R.id.vote_star)
        backButton = view.findViewById(R.id.save_button_back_movie)
        movieDescription = view.findViewById(R.id.save_movie_description)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SavedMovieDetailViewModel::class.java)

        val idSavedItem = SavedMovieDetailFragmentArgs.fromBundle(arguments!!).idSavedMovie
        viewModel._idSavedDetailMovie.value = idSavedItem

        viewModel.savedDetailMovie.observe(viewLifecycleOwner, Observer { it ->
            if (it!=null){
                if (it.movieId == idSavedItem){
                    movieRemove = it
                    updateDetailSavedMovie(it)
                    viewModel.onDoneUpdatedSavedMovie()
                }
            }

        })

        backButton.setOnClickListener(View.OnClickListener {
            activity?.onBackPressed()
        })
    }

    private fun updateDetailSavedMovie(item: SavedMovieData){
        Picasso.get().load("https://image.tmdb.org/t/p/w500"+item.movieBackdropPath)
            .into(movieBackground)
        Picasso.get().load("https://image.tmdb.org/t/p/w500"+item.movieImage)
            .into(movieImage)
        movieName.text = item.movieName
        movieDescription.text = item.movieOverview
        movieGenre.text = item.movieGenres
        //movieGenre.text = movieGenre.text.subSequence(0,movieGenre.length()-2)
        movieStar.bringToFront()
        movieStar.setOnClickListener(View.OnClickListener {
            //yellow star
            if (checkLike){
                movieStar.setImageResource(R.drawable.ic_star_white)
                checkLike = false
            }
            //white star
            else{
                movieStar.setImageResource(R.drawable.ic_star_yellow)
                checkLike = true
            }
        })
    }

    override fun onPause() {
        super.onPause()
        //white star
        if (checkLike==false){
            viewModel.removeSavedMovie(movieRemove.movieId)
        }
    }
}
