package com.example.my.deliveryapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.my.deliveryapp.databinding.ItemMenuBinding
import com.example.my.deliveryapp.model.DetailsModel

class DetailsAdapter(
    private val list: ArrayList<DetailsModel>,
    private val onClick: (details: DetailsModel) -> Unit
) : RecyclerView.Adapter<DetailsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemMenuBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(private val binding: ItemMenuBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(details: DetailsModel) {
            details.image?.let { binding.ImageViewBurger.setImageResource(it) }
            binding.TextViewBurgerCraze.text = details.header
            binding.TextViewAdresKm.text = details.timer

            itemView.setOnClickListener {
                onClick(details)
            }
        }
    }

}