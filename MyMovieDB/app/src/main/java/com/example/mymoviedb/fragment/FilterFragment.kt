package com.example.mymoviedb.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.mymoviedb.R

class FilterFragment : Fragment() {
    private lateinit var buttonBack: ImageButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view : View = inflater.inflate(R.layout.filter_movie, container, false)
        buttonBack = view.findViewById(R.id.button_back_filter)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        buttonBack.setOnClickListener(View.OnClickListener {
            activity?.onBackPressed()
        })
    }

    companion object {
        fun newInstance(): SavedFragment = SavedFragment()
    }
}