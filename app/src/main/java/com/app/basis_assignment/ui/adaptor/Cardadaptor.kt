package com.app.basis_assignment.ui.adaptor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.app.basis_assignment.R
import com.app.basis_assignment.databinding.ItemLayoutBinding

import com.app.basis_assignment.remote.data.Data

class AppAdapter(
    private val resultList: List<Data>,
) : RecyclerView.Adapter<AppViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {

        val itemLayoutBinding: ItemLayoutBinding =
            DataBindingUtil.inflate(LayoutInflater.from(parent.context),
                R.layout.item_layout, parent, false)

        return AppViewHolder(itemLayoutBinding)
    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        val listData = resultList[position]
        holder.setData(listData)
    }

    override fun getItemCount(): Int {
        return resultList.size
    }
}

class AppViewHolder(
    private val itemLayoutBinding: ItemLayoutBinding,
) : RecyclerView.ViewHolder(itemLayoutBinding.root) {


    fun setData(data: Data) {
        itemLayoutBinding.tvid.text = data.text
        itemLayoutBinding.tvText.text = data.id
    }

}
