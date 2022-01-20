package com.app.basis_assignment.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.app.basis_assignment.R
import com.app.basis_assignment.ui.adaptor.AppAdapter
import com.app.basis_assignment.remote.data.Data
import com.app.basis_assignment.ui.viewmodel.AppViewModel
import com.app.basis_assignment.remote.Status
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import me.relex.circleindicator.CircleIndicator3


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var appViewModel: AppViewModel
    private var datalist = emptyList<Data>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appViewModel = ViewModelProvider(this).get(AppViewModel::class.java)

        appViewModel.getData().observe(this, {
            when (it.status) {
                Status.SUCCESS -> {
                    datalist = it.data?.data!!
                    val adaptor = AppAdapter(datalist)
                    viewPager.adapter = adaptor
                    val indicator = findViewById<CircleIndicator3>(R.id.indicator)
                    indicator.setViewPager(viewPager)
                }
                Status.ERROR -> {
                Toast.makeText(this, "Check Internet Connection", Toast.LENGTH_SHORT).show()
            }
            }
        })
    }
}