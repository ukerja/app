package com.example.app.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v4.app.Fragment
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import com.example.app.R

class WithdrawFragment : Fragment() {

    private lateinit var withdrawViewModel: WithdrawViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        withdrawViewModel =
            ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            ).get(WithdrawViewModel::class.java)
        val root = inflater.inflate(R.layout.activity_withdraw, container, false)
        val textView: TextView = root.findViewById(R.id.text_withdraw)

        withdrawViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}