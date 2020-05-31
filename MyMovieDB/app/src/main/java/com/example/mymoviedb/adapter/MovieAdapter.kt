package com.example.mymoviedb.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mymoviedb.apiModels.ResultPropertyPopularMovie
import com.example.mymoviedb.R
import com.squareup.picasso.Picasso

class MovieAdapter (val itemClick: ItemClick): ListAdapter<ResultPropertyPopularMovie,MovieViewHolder>(DataDiffUtilMovie()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder{
        return MovieViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        var item = getItem (position)
        holder.itemView.setOnClickListener {
            itemClick.onClick(item)
        }
        holder.bind(item)
    }
}

class DataDiffUtilMovie: DiffUtil.ItemCallback<ResultPropertyPopularMovie>(){
    override fun areItemsTheSame(oldItem: ResultPropertyPopularMovie, newItem: ResultPropertyPopularMovie): Boolean {
        return oldItem.id == newItem.id
    }
    override fun areContentsTheSame(oldItem: ResultPropertyPopularMovie, newItem: ResultPropertyPopularMovie): Boolean {
        return oldItem == newItem
    }
}

class MovieViewHolder(view: View): RecyclerView.ViewHolder(view){
    val titleMovie = view.findViewById<TextView>(R.id.movieTitle)
    val imageMovie = view.findViewById<ImageView>(R.id.movieImage)

    companion object{
        fun from(parent: ViewGroup): MovieViewHolder{
            val layoutInflater = LayoutInflater.from(parent.context)

            val view = layoutInflater.inflate(R.layout.movie_cart,parent,false)

            return MovieViewHolder(view)
        }
    }

    fun bind(item: ResultPropertyPopularMovie) {
        Picasso.get().load("https://image.tmdb.org/t/p/w500"+item.poster_path)
            .into(imageMovie)
        if (item.title.length>11){
            titleMovie.text=item.title.substring(0,11)+".."
        }
        else{
            titleMovie.text=item.title
        }
    }
}

class ItemClick(val clickListener: (resultPopularMovie: ResultPropertyPopularMovie) -> Unit){
    fun onClick(item: ResultPropertyPopularMovie) = clickListener(item)
}