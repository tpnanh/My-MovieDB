package com.example.mymoviedb.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mymoviedb.data.model.ResultPopularPeople
import com.example.mymoviedb.R
import com.squareup.picasso.Picasso

class PeopleAdapter(val itemClickPeople: ItemClickPeople): ListAdapter<ResultPopularPeople,PeopleViewHolder>(DataDiffUtilPeople()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {
        return PeopleViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        var item = getItem(position)
        holder.itemView.setOnClickListener {
            itemClickPeople.onClick(item)
        }
        holder.bind(item)
    }
}

class DataDiffUtilPeople: DiffUtil.ItemCallback<ResultPopularPeople>(){
    override fun areItemsTheSame(oldItem: ResultPopularPeople, newItem: ResultPopularPeople): Boolean {
        return oldItem.id == newItem.id
    }
    override fun areContentsTheSame(oldItem: ResultPopularPeople, newItem: ResultPopularPeople): Boolean {
        return oldItem == newItem
    }
}

class PeopleViewHolder(view: View): RecyclerView.ViewHolder(view){
    val namePeople = view.findViewById<TextView>(R.id.peopleTitle)
    val imagePeople = view.findViewById<ImageView>(R.id.peopleImage)

    companion object{
        fun from(parent: ViewGroup): PeopleViewHolder{
            val layoutInflater = LayoutInflater.from(parent.context)

            val view = layoutInflater.inflate(R.layout.people_cart,parent,false)

            return PeopleViewHolder(view)
        }
    }

    fun bind(item: ResultPopularPeople) {
        Picasso.get().load("https://image.tmdb.org/t/p/w500"+item.profile_path)
            .into(imagePeople)
        if (item.name.length>11){
            namePeople.text=item.name.substring(0,11)+".."
        }
        else{
            namePeople.text=item.name
        }
    }
}

class ItemClickPeople(val clickListener: (resultPopularPeople: ResultPopularPeople) -> Unit){
    fun onClick(item: ResultPopularPeople) = clickListener(item)
}
