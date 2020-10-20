package com.example.mymoviedb.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mymoviedb.R
import com.example.mymoviedb.db.SavedMovieData
import com.squareup.picasso.Picasso

class SavedMovieAdapter (val movieClick: MovieClick): ListAdapter<SavedMovieData,SavedMovieViewHolder>(DataDiffUtilSavedMovie()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SavedMovieViewHolder{
        return SavedMovieViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: SavedMovieViewHolder, position: Int) {
        var item = getItem (position)
        holder.itemView.setOnClickListener {
            movieClick.onClick(item)
        }
        holder.bind(item)
    }
}

class DataDiffUtilSavedMovie: DiffUtil.ItemCallback<SavedMovieData>(){
    override fun areItemsTheSame(oldItem: SavedMovieData, newItem: SavedMovieData): Boolean {
        return oldItem.movieId == newItem.movieId
    }
    override fun areContentsTheSame(oldItem: SavedMovieData, newItem: SavedMovieData): Boolean {
        return oldItem == newItem
    }
}

class SavedMovieViewHolder(view: View): RecyclerView.ViewHolder(view){
    val savedImage = view.findViewById<ImageView>(R.id.savedImage)
    val savedTitle = view.findViewById<TextView>(R.id.savedTitle)

    companion object{
        fun from(parent: ViewGroup): SavedMovieViewHolder{
            val layoutInflater = LayoutInflater.from(parent.context)

            val view = layoutInflater.inflate(R.layout.saved_cart,parent,false)

            return SavedMovieViewHolder(view)
        }
    }

    fun bind(item: SavedMovieData) {
        Picasso.get().load("https://image.tmdb.org/t/p/w500"+item.movieImage)
            .into(savedImage)
        if (item.movieName.length>11){
            savedTitle.text=item.movieName.substring(0,11)+".."
        }
        else{
            savedTitle.text=item.movieName
        }
    }
}

class MovieClick(val clickListener: (savedMovieData: SavedMovieData) -> Unit){
    fun onClick(item: SavedMovieData) = clickListener(item)
}