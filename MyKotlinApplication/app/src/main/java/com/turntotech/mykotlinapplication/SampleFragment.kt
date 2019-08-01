package com.turntotech.mykotlinapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView




class SampleFragment : Fragment() {

    var text : String? = null

    var containerId = 0


    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_sample, container, false)

        val txtView = view.findViewById(R.id.textView) as TextView

        txtView.setText(text)

        val button= view.findViewById(R.id.button) as Button
        button.setOnClickListener {

              activity?.supportFragmentManager?.beginTransaction()?.remove(this)?.commit()

        }

        onHiddenChanged(false)

        return view

    }


    override fun onStop() {
        super.onStop()
        activity?.supportFragmentManager?.findFragmentById(containerId)?.onHiddenChanged(true)
    }


    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        activity?.title = text
    }


}
