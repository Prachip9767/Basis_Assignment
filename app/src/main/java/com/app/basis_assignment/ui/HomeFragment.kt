package com.app.basis_assignment.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import com.app.basis_assignment.R
import com.app.basis_assignment.remote.response.Data
import com.app.basis_assignment.viewMoedel.AppViewModel
import com.application.sunstonekotlinassignment.data.Status

import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_home.*
import okhttp3.internal.notifyAll

import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var adapter: CardAdapter
    private lateinit var viewModel: AppViewModel
    private var emptyList = emptyList<Data>()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(AppViewModel::class.java)

        viewModel.getData().observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Status.ERROR -> {
                    Toast.makeText(context, "Check Internet Connection", Toast.LENGTH_SHORT).show()
                }
                Status.SUCCESS -> {
                    emptyList = it.data?.data as ArrayList<Data>
                    adapter = CardAdapter(emptyList)
                    recyclerViewHomeFrag.adapter=adapter
                    recyclerViewHomeFrag.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
                    recyclerViewHomeFrag.notifyAll()
                    PagerSnapHelper().attachToRecyclerView(recyclerViewHomeFrag)
                    val recyclerIndicator: ScrollingPagerIndicator = indicator
                    recyclerIndicator.attachToRecyclerView(recyclerViewHomeFrag)

                }
                Status.LOADING -> {
                    Toast.makeText(context, "Loading...", Toast.LENGTH_SHORT).show()
                }
            }
        })


    }

}