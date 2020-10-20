package com.example.mymoviedb.ui.people

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mymoviedb.adapter.ItemClickPeople
import com.example.mymoviedb.adapter.PeopleAdapter
import com.example.mymoviedb.R

class PeopleFragment : Fragment() {
    lateinit var adapterPeople: PeopleAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View = inflater!!.inflate(R.layout.fragment_people, container, false)
        var peopleGridView = view.findViewById<RecyclerView>(R.id.recycler_people)

        var viewModelPeople = ViewModelProviders.of(this).get(PeopleViewModel::class.java)

        peopleGridView.layoutManager = GridLayoutManager(activity, 3, GridLayoutManager.VERTICAL, false)


        adapterPeople = PeopleAdapter(ItemClickPeople { itemImage ->
            viewModelPeople.onClickItem(itemImage)
        })
        peopleGridView.adapter = adapterPeople

        viewModelPeople.navigateToDetailPeople.observe(this, Observer { it ->
            it?.let{
                Toast.makeText(context,it.name,Toast.LENGTH_LONG).show()
                viewModelPeople.onDoneClickItem()
            }
        })

        viewModelPeople.getPopularPeople.observe(viewLifecycleOwner, Observer { it ->
            adapterPeople.submitList(it)
            adapterPeople.notifyDataSetChanged()
        })

        peopleGridView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

                if (!recyclerView!!.canScrollVertically(1)) {
                    viewModelPeople.onReachBottomPeople()
                }
            }
        })

        return view
    }

    companion object {
        fun newInstance(): PeopleFragment = PeopleFragment()
    }

}