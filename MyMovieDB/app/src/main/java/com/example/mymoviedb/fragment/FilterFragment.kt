package com.example.mymoviedb.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.mymoviedb.viewModel.FilterViewModel
import com.nex3z.flowlayout.FlowLayout
import android.R

class FilterFragment : Fragment() {
    private lateinit var viewModel: FilterViewModel
    private lateinit var buttonBack: ImageButton
    private lateinit var buttonGenres: Button
    private lateinit var layout: LinearLayout
    private lateinit var flow: FlowLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view : View = inflater.inflate(com.example.mymoviedb.R.layout.filter_movie, container, false)

//        layout = view.findViewById(com.example.mymoviedb.R.id.ll_layout)
//        flow = view.findViewById(com.example.mymoviedb.R.id.flow_layout) as FlowLayout
        buttonBack = view.findViewById(com.example.mymoviedb.R.id.button_back_filter)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FilterViewModel::class.java)

        buttonBack.setOnClickListener(View.OnClickListener {
            activity?.onBackPressed()
        })

       // viewModel.getFilterGenres.observe(viewLifecycleOwner, Observer { it->
            //val mInflater = LayoutInflater.from(context)
           // for (i in it){
                //var buttonGenres = mInflater.inflate(com.example.mymoviedb.R.layout.filter_movie, flow, false)
                //buttonGenres = Button(context)
//                buttonGenres.setLayoutParams(
//                    LinearLayout.LayoutParams(
//                        LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT
//                    )
//                )

            // creating the button
//            val button = Button(context)
//            // setting layout_width and layout_height using layout parameters
//            button.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
//            button.text = "WELCOME TO GFG"
//
//            // add Button to LinearLayout
//            //layout.addView(button)
////            buttonGenres.text = "e"
//////                layout.addView(buttonGenres)
//             flow.addView(buttonGenres)
            //}
       // })
    }

    companion object {
        fun newInstance(): SavedFragment = SavedFragment()
    }
}