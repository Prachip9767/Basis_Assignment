package com.app.basis_assignment.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.app.basis_assignment.R
import com.app.basis_assignment.databinding.ItemLayoutBinding
import com.app.basis_assignment.remote.response.Data

class CardAdapter(
    val resultModelList: List<Data>,
) : RecyclerView.Adapter<NewMoviesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewMoviesViewHolder {
        val itemLayoutBinding: ItemLayoutBinding =
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_layout, parent, false
            )
        return NewMoviesViewHolder(itemLayoutBinding)
    }

    override fun onBindViewHolder(holder: NewMoviesViewHolder, position: Int) {
        val resultModel = resultModelList[position]
        holder.setData(resultModel)


    }

    override fun getItemCount(): Int {
        return resultModelList.size
    }
}

class NewMoviesViewHolder(
    val itemLayoutBinding: ItemLayoutBinding,
) :
    RecyclerView.ViewHolder(itemLayoutBinding.root) {

    fun setData(data: Data) {
        itemLayoutBinding.apply {
            ivImage.text = data.id
            ivTittle.text=data.text

        }


    }


}
