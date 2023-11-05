package com.example.my.deliveryapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.my.deliveryapp.databinding.ItemBurgerBinding
import com.example.my.deliveryapp.model.BurgerModel

class BurgerAdapter(private var list: ArrayList<BurgerModel>) :
    Adapter<BurgerAdapter.BurgerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BurgerViewHolder {
        return BurgerViewHolder(
            ItemBurgerBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BurgerViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class BurgerViewHolder(private val binding: ItemBurgerBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(burger: BurgerModel) {
            burger.image?.let { img ->
                binding.imgBurger.setImageResource(img)
            }
            binding.tvBurger.text = burger.name
        }
    }

}
