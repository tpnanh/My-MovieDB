package com.example.mymoviedb.ui.filter

import android.app.ProgressDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.nex3z.flowlayout.FlowLayout
import android.graphics.Color
import com.example.mymoviedb.ui.saved.SavedFragment

class FilterFragment : Fragment() {
    private lateinit var viewModel: FilterViewModel
    private lateinit var buttonBack: ImageButton
    private lateinit var flow: FlowLayout
    private lateinit var progressDialog: ProgressDialog

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        progressDialog = ProgressDialog(context)
        progressDialog.setMessage("Loading, please wait...")
        progressDialog.setCancelable(false)
        progressDialog.setCanceledOnTouchOutside(true)
        progressDialog.setInverseBackgroundForced(false)
        progressDialog.show()

        var view : View = inflater.inflate(com.example.mymoviedb.R.layout.filter_movie, container, false)

        buttonBack = view.findViewById(com.example.mymoviedb.R.id.button_back_filter)
        flow = view.findViewById(com.example.mymoviedb.R.id.flow_layout)

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FilterViewModel::class.java)

        buttonBack.setOnClickListener(View.OnClickListener {
            activity?.onBackPressed()
        })

        viewModel.getFilterGenres.observe(viewLifecycleOwner, Observer { it->
            for ( i in 0..it.size-1){
                val button_dynamic = Button(context)
                button_dynamic.text = it[i]
                button_dynamic.setBackgroundResource(com.example.mymoviedb.R.drawable.button_default)
                flow.addView(button_dynamic)
                var checkButton: Boolean = true
                button_dynamic.setOnClickListener(View.OnClickListener {
                    //not selected
                    if (checkButton){
                        button_dynamic.setBackgroundResource(com.example.mymoviedb.R.drawable.button_custom)
                        button_dynamic.setTextColor(Color.WHITE)
                        checkButton = false
                    }
                    //selected
                    else{
                        button_dynamic.setBackgroundResource(com.example.mymoviedb.R.drawable.button_default)
                        button_dynamic.setTextColor(Color.BLACK)
                        checkButton = true
                    }
                })
            }
            progressDialog.dismiss()
        })
    }

    companion object {
        fun newInstance(): SavedFragment = SavedFragment()
    }
}