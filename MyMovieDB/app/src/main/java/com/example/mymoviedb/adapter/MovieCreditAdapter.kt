package com.example.mymoviedb.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mymoviedb.R
import com.example.mymoviedb.apiModels.CastDetail
import com.squareup.picasso.Picasso
import org.w3c.dom.Text

class MovieCreditAdapter (val peopleClick: PeopleClick): ListAdapter<CastDetail,MovieCreditViewHolder>(DataDiffUtilCredit()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieCreditViewHolder{
        return MovieCreditViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MovieCreditViewHolder, position: Int) {
        var item = getItem (position)
        holder.itemView.setOnClickListener {
            peopleClick.onClick(item)
        }
        holder.bind(item)
        holder.setIsRecyclable(false)
    }

}

class DataDiffUtilCredit: DiffUtil.ItemCallback<CastDetail>(){
    override fun areItemsTheSame(oldItem: CastDetail, newItem: CastDetail): Boolean {
        return oldItem.id == newItem.id
    }
    override fun areContentsTheSame(oldItem: CastDetail, newItem: CastDetail): Boolean {
        return oldItem == newItem
    }
}

class MovieCreditViewHolder(view: View): RecyclerView.ViewHolder(view){
    val imageCredit = view.findViewById<ImageView>(R.id.cast_image)
    val castName = view.findViewById<TextView>(R.id.tv_cast_name)

    companion object{
        fun from(parent: ViewGroup): MovieCreditViewHolder{
            val layoutInflater = LayoutInflater.from(parent.context)

            val view = layoutInflater.inflate(R.layout.movie_cast,parent,false)

            return MovieCreditViewHolder(view)
        }
    }

    fun bind(item: CastDetail) {
        if (item.profile_path!=null){
            Picasso.get().load("https://image.tmdb.org/t/p/w500"+item.profile_path)
                .into(imageCredit)
        }

        if (item.name.length>10){
            castName.text=item.name.substring(0,10)+".."
        }
        else{
            castName.text=item.name
        }
    }
}

class PeopleClick(val clickListener: (itemPeople : CastDetail) -> Unit){
    fun onClick(item: CastDetail) = clickListener(item)
}
