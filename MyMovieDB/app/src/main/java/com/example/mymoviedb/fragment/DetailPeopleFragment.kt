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
import com.example.mymoviedb.adapter.ItemClick
import com.example.mymoviedb.adapter.MovieAdapter
import com.example.mymoviedb.adapter.MovieCreditAdapter
import com.example.mymoviedb.apiModels.DetailPeople
import com.example.mymoviedb.apiModels.MovieById
import com.example.mymoviedb.apiModels.ResultPropertyPopularMovie
import com.example.mymoviedb.viewModel.DetailMovieViewModel
import com.example.mymoviedb.viewModel.DetailPeopleViewModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.movie_cart.*

class DetailPeopleFragment : Fragment() {
    companion object {
        fun newInstance() = DetailPeopleFragment()
    }

    private lateinit var viewModel: DetailPeopleViewModel
    private lateinit var peopleImage: ImageView
    private lateinit var peopleName: TextView
    private lateinit var peopleBirthPlace: TextView
    private lateinit var peopleBirth: TextView
    private lateinit var peopleBio: TextView
    private lateinit var backButton: ImageButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view : View = inflater.inflate(R.layout.fragment_people_detail, container, false)

        peopleImage = view.findViewById(R.id.iv_profile_path)
        peopleName = view.findViewById(R.id.tv_person_name)
        peopleBirthPlace = view.findViewById(R.id.tv_birthplace)
        peopleBirth = view.findViewById(R.id.tv_birth)
        peopleBio = view.findViewById(R.id.tv_bio)
        backButton = view.findViewById(R.id.button_back_people)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DetailPeopleViewModel::class.java)

        val idItem = DetailPeopleFragmentArgs.fromBundle(arguments!!).idPeople
        viewModel._idPeople.value = idItem

        viewModel.itemPeople.observe(viewLifecycleOwner, Observer { it ->
            if (it!=null){
                if (it.id == idItem){
                    updateDetailPerson(it)
                    viewModel.onDoneUpdatePeople()
                }
            }
        })
        backButton.setOnClickListener(View.OnClickListener {
            activity?.onBackPressed()
        })
    }

    private fun updateDetailPerson(item: DetailPeople){
        if (item.profile_path!=null){
            Picasso.get().load("https://image.tmdb.org/t/p/w500"+item.profile_path)
                .into(peopleImage)
        }
        peopleName.text = item.name
        if (item.place_of_birth!=null){
            peopleBirthPlace.text = "Place of Birth: " + item.place_of_birth
        }
        if (item.birthday!=null){
            peopleBirth.text = "Birthday: "+item.birthday
        }
        peopleBio.text = item.biography
    }
}
