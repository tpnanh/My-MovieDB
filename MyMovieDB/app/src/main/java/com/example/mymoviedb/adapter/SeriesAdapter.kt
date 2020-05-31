package com.example.mymoviedb.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mymoviedb.apiModels.ResultPopularSeries
import com.example.mymoviedb.R
import com.squareup.picasso.Picasso

class SeriesAdapter (val itemClickSeries: ItemClickSeries): ListAdapter<ResultPopularSeries,SeriesViewHolder>(DataDiffUtilSeries()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeriesViewHolder{
        return SeriesViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: SeriesViewHolder, position: Int) {
        var item = getItem (position)
        holder.itemView.setOnClickListener {
            itemClickSeries.onClick(item)
        }
        holder.bind(item)
    }
}

class DataDiffUtilSeries: DiffUtil.ItemCallback<ResultPopularSeries>(){
    override fun areItemsTheSame(oldItem: ResultPopularSeries, newItem: ResultPopularSeries): Boolean {
        return oldItem.id == newItem.id
    }
    override fun areContentsTheSame(oldItem: ResultPopularSeries, newItem: ResultPopularSeries): Boolean {
        return oldItem == newItem
    }
}

class SeriesViewHolder(view: View): RecyclerView.ViewHolder(view){
    val titleSeries = view.findViewById<TextView>(R.id.seriesTitle)
    val imageSeries= view.findViewById<ImageView>(R.id.seriesImage)

    companion object{
        fun from(parent: ViewGroup): SeriesViewHolder{
            val layoutInflater = LayoutInflater.from(parent.context)

            val view = layoutInflater.inflate(R.layout.series_cart,parent,false)

            return SeriesViewHolder(view)
        }
    }

    fun bind(item: ResultPopularSeries) {
        Picasso.get().load("https://image.tmdb.org/t/p/w500"+item.poster_path)
            .into(imageSeries)
        if (item.name.length>11){
            titleSeries.text=item.name.substring(0,11)+".."
        }
        else{
            titleSeries.text=item.name
        }
    }
}

class ItemClickSeries(val clickListener: (resultPopularSeries: ResultPopularSeries) -> Unit){
    fun onClick(item: ResultPopularSeries) = clickListener(item)
}